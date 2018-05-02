package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.VehiculoDto;
import com.serviexpress.servicios.interfaces.common.IVehiculoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de los vehiculos de los clientes.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "vehiculo")
public class VehiculoRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IVehiculoService
     */
    private IVehiculoService vehiculoService;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoService injeccion del repositorio IVehiculoService para la utilizacion de sus metodos.
     */
    public VehiculoRestController(IVehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    /**
     * Metodo post que ejecuta al metodo guardarVehiculo de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para almacenar a un vehiculo
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoDto objeto de tipo vehiculo que se utilizara para almacenar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PostMapping
    public ResponseEntity<GenericResponse> guardarVehiculo(@RequestBody VehiculoDto vehiculoDto) {
        return this.vehiculoService.guardarVehiculo(vehiculoDto);
    }

    /**
     * Metodo put que ejecuta al metodo editarVehiculo de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para modificar un vehiculo
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoDto objeto de tipo vehiculo que se utilizara para modificar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PutMapping
    public ResponseEntity<GenericResponse> editarVehiculo(@RequestBody VehiculoDto vehiculoDto) {
        return this.vehiculoService.editarVehiculo(vehiculoDto);
    }

    /**
     * Metodo delete que ejecuta al metodo eliminarVehiculo de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para eliminar un vehiculo
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoId id del vehiculo.
     * @param estadoVehiculoId id del estado del vehiculo.
     * @return retorna una respuesta al cliente.
     */
    @DeleteMapping
    public ResponseEntity<GenericResponse> eliminarVehiculo(Integer vehiculoId, Integer estadoVehiculoId) {
        return this.vehiculoService.eliminarVehiculo(vehiculoId, estadoVehiculoId);
    }

    /**
     * Metodo get que ejecuta al metodo buscarVehiculosPorIdCliente de la capa de negocio
     * retorna una llamada http del http status de la clase generic response
     * Se utilizara para buscar todos los vehiculos asociados a un cliente.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param data id del cliente como filtro de busqueda.
     * @return retorna una respuesta al cliente.
     */
    @GetMapping(value = "/buscar-por-cliente")
    public ResponseEntity<GenericResponse> buscarVehiculosPorIdCliente(Integer data) {
        return this.vehiculoService.buscarVehiculosPorIdCliente(data);
    }
}
