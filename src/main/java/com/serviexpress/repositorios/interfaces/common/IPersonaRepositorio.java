package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

/**
 * Interface base de la logica de personas dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IPersonaRepositorio extends IBaseRepositorio {
    /**
     * Metodo que registra a una persona en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_PERSONAS
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param dto objeto de tipo persona para registrar en la base de datos.
     */
    public void guardarPersona(PersonaDto dto);

    /**
     * Metodo que modifica a una persona en la base de datos.
     * Llama al procedimiento almacenado PRC_UDT_PERSONA
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objeto de tipo persona para modificar en la base de datos.
     */
    public void editarPersona(PersonaDto personaDto);

    /**
     * Metodo que elimina a una persona en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_PERSONA
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaId variable de tipo id de la persona.
     * @param estadoPersonaId variable de tipo estado de la persona.
     */
    public void elimnarPersona(Integer personaId, Integer estadoPersonaId);


    /**
     * Metodo para obtener el id de la persona por rut dentro de la base de datos
     * LLama al procedimiento almacenado PRC_GET_BUSCAR_POR_RUT
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objecto de tipo persona para extraer filtros de la consulta
     * @return retorna una persona.
     */
    public PersonaDto buscarPersonaPorRut(PersonaDto personaDto);
}
