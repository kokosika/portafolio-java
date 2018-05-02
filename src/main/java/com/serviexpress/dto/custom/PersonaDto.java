package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

import java.util.Date;

/**
 * Modelo basico de la persona, se utilizara como transporte de informacion.
 * Hereda de la clase ModeloBaseDto que contendra los atributos basicos de la entidad.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class PersonaDto extends ModeloBaseDto {
    /**
     * Variable que relaciona el numero unico del rut
     */
    private Integer numId;

    /**
     * Variable que relaciona el digito verificador del rut
     */
    private String divId;

    /**
     * Variable que relaciona el nombre de la persona
     */
    private String nombre;

    /**
     * Variable que relaciona el apellido de la persona.
     */
    private String apellido;

    /**
     * Variable que relacion la direccion de la persona.
     */
    private String direccion;

    /**
     * Variable que relaciona el telefono fijo o de casa de la persona.
     */
    private Integer telefonoFijo;

    /**
     * Variable que relacion el telefono celular de la persona.
     */
    private Integer telefonoCelular;

    /**
     * Variable que contendra el correo de la persona.
     */
    private String correo;

    /**
     * Variable que contiene la fecha de nacimiento de la persona.
     */
    private Date fechaNacimiento;

    /**
     * Variable que contiene el tipo de persona id.
     */
    private Integer tipoPersonaId;

    /**
     * Variable que contiene el estado de la persona id.
     */
    private Integer estadoPersonaId;

    /**
     * Variable que contiene la comuna id de la persona.
     */
    private Integer comunaId;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public String getDivId() {
        return divId;
    }

    public void setDivId(String divId) {
        this.divId = divId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(Integer telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public Integer getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(Integer telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getTipoPersonaId() {
        return tipoPersonaId;
    }

    public void setTipoPersonaId(Integer tipoPersonaId) {
        this.tipoPersonaId = tipoPersonaId;
    }

    public Integer getEstadoPersonaId() {
        return estadoPersonaId;
    }

    public void setEstadoPersonaId(Integer estadoPersonaId) {
        this.estadoPersonaId = estadoPersonaId;
    }

    public Integer getComunaId() {
        return comunaId;
    }

    public void setComunaId(Integer comunaId) {
        this.comunaId = comunaId;
    }
}
