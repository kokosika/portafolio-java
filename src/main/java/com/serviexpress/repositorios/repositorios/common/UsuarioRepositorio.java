package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.custom.UsuarioDto;
import com.serviexpress.dto.util.IntegerDto;
import com.serviexpress.repositorios.context.UsuarioContext;
import com.serviexpress.repositorios.interfaces.common.IUsuarioRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Repositorio encargado de gestionar las operaciones de los usuarios dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IUsuarioRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
@Repository
@EnableAutoConfiguration
@Transactional
@Component
public class UsuarioRepositorio extends BaseRepositorio<UsuarioContext> implements IUsuarioRepositorio {
    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public UsuarioRepositorio(UsuarioContext context) {
        super(context);
    }

    /**
     * Metodo para validar el login
     * Llama al procedimiento PRC_VALIDAR_LOGIN
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param usuarioDto objecto usuario
     * @return boolean
     */
    @Override
    public boolean validacionLogin(UsuarioDto usuarioDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("NOMBRE_USUARIO", usuarioDto.getNombre());
        params.put("PASS", usuarioDto.getContracena());
        IntegerDto data = (IntegerDto) executeList(IntegerDto.class, "PRC_VALIDAR_LOGIN", params).get(0);
        return data.getData() != 0;
    }

    /**
     * Metodo para guardar usuarios en la base de datos.
     * Llama al procedimiento PRC_INS_USUARIO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param usuarioDto objecto usuario que se almacenara en la base de datos.
     */
    @Override
    public void guardarUsuario(UsuarioDto usuarioDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_CONTRACENA", usuarioDto.getContracena());
        params.put("V_NOMBRE", usuarioDto.getNombre());
        params.put("V_ESTADO_USUARIO_ID", usuarioDto.getEstadoUsuarioId());
        params.put("V_PERSONA_ID", usuarioDto.getPersonaId());
        params.put("V_SUCURSAL_ID", usuarioDto.getSucursalId());
        params.put("V_TIPO_USUARIO_ID", usuarioDto.getTipoUsuarioId());
        execute("PRC_INS_USUARIO", params);
    }

    /**
     * Metodo para modificar usuarios en la base de datos.
     * Llama al procedimiento PRC_UDT_USUARIO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param usuarioDto objecto usuario que se modificara en la base de datos.
     */
    public void editarUsuario(UsuarioDto usuarioDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_USUARIO_ID", usuarioDto.getId());
        params.put("V_CONTRACENA", usuarioDto.getContracena());
        params.put("V_NOMBRE", usuarioDto.getNombre());
        params.put("V_ESTADO_USUARIO_ID", usuarioDto.getEstadoUsuarioId());
        params.put("V_PERSONA_ID", usuarioDto.getPersonaId());
        params.put("V_SUCURSAL_ID", usuarioDto.getSucursalId());
        params.put("V_TIPO_USUARIO_ID", usuarioDto.getTipoUsuarioId());
        execute("PRC_UDT_USUARIO", params);
    }

    /**
     * Metodo para eliminar usuarios en la base de datos.
     * Llama al procedimiento PRC_DEL_USUARIO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param usuarioId       id del usuario.
     * @param estadoUsuarioId id del estado de usuario.
     */
    public void eliminarUsuario(Integer usuarioId, Integer estadoUsuarioId) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_USUARIO_ID", usuarioId);
        params.put("V_ESTADO_USUARIO_ID", estadoUsuarioId);
        execute("PRC_DEL_USUARIO", params);
    }

    /**
     * Metodo especifico para la autenticacion de spring security
     * Obtiene un usuario a travez de su nombre de usuario.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param nombre nombre de usuario
     * @return objecto usuario que rotarna la base de datos
     */
    @SuppressWarnings("unchecked")
    public UsuarioDto obtenerUsuarioPorNombre(String nombre) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_NOMBRE", nombre);
        List<UsuarioDto> list = (List<UsuarioDto>) executeList(UsuarioDto.class, "PRC_LOGIN_SPRING", params);
        if (list.isEmpty())
            return null;
        return list.get(0);
    }
}
