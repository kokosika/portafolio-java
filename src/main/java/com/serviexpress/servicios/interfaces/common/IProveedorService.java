package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ProveedorDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase ProveedorService
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IProveedorService extends IBaseServicios {

    /**
     * Metodo que llama al metodo guardarProveedor de la interfaz IProveedorRepositorio para almacenar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo proveedor que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> guardarProveedor(ProveedorDto dto);

    /**
     * Metodo que llama al metodo editarProveedor de la interfaz IProveedorRepositorio para modificar datos
     * del proveedores.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo proveedor que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> editarProveedor(ProveedorDto dto);

    /**
     * Metodo que llama al metodo eliminarProveedor de la interfaz IProveedorRepositorio para eliminar proveedores
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param proveedorId       id del proveedor.
     * @param estadoProveedorId id del estado del proveedor.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> eliminarProveedor(Integer proveedorId, Integer estadoProveedorId);

    /**
     * Metodo que llama al metodo buscarClientePorRut de la interfaz IProveedorRepositorio para traer
     * todos los proveedores de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> obtenerTodosLosProveedores();

}
