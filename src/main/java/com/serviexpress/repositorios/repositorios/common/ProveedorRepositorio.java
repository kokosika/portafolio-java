package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.common.ProveedorCustomDto;
import com.serviexpress.dto.custom.ProveedorDto;
import com.serviexpress.repositorios.context.ProveedorContext;
import com.serviexpress.repositorios.interfaces.common.IProveedorRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;


/**
 * Repositorio encargado de gestionar las operaciones de los proveedores dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IProveedorRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class ProveedorRepositorio extends BaseRepositorio<ProveedorContext> implements IProveedorRepositorio {

    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public ProveedorRepositorio(ProveedorContext context) {
        super(context);
    }

    /**
     * Metodo que registra a un proveedor en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param dto objeto de tipo proveedor para registrar en la base de datos.
     */
    @Override
    public void guardarProveedor(ProveedorDto dto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_ESTADO_PROVEEDOR_ID", dto.getEstadoProveedorId());
        params.put("V_TIPO_PROVEEDOR_ID", dto.getTipoProveedorId());
        params.put("V_PERSONA_ID", dto.getPersonaId());
        execute("PRC_INS_PROVEEDOR", params);
    }

    /**
     * Metodo que modifica a un proveedor en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_PRC_UDT_PROVEEDORCLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param dto objeto de tipo proveedor para registrar en la base de datos.
     */
    @Override
    public void editarProveedor(ProveedorDto dto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_PROVEEDOR_ID", dto.getId());
        params.put("V_ESTADO_PROVEEDOR_ID", dto.getEstadoProveedorId());
        params.put("V_TIPO_PROVEEDOR_ID", dto.getTipoProveedorId());
        params.put("V_PERSONA_ID", dto.getPersonaId());
        execute("PRC_UDT_PROVEEDOR", params);
    }

    /**
     * Metodo que eliminar a un proveedor en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_PROVEEDOR
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param proveedorId       id del proveedor.
     * @param estadoProveedorId id del estado del proveedor.
     */
    @Override
    public void eliminarProveedor(Integer proveedorId, Integer estadoProveedorId) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_PROVEEDOR_ID", proveedorId);
        params.put("V_ESTADO_PROVEEDOR_ID", estadoProveedorId);
        execute("PRC_DEL_PROVEEDOR", params);
    }

    /**
     * Metodo un listado de todos los proveedores con todas las columnas.
     * Llama al procedimiento almacenado PRC_LISTAR_PROVEEDORES
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna el todos los campos del proveedor.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<ProveedorCustomDto> obtenerTodosLosProveedores() {
        return (List<ProveedorCustomDto>) executeList(ProveedorCustomDto.class, "PRC_LISTAR_PROVEEDORES");
    }

}
