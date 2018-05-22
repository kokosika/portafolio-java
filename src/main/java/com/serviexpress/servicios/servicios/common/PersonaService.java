package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.dto.util.ErrorEnCamposDto;
import com.serviexpress.repositorios.interfaces.common.IPersonaRepositorio;
import com.serviexpress.servicios.interfaces.common.IPersonaService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Clase base para la generacion de servicios de las personas dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IPersonaService que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class PersonaService extends BaseServicios implements IPersonaService {
    /**
     * Injeccion de repositorio de personas para llamar a sus metodos de acceso a datos.
     */
    private IPersonaRepositorio personaRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaRepositorio injeccion del repositorio IPersonaRepositorio para la utilizacion de sus metodos.
     */
    public PersonaService(IPersonaRepositorio personaRepositorio) {
        this.personaRepositorio = personaRepositorio;
    }

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
    @Override
    public ResponseEntity<GenericResponse> guardarPersona(PersonaDto dto) {
        ArrayList<ErrorEnCamposDto> errores = new ArrayList<>();
        if (dto.getDivId().isEmpty() || dto.getDivId() == null || dto.getNumId() == 0 || dto.getNumId() == null)
            errores.add(new ErrorEnCamposDto(String.valueOf(errores.size() + 1), "Rut", "El rut no puede ser null"));
        if (dto.getComunaId() == 0 || dto.getComunaId() == null)
            errores.add(new ErrorEnCamposDto(String.valueOf(errores.size() + 1), "Id comuna", "El id de la comuna no puede ser null"));
        if (!errores.isEmpty())
            return error("Errores", errores);
        try {
            this.personaRepositorio.guardarPersona(dto);
            return ok("Exito", "La Persona fue ingresada con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

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
    @Override
    public ResponseEntity<GenericResponse> editarPersona(PersonaDto dto) {
        try {
            this.personaRepositorio.editarPersona(dto);
            return ok("Exito", "La Persona fue modificada con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo elimnarPersona de la interfaz IPersonaRepositorio para eliminar datos
     * de la persona.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaId       id de la persona.
     * @param estadoPersonaId id del estado de la persona.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> elimnarPersona(Integer personaId, Integer estadoPersonaId) {
        try {
            this.personaRepositorio.elimnarPersona(personaId, estadoPersonaId);
            return ok("Exito", "La Persona fue eliminada con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

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
    @Override
    public ResponseEntity<GenericResponse> buscarPersonaPorRut(PersonaDto personaDto) {
        try {
            return ok(this.personaRepositorio.buscarPersonaPorRut(personaDto));
        } catch (Exception ex) {
            return customException(ex);
        }
    }
}

