package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.common.ProveedorCustomDto;
import com.serviexpress.dto.custom.ProveedorDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

/**
 * Interface base de la logica de proveedor dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IProveedorRepositorio extends IBaseRepositorio {

    /**
     * Metodo que registra a un proveedor en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param dto objeto de tipo proveedor para registrar en la base de datos.
     */
    public void guardarProveedor(ProveedorDto dto);

    /**
     * Metodo que modifica a un proveedor en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_PRC_UDT_PROVEEDORCLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param dto objeto de tipo proveedor para registrar en la base de datos.
     */
    public void editarProveedor(ProveedorDto dto);

    /**
     * Metodo que eliminar a un proveedor en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_PROVEEDOR
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param proveedorId       id del proveedor.
     * @param estadoProveedorId id del estado del proveedor.
     */
    public void eliminarProveedor(Integer proveedorId, Integer estadoProveedorId);

    /**
     * Metodo un listado de todos los proveedores con todas las columnas.
     * Llama al procedimiento almacenado PRC_LISTAR_CLIENTES
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna el todos los campos del proveedor.
     */
    public List<ProveedorCustomDto> obtenerTodosLosProveedores();

}
