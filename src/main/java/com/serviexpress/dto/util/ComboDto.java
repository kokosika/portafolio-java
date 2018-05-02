package com.serviexpress.dto.util;

/**
 * Clase generica para generar combos de forma uniforme para toda la aplicacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class ComboDto {

    /**
     * Variable que almacena el codigo del combo.
     */
    private Integer code;

    /**
     * Variable que almacena el nombre referencial del combo.
     */
    private String name;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
