package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.common.ClienteCustomDto;
import com.serviexpress.dto.custom.ClienteDto;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.repositorios.context.ClienteContext;
import com.serviexpress.repositorios.interfaces.common.IClienteRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;


/**
 * Repositorio encargado de gestionar las operaciones de los clientes dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IClienteRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class ClienteRepositorio extends BaseRepositorio<ClienteContext> implements IClienteRepositorio {

    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public ClienteRepositorio(ClienteContext context) {
        super(context);
    }

    /**
     * Metodo que registra a un cliente en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteDto objeto de tipo cliente para registrar en la base de datos.
     */
    @Override
    public void guardarCliente(ClienteDto clienteDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("ESTADO_CLIENTE", clienteDto.getEstadoClienteId());
        params.put("PERSONA_ID", clienteDto.getPersonaId());
        params.put("SUCURSAL_ID", clienteDto.getSucursalId());
        execute("PRC_INS_CLIENTE", params);
    }

    /**
     * Metodo que modifica a un cliente en la base de datos.
     * Llama al procedimiento almacenado PRC_UDT_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteDto objeto de tipo cliente para modificar en la base de datos.
     */
    @Override
    public void editarCliente(ClienteDto clienteDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("CLIENTE_ID", clienteDto.getId());
        params.put("ESTADO_CLIENTE", clienteDto.getEstadoClienteId());
        params.put("PERSONA_ID", clienteDto.getPersonaId());
        params.put("SUCURSAL_ID", clienteDto.getSucursalId());
        execute("PRC_UDT_CLIENTE", params);
    }

    /**
     * Metodo que elimina a un cliente en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteId       variable de tipo id del cliente.
     * @param estadoClienteId variable de tipo id del estado de la persona.
     */
    @Override
    public void eliminarCliente(Integer clienteId, Integer estadoClienteId) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("CLIENTE_ID", clienteId);
        params.put("ESTADO_CLIENTE_ID", estadoClienteId);
        execute("PRC_DEL_CLIENTE", params);
    }

    /**
     * Metodo para obtener el id del cliente por su rut
     * Llama al procedimiento almacenado PRC_BUSCAR_CLIENTE_X_RUT
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objecto de tipo persona que servira como filtro de la busqueda.
     * @return retorna el id del cliente
     */
    @SuppressWarnings("unchecked")
    @Override
    public ClienteDto buscarClientePorRut(PersonaDto personaDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_NUM_ID", personaDto.getNumId());
        params.put("V_DIV_ID", personaDto.getDivId());
        List<ClienteDto> list = (List<ClienteDto>) executeList(ClienteDto.class, "PRC_BUSCAR_CLIENTE_X_RUT", params);
        if (list.isEmpty())
            return null;
        return list.get(0);
    }

    /**
     * Metodo un listado de todos los clientes con todas las columnas.
     * Llama al procedimiento almacenado PRC_LISTAR_CLIENTES
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna el todos los campos del cliente.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<ClienteCustomDto> obtenerTodosLosClientes() {
        return (List<ClienteCustomDto>) executeList(ClienteCustomDto.class, "PRC_LISTAR_CLIENTES");
    }

}
