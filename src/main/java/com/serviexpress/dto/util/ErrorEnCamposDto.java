package com.serviexpress.dto.util;

/**
 * Clase que ayudara en la captura de errores de negocio dentro de la capa service.
 * Sera transportado hacia el cliente si no cumple las condiciones de negocio de la
 * api rest.
 */
public class ErrorEnCamposDto {

    /**
     * Variable que almacenara id o clave del campo
     */
    private String id;
    /**
     * Variable que almacenara el nombre del campo
     */
    private String nombre;

    /**
     * Causa del error como validaciones.
     */
    private String causa;

    /**
     * Constructor sin parametros que crea una instancia de la clase  ErrorEnCamposDto
     */
    public ErrorEnCamposDto() {
    }

    /**
     * Constructor con parametros que crea una instancia de la clase  ErrorEnCamposDto
     *
     * @param id     id o clave del campo
     * @param nombre nombre del campo
     * @param causa  causa o razon del error
     */
    public ErrorEnCamposDto(String id, String nombre, String causa) {
        this.id = id;
        this.nombre = nombre;
        this.causa = causa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
}
