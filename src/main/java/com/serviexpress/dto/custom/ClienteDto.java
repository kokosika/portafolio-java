package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

/**
 * Modelo basico del cliente, se utilizara como transporte de informacion.
 * Hereda de la clase ModeloBaseDto que contendra los atributos basicos de la entidad.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class ClienteDto extends ModeloBaseDto {

    /**
     * Variable que contiene el id del estado del cliente.
     */
    private Integer estadoClienteId;

    /**
     * Variable que contiene el id de la persona.
     */
    private Integer personaId;

    /**
     * Variable que contiene el id de sucursal.
     */
    private Integer sucursalId;

    public Integer getEstadoClienteId() {
        return estadoClienteId;
    }

    public void setEstadoClienteId(Integer estadoClienteId) {
        this.estadoClienteId = estadoClienteId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }
}
