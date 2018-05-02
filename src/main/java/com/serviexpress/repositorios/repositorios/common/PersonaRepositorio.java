package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.repositorios.context.PersonaContext;
import com.serviexpress.repositorios.interfaces.common.IPersonaRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Repositorio encargado de gestionar las operaciones de las personas dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IPersonaRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
@Repository
@EnableAutoConfiguration
@Transactional
public class PersonaRepositorio extends BaseRepositorio<PersonaContext> implements IPersonaRepositorio {
    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public PersonaRepositorio(PersonaContext context) {
        super(context);
    }

    /**
     * Metodo que registra a una persona en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_PERSONAS
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objeto de tipo persona para registrar en la base de datos.
     */
    @Override
    public void guardarPersona(PersonaDto personaDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_APELLIDO", personaDto.getApellido());
        params.put("V_CORREO", personaDto.getCorreo());
        params.put("V_DIRECCION", personaDto.getDireccion());
        params.put("V_DIV_ID", personaDto.getDivId());
        params.put("V_FECHA_NACIMIENTO", personaDto.getFechaNacimiento());
        params.put("V_NOMBRE", personaDto.getNombre());
        params.put("V_NUM_ID", personaDto.getNumId());
        params.put("V_TELEFONO_CELULAR", personaDto.getTelefonoCelular());
        params.put("V_TELEFONO_FIJO", personaDto.getTelefonoFijo());
        params.put("V_COMUNA_ID", personaDto.getComunaId());
        params.put("V_ESTADO_PERSONA_ID", personaDto.getEstadoPersonaId());
        params.put("V_TIPO_PERSONA_ID", personaDto.getTipoPersonaId());
        execute("PRC_INS_PERSONAS", params);
    }

    /**
     * Metodo que modifica a una persona en la base de datos.
     * Llama al procedimiento almacenado PRC_UDT_PERSONA
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objeto de tipo persona para modificar en la base de datos.
     */
    @Override
    public void editarPersona(PersonaDto personaDto){
        HashMap<String,Object> params = new HashMap<>();
        params.put("V_PERSONA_ID",personaDto);
        params.put("V_CORREO", personaDto.getCorreo());
        params.put("V_DIRECCION", personaDto.getDireccion());
        params.put("V_DIV_ID", personaDto.getDivId());
        params.put("V_FECHA_NACIMIENTO", personaDto.getFechaNacimiento());
        params.put("V_NOMBRE", personaDto.getNombre());
        params.put("V_APELLIDO", personaDto.getApellido());
        params.put("V_NUM_ID", personaDto.getNumId());
        params.put("V_TELEFONO_CELULAR", personaDto.getTelefonoCelular());
        params.put("V_TELEFONO_FIJO", personaDto.getTelefonoFijo());
        params.put("V_COMUNA_ID", personaDto.getComunaId());
        params.put("V_ESTADO_PERSONA_ID", personaDto.getEstadoPersonaId());
        params.put("V_TIPO_PERSONA_ID", personaDto.getTipoPersonaId());
        execute("PRC_UDT_PERSONA",params);
    }

    /**
     * Metodo que elimina a una persona en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_PERSONA
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaId variable de tipo id de la persona.
     * @param estadoPersonaId variable de tipo estado de la persona.
     */
    @Override
    public void elimnarPersona(Integer personaId, Integer estadoPersonaId){
        HashMap<String,Object> params = new HashMap<>();
        params.put("V_PERSONA_ID",personaId);
        params.put("V_ESTADO_PERSONA_ID",estadoPersonaId);
        execute("PRC_DEL_PERSONA" , params);
    }

    /**
     * Metodo para obtener el id de la persona por rut dentro de la base de datos
     * LLama al procedimiento almacenado PRC_GET_BUSCAR_POR_RUT
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objecto de tipo persona para extraer filtros de la consulta
     * @return retorna el id de la persona.
     */
    @SuppressWarnings("unchecked")
    @Override
    public PersonaDto buscarPersonaPorRut(PersonaDto personaDto) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_NUM_ID", personaDto.getNumId());
        params.put("V_DIV_ID", personaDto.getDivId());
        List<PersonaDto> list = (List<PersonaDto>) executeList(PersonaDto.class, "PRC_GET_BUSCAR_POR_RUT", params);
        if (list.isEmpty())
            return null;
        return list.get(0);
    }
}
