package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

/**
 * Modelo basico del usuario., se utilizara como transporte de informacion.
 * Hereda de la clase ModeloBaseDto que contendra los atributos basicos de la entidad.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class UsuarioDto extends ModeloBaseDto {

    /**
     * Variable que contiene el nombre de usuario
     */
    private String nombre;

    /**
     * Variable que contiene la contraceña del usuario.
     */
    private String contracena;

    /**
     * Variable que contiene el tipo de usuario id.
     */
    private Integer tipoUsuarioId;

    /**
     * Variable que contiene el estado de usuario id.
     */
    private Integer estadoUsuarioId;

    /**
     * Variable que contiene la persona id relacionada con el usuario.
     */
    private Integer personaId;

    /**
     * Variable que contiene el tipo de usuario por su nombre.
     */
    private String tipoUsuarioNombre;

    /**
     * Variable que contiene el estado de usuario nomnbre.
     */
    private String estadoUsuarioNombre;

    /**
     * Variable que contiene la sucursal id.
     */
    private Integer sucursalId;

    /**
     * Variable que contiene la sucursal por su nombre.
     */
    private String sucursalNombre;

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public String getSucursalNombre() {
        return sucursalNombre;
    }

    public void setSucursalNombre(String sucursalNombre) {
        this.sucursalNombre = sucursalNombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContracena() {
        return contracena;
    }

    public void setContracena(String contracena) {
        this.contracena = contracena;
    }

    public Integer getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(Integer tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public Integer getEstadoUsuarioId() {
        return estadoUsuarioId;
    }

    public void setEstadoUsuarioId(Integer estadoUsuarioId) {
        this.estadoUsuarioId = estadoUsuarioId;
    }

    public Integer getPersonaId() {
        return personaId;
    }

    public void setPersonaId(Integer personaId) {
        this.personaId = personaId;
    }

    public String getTipoUsuarioNombre() {
        return tipoUsuarioNombre;
    }

    public void setTipoUsuarioNombre(String tipoUsuarioNombre) {
        this.tipoUsuarioNombre = tipoUsuarioNombre;
    }

    public String getEstadoUsuarioNombre() {
        return estadoUsuarioNombre;
    }

    public void setEstadoUsuarioNombre(String estadoUsuarioNombre) {
        this.estadoUsuarioNombre = estadoUsuarioNombre;
    }
}
