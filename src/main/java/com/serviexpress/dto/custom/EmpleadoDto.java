package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

/**
 * Modelo basico del empelado, se utilizara como transporte de informacion.
 * Hereda de la clase ModeloBaseDto que contendra los atributos basicos de la entidad.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class EmpleadoDto extends ModeloBaseDto {

    /**
     * Variable que contiene el id del estado del proveedor.
     */
    private Integer estadoEmpleadoId;

    /**
     * Variable que contiene el id de la persona.
     */
    private Integer personaId;

    /**
     * Variable que contiene el id de la sucursal.
     */
    private Integer sucursalId;

    /**
     * Variable que contiene el id del tipo de empleado.
     */
    private Integer tipoEmpleadoId;

    public Integer getEstadoEmpleadoId() {
        return estadoEmpleadoId;
    }

    public void setEstadoEmpleadoId(Integer estadoEmpleadoId) {
        this.estadoEmpleadoId = estadoEmpleadoId;
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

    public Integer getTipoEmpleadoId() {
        return tipoEmpleadoId;
    }

    public void setTipoEmpleadoId(Integer tipoEmpleadoId) {
        this.tipoEmpleadoId = tipoEmpleadoId;
    }
}
