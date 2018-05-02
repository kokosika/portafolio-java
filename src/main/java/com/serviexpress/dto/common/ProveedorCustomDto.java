package com.serviexpress.dto.common;

import java.util.Date;

/**
 * Modelo custom del proveedor, se utilizara como transporte de informacion.
 * Contiene informacion tanto del proveedor como de la persona y asi poder listar
 * todas sus propiedades.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class ProveedorCustomDto {

    /**
     * Variable que almacena el id de la persona
     */
    private Integer personaId;

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
     * Variable que almacena el id del proveedor.
     */
    private Integer proveedorId;

    /**
     * Variable que almacena el id del estado del proveedor.
     */
    private Integer estadoProveedorId;

    /**
     * Variable que almacena el nombre del estado del proveedor.
     */
    private String estadoProveedorNombre;

    /**
     * Variable que almacena el id del tipo del proveedor.
     */
    private Integer tipoProveedorId;

    /**
     * Variable que almacena el nombre del tipo de proveedor.
     */
    private String tipoProveedorNombre;

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


}
