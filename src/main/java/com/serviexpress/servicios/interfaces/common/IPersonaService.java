package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase PersonaService
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IPersonaService extends IBaseServicios {

    /**
     * Metodo que llama al metodo guardarPersona de la interfaz IPersonaRepositorio para almacenar datos
     * de la persona.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo persona que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> guardarPersona(PersonaDto dto);

    /**
     * Metodo que llama al metodo editarPersona de la interfaz IPersonaRepositorio para modificar datos
     * de la persona.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo persona que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> editarPersona(PersonaDto dto);

    /**
     * Metodo que llama al metodo elimnarPersona de la interfaz IPersonaRepositorio para eliminar datos
     * de la persona.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaId id de la persona.
     * @param estadoPersonaId id del estado de la persona.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> elimnarPersona(Integer personaId, Integer estadoPersonaId);

    /**
     * Metodo que llama al metodo buscarPersonaPorRut de la interfaz IPersonaRepositorio para traer
     * una persona de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaDto objeto de tipo persona que sera enviado como filtro de la consulta
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> buscarPersonaPorRut(PersonaDto personaDto);
}
