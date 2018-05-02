package com.serviexpress.dto.util;

/**
 * Clase generica que se utiliza para traer 1 dato de la BD. Como utilidad.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class StringDto {

    /**
     * Variable que obtendra todos los valores extrados como texto.
     */
    public String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
