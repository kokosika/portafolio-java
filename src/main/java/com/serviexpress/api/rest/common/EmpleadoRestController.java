package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.EmpleadoDto;
import com.serviexpress.servicios.interfaces.common.IEmpleadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de los empleados.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "empleado")
public class EmpleadoRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IEmpleadoService
     */
    private IEmpleadoService empleadoService;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param empleadoService injeccion del repositorio IEmpleadoService para la utilizacion de sus metodos.
     */
    public EmpleadoRestController(IEmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    /**
     * Metodo post que ejecuta al metodo guardarEmpleado de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para almacenar a un empleado
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo empleado que se utilizara para almacenar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PostMapping
    public ResponseEntity<GenericResponse> guardarEmpleado(@RequestBody EmpleadoDto dto) {
        return this.empleadoService.guardarEmpleado(dto);
    }

    /**
     * Metodo put que ejecuta al metodo editarEmpleado de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para editar a un empleado
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo empleado que se utilizara para modificar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PutMapping
    public ResponseEntity<GenericResponse> editarEmpleado(@RequestBody EmpleadoDto dto) {
        return this.empleadoService.editarEmpleado(dto);
    }

    /**
     * Metodo delete que ejecuta al metodo eliminarEmpleado de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para eliminar a un empleado
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param empleadoId       id del empleado.
     * @param estadoEmpleadoId id del estado del empleado.
     * @return retorna una respuesta al cliente.
     */
    @DeleteMapping
    public ResponseEntity<GenericResponse> eliminarEmpleado(Integer empleadoId, Integer estadoEmpleadoId) {
        return this.empleadoService.eliminarEmpleado(empleadoId, estadoEmpleadoId);
    }

    /**
     * Metodo get que ejecuta al metodo obtenerTodosLosEmpleados de la capa de negocio
     * retorna una llamada http del http status de la clase generic response
     * Se utilizara para listar todos los empleados
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta al cliente.
     */
    @GetMapping()
    public ResponseEntity<GenericResponse> obtenerTodosLosEmpleados() {
        return this.empleadoService.obtenerTodosLosEmpleados();
    }
}


