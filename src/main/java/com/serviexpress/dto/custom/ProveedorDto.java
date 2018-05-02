package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

/**
 * Modelo basico del proveedor, se utilizara como transporte de informacion.
 * Hereda de la clase ModeloBaseDto que contendra los atributos basicos de la entidad.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class ProveedorDto extends ModeloBaseDto {

    /**
     * Variable que contiene el id del estado del proveedor.
     */
    private Integer estadoProveedorId;

    /**
     * Variable que contiene el id del tipo de proveedor.
     */
    private Integer tipoProveedorId;

    /**
     * Variable que contiene el id id de la persona.
     */
    private Integer personaId;

    public Integer getEstadoProveedorId() {
        return estadoProveedorId;
    }

    public void setEstadoProveedorId(Integer estadoProveedorId) {
        this.estadoProveedorId = estadoProveedorId;
    }

    public Integer getTipoProveedorId() {
        return tipoProveedorId;
    }

    public void setTipoProveedorId(Integer tipoProveedorId) {
        this.tipoProveedorId = tipoProveedorId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }
}
