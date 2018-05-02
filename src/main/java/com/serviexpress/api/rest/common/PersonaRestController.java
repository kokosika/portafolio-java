package com.serviexpress.api.rest.common;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.servicios.interfaces.common.IPersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.serviexpress.config.ApiPathConfig.PATH;

/**
 * Clase que almacena la base de los servicios de las personas.
 * Hereda de la clase BaseRest que contiene logica encapsulada.
 * <p>
 * 1.0 Franco Cortez - Version incial.
 */
@RestController
@RequestMapping(value = PATH + "persona")
public class PersonaRestController extends BaseRest {

    /**
     * Injeccion de la capa servicios con el bean IPersonaService
     */
    private IPersonaService personaService;

    /**
     * Injeccion de repositorios dentro del controlador
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaService injeccion del repositorio IPersonaService para la utilizacion de sus metodos.
     */
    public PersonaRestController(IPersonaService personaService) {
        this.personaService = personaService;
    }

    /**
     * Metodo post que ejecuta al metodo guardarPersona de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para almacenar a un cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo persona que se utilizara para almacenar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PostMapping
    public ResponseEntity<GenericResponse> guardarPersona(@RequestBody PersonaDto dto) {
        return this.personaService.guardarPersona(dto);
    }

    /**
     * Metodo put que ejecuta al metodo editarPersona de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para modificar a una persona
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo persona que se utilizara para modificar en la base de datos.
     * @return retorna una respuesta al cliente.
     */
    @PutMapping
    public ResponseEntity<GenericResponse> editarPersona(@RequestBody PersonaDto dto) {
        return this.personaService.editarPersona(dto);
    }

    /**
     * Metodo delete que ejecuta al metodo editarPersona de la capa de negocio
     * retorna una llamada http del http status clase GenericResponse.
     * Se utilizara para modificar a una persona
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaId id de la persona.
     * @param estadoPersonaId id del estado de la persona.
     * @return retorna una respuesta al cliente.
     */
    @DeleteMapping
    public ResponseEntity<GenericResponse> editarPersona(Integer personaId, Integer estadoPersonaId) {
        return this.personaService.elimnarPersona(personaId, estadoPersonaId);
    }

    /**
     * Metodo get que ejecuta al metodo buscarPersonaPorRut de la capa de negocio
     * retorna una llamada http del http status de la clase generic response
     * Se utilizara para buscar una persona.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param numId objeto de tipo Integer que almacena el numero del rut que se utilizara como filtro de busqueda.
     * @param divId objecto de tipo String que almacena el digito verificador del rut que se utilizara como filtro de busqueda.     *
     * @return retorna una respuesta al cliente.
     */
    @GetMapping(value = "/buscar-persona-por-rut")
    public ResponseEntity<GenericResponse> buscarPersonaPorRut(Integer numId, String divId) {
        PersonaDto personaDto = new PersonaDto();
        personaDto.setDivId(divId);
        personaDto.setNumId(numId);
        return this.personaService.buscarPersonaPorRut(personaDto);
    }

}

