package com.serviexpress.dto.util;

/**
 * Clase que poseera la funcion de utilidades para el sistema
 * Como crear radio buton o funciones que no sean propias del sistema del modelo de datos.
 * <p>
 * 1.0 Franco Cortez - Version inicial
 */
public class UtilidadesDto {

    /**
     * Guardara el id del objecto
     */
    private Integer id;
    /**
     * Guardara el nombre del objecto
     */
    private String nombre;

    /**
     * Constructor que genera una instancia de la clase UtilidadesDto.
     *
     * @param id     id del objecto
     * @param nombre nombre del objeto
     */
    public UtilidadesDto(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Constructor que crea una instancia de la clase Utilidades Dto sin parametros.
     */
    public UtilidadesDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
