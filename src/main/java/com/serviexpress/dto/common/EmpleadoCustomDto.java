package com.serviexpress.dto.common;

import java.util.Date;

/**
 * Modelo custom del empleado, se utilizara como transporte de informacion.
 * Contiene informacion tanto del empleado como de la persona y asi poder listar
 * todas sus propiedades.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class EmpleadoCustomDto {

    /**
     * Variable que almacena el id de la persona
     */
    private Integer idPersona;

    /**
     * Variable que almacena el apellido de la persona
     */
    private String apellido;

    /**
     * Variable que almacena el correo de la persona.
     */
    private String correo;

    /**
     * Variable que almacena la direccion de la persona.
     */
    private String direccion;

    /**
     * Variable que almacena el rut de la persona.
     */
    private String rut;

    /**
     * Variable que almacena el nombre de la persona.
     */
    private String nombre;

    /**
     * Variable que almacena el telefono celular de la persona.
     */
    private Integer telefonoCelular;

    /**
     * Variable que almacena el telefono fijo de la persona.
     */
    private Integer telefonoFijo;

    /**
     * Variable que almacena el id del pais.
     */
    private Integer paisId;
    /**
     * Variable que almacena el nombre del pais.
     */
    private String paisNombre;
    /**
     * Variable que almacena el id de la region.
     */
    private Integer regionId;
    /**
     * Variable que almacena el nombre de la region.
     */
    private String regionNombre;
    /**
     * Variable que almacena el id de la provincia.
     */
    private Integer provinciaId;
    /**
     * Variable que almacena el nombre de la provincia.
     */
    private String provinciaNombre;

    /**
     * Variable que almacena el id de la comuna
     */
    private Integer comunaId;

    /**
     * Variable que almacena el nombre de la comuna
     */
    private String comunaNombre;

    /**
     * Variable que almacena el estado de la persona id
     */
    private Integer estadoPersonaId;

    /**
     * Variable que almacena el nombre del estado de la persona
     */
    private String estadoPersonaNombre;

    /**
     * Variable que almacena el id del tipo de persona
     */
    private Integer tipoPersonaId;

    /**
     * Variable que almacena el nombre del tipo de persona
     */
    private String tipoPersonaNombre;

    /**
     * Variable que almacena la fecha de creacion del cliente
     */
    private Date fechaCreacion;

    /**
     * Variable que almacena la fecha de ultima actualizacion de datos.
     */
    private Date fechaUltimoUpdate;

    /**
     * Variable que almacena el id del empleado.
     */
    private Integer empleadoId;

    /**
     * Variable que almacena el id del estado del empleado.
     */
    private Integer estadoEmpleadoId;

    /**
     * Variable que almacena el nombre del estado del empleado.
     */
    private String estadoEmpleadoNombre;

    /**
     * Variable que almacena el id del tipo de empleado.
     */
    private Integer tipoEmpleadoId;

    /**
     * Variable que almacena el nombre del tipo de empleado.
     */
    private String tipoEmpleadoNombre;

    /**
     * Variable que almacena el id de la sucursal.
     */
    private Integer sucursalId;

    /**
     * Variable que almacena el nombre de la sucursal.
     */
    private String sucursalNombre;

    /**
     * Variable que almacena el id de usuario
     */
    private Integer idUsuario;

    /**
     * Variable que almacena el nombre de usuario
     */
    private String nombreUsuario;

    /**
     * Variable que almacena el id del estado de usuario
     */
    private Integer estadoUsuarioId;

    /**
     * Variable que almacena el nombre del estado de usuario.
     */
    private String estadoUsuarioNombre;

    /**
     * Variable que almacena el id del tipo de usuario
     */
    private Integer tipoUsuarioId;

    /**
     * Variable que almacena el nombre del tipo de usuario.
     */
    private String tipoUsuarioNombre;
    /**
     * Variable que almacena la fecha de nacimiento.
     */
    private Date fechaNacimiento;

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(Integer telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }

    public Integer getTelefonoFijo() {
        return telefonoFijo;
    }

    public void setTelefonoFijo(Integer telefonoFijo) {
        this.telefonoFijo = telefonoFijo;
    }

    public Integer getPaisId() {
        return paisId;
    }

    public void setPaisId(Integer paisId) {
        this.paisId = paisId;
    }

    public String getPaisNombre() {
        return paisNombre;
    }

    public void setPaisNombre(String paisNombre) {
        this.paisNombre = paisNombre;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getRegionNombre() {
        return regionNombre;
    }

    public void setRegionNombre(String regionNombre) {
        this.regionNombre = regionNombre;
    }

    public Integer getProvinciaId() {
        return provinciaId;
    }

    public void setProvinciaId(Integer provinciaId) {
        this.provinciaId = provinciaId;
    }

    public String getProvinciaNombre() {
        return provinciaNombre;
    }

    public void setProvinciaNombre(String provinciaNombre) {
        this.provinciaNombre = provinciaNombre;
    }

    public Integer getComunaId() {
        return comunaId;
    }

    public void setComunaId(Integer comunaId) {
        this.comunaId = comunaId;
    }

    public String getComunaNombre() {
        return comunaNombre;
    }

    public void setComunaNombre(String comunaNombre) {
        this.comunaNombre = comunaNombre;
    }

    public Integer getEstadoPersonaId() {
        return estadoPersonaId;
    }

    public void setEstadoPersonaId(Integer estadoPersonaId) {
        this.estadoPersonaId = estadoPersonaId;
    }

    public String getEstadoPersonaNombre() {
        return estadoPersonaNombre;
    }

    public void setEstadoPersonaNombre(String estadoPersonaNombre) {
        this.estadoPersonaNombre = estadoPersonaNombre;
    }

    public Integer getTipoPersonaId() {
        return tipoPersonaId;
    }

    public void setTipoPersonaId(Integer tipoPersonaId) {
        this.tipoPersonaId = tipoPersonaId;
    }

    public String getTipoPersonaNombre() {
        return tipoPersonaNombre;
    }

    public void setTipoPersonaNombre(String tipoPersonaNombre) {
        this.tipoPersonaNombre = tipoPersonaNombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltimoUpdate() {
        return fechaUltimoUpdate;
    }

    public void setFechaUltimoUpdate(Date fechaUltimoUpdate) {
        this.fechaUltimoUpdate = fechaUltimoUpdate;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Integer getEstadoEmpleadoId() {
        return estadoEmpleadoId;
    }

    public void setEstadoEmpleadoId(Integer estadoEmpleadoId) {
        this.estadoEmpleadoId = estadoEmpleadoId;
    }

    public String getEstadoEmpleadoNombre() {
        return estadoEmpleadoNombre;
    }

    public void setEstadoEmpleadoNombre(String estadoEmpleadoNombre) {
        this.estadoEmpleadoNombre = estadoEmpleadoNombre;
    }

    public Integer getTipoEmpleadoId() {
        return tipoEmpleadoId;
    }

    public void setTipoEmpleadoId(Integer tipoEmpleadoId) {
        this.tipoEmpleadoId = tipoEmpleadoId;
    }

    public String getTipoEmpleadoNombre() {
        return tipoEmpleadoNombre;
    }

    public void setTipoEmpleadoNombre(String tipoEmpleadoNombre) {
        this.tipoEmpleadoNombre = tipoEmpleadoNombre;
    }

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

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public Integer getEstadoUsuarioId() {
        return estadoUsuarioId;
    }

    public void setEstadoUsuarioId(Integer estadoUsuarioId) {
        this.estadoUsuarioId = estadoUsuarioId;
    }

    public String getEstadoUsuarioNombre() {
        return estadoUsuarioNombre;
    }

    public void setEstadoUsuarioNombre(String estadoUsuarioNombre) {
        this.estadoUsuarioNombre = estadoUsuarioNombre;
    }

    public Integer getTipoUsuarioId() {
        return tipoUsuarioId;
    }

    public void setTipoUsuarioId(Integer tipoUsuarioId) {
        this.tipoUsuarioId = tipoUsuarioId;
    }

    public String getTipoUsuarioNombre() {
        return tipoUsuarioNombre;
    }

    public void setTipoUsuarioNombre(String tipoUsuarioNombre) {
        this.tipoUsuarioNombre = tipoUsuarioNombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
