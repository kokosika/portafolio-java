package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ProveedorDto;
import com.serviexpress.servicios.interfaces.common.IProveedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de los proveedores.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "proveedor")
public class ProveedorRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IProveedorService
     */
    private IProveedorService proveedorService;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param proveedorService injeccion del repositorio IProveedorService para la utilizacion de sus metodos.
     */
    public ProveedorRestController(IProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    /**
     * Metodo post que ejecuta al metodo guardarProveedor de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para almacenar a un cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo proveedor que se utilizara para almacenar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PostMapping
    public ResponseEntity<GenericResponse> guardarProveedor(@RequestBody ProveedorDto dto) {
        return this.proveedorService.guardarProveedor(dto);
    }

    /**
     * Metodo put que ejecuta al metodo editarProveedor de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para modificar a un proveedor
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo proveedor que se utilizara para modificar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PutMapping
    public ResponseEntity<GenericResponse> editarProveedor(@RequestBody ProveedorDto dto) {
        return this.proveedorService.editarProveedor(dto);
    }

    /**
     * Metodo delete que ejecuta al metodo eliminarProveedor de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para eliminar a un proveedor
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param proveedorId       id del proveedor.
     * @param estadoProveedorId id del estado el proveedor.
     * @return retorna una respuesta al cliente.
     */
    @DeleteMapping
    public ResponseEntity<GenericResponse> eliminarProveedor(Integer proveedorId, Integer estadoProveedorId) {
        return this.proveedorService.eliminarProveedor(proveedorId, estadoProveedorId);
    }

    /**
     * Metodo get que ejecuta al metodo obtenerTodosLosProveedores de la capa de negocio
     * retorna una llamada http del http status de la clase generic response
     * Se utilizara para listar todos los proveedores
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta al cliente.
     */
    @GetMapping()
    public ResponseEntity<GenericResponse> obtenerTodosLosProveedores() {
        return this.proveedorService.obtenerTodosLosProveedores();
    }
}


