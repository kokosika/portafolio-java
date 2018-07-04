package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ClienteDto;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.servicios.interfaces.common.IClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de los clientes.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "cliente")
public class ClienteRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IClienteService
     */
    private IClienteService clienteService;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param clienteService injeccion del repositorio IClienteService para la utilizacion de sus metodos.
     */
    public ClienteRestController(IClienteService clienteService) {
        this.clienteService = clienteService;
    }

    /**
     * Metodo post que ejecuta al metodo guardarCliente de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para almacenar a un cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo cliente que se utilizara para almacenar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PostMapping
    public ResponseEntity<GenericResponse> guardarCliente(@RequestBody ClienteDto dto) {
        return this.clienteService.guardarCliente(dto);
    }

    /**
     * Metodo put que ejecuta al metodo editarCliente de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para modificar a un cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo cliente que se utilizara para almacenar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PutMapping
    public ResponseEntity<GenericResponse> editarCliente(@RequestBody ClienteDto dto) {
        return this.clienteService.editarCliente(dto);
    }

    /**
     * Metodo delete que ejecuta al metodo editarCliente de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para eliminar a un cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param clienteId       id del cliente
     * @param estadoClienteId id del estado del cliente
     * @return retorna una respuesta al cliente.
     */
    @DeleteMapping
    public ResponseEntity<GenericResponse> eliminarCliente(Integer clienteId, Integer estadoClienteId) {
        return this.clienteService.eliminarCliente(clienteId, estadoClienteId);
    }

    /**
     * Metodo get que ejecuta al metodo buscarClientePorRut de la capa de negocio
     * retorna una llamada http del http status de la clase generic response
     * Se utilizara para buscar el id de un cliente.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param numId objeto de tipo Integer que almacena el numero del rut que se utilizara como filtro de busqueda.
     * @param divId objecto de tipo String que almacena el digito verificador del rut que se utilizara como filtro de busqueda.     *
     * @return retorna una respuesta al cliente.
     */
    @GetMapping(value = "/buscar-cliente-por-rut")
    public ResponseEntity<GenericResponse> buscarClientePorRut(Integer numId, String divId) {
        PersonaDto personaDto = new PersonaDto();
        personaDto.setDivId(divId);
        personaDto.setNumId(numId);
        return this.clienteService.buscarClientePorRut(personaDto);
    }

    /**
     * Metodo get que ejecuta al metodo obtenerTodosLosClientes de la capa de negocio
     * retorna una llamada http del http status de la clase generic response
     * Se utilizara listar todos los clientes.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta al cliente.
     */
    @GetMapping()
    public ResponseEntity<GenericResponse> obtenerTodosLosClientes() {
        return this.clienteService.obtenerTodosLosClientes();
    }

    @GetMapping(value = "/buscar-cliente-por-nombre")
    public ResponseEntity<GenericResponse> buscarClientePorId(String nombre) {
        return this.clienteService.buscarClientePorId(nombre);
    }
}


