package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ProveedorDto;
import com.serviexpress.repositorios.interfaces.common.IProveedorRepositorio;
import com.serviexpress.servicios.interfaces.common.IProveedorService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Clase base para la generacion de servicios de los proveedores dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IProveedorService que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class ProveedorService extends BaseServicios implements IProveedorService {

    /**
     * Injeccion de repositorio de clientes para llamar a sus metodos de acceso a datos.
     */
    private IProveedorRepositorio proveedorRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param proveedorRepositorio injeccion del repositorio IProveedorRepositorio para la utilizacion de sus metodos.
     */
    public ProveedorService(IProveedorRepositorio proveedorRepositorio) {
        this.proveedorRepositorio = proveedorRepositorio;
    }

    /**
     * Metodo que llama al metodo guardarProveedor de la interfaz IProveedorRepositorio para almacenar datos
     * del proveedor.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo proveedor que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> guardarProveedor(ProveedorDto dto) {
        try {
            this.proveedorRepositorio.guardarProveedor(dto);
            return ok("Exito", "El proveedor fue registrado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

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
    @Override
    public ResponseEntity<GenericResponse> editarProveedor(ProveedorDto dto) {
        try {
            this.proveedorRepositorio.editarProveedor(dto);
            return ok("Exito", "El proveedor fue modificado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

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
    @Override
    public ResponseEntity<GenericResponse> eliminarProveedor(Integer proveedorId, Integer estadoProveedorId) {
        try {
            this.proveedorRepositorio.eliminarProveedor(proveedorId, estadoProveedorId);
            return ok("Exito", "El proveedor fue eliminado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo buscarClientePorRut de la interfaz IProveedorRepositorio para traer
     * todos los proveedores de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> obtenerTodosLosProveedores() {
        try {
            return ok(this.proveedorRepositorio.obtenerTodosLosProveedores());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

}
