package com.serviexpress.dto.util;

/**
 * Helper para la extrancion de datos de la base de datos que sean numericos
 * Ayudara a extrar 1 solo registro o columna con datos numericos para uso
 * estadisticos.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class IntegerDto {
    /**
     * Variable que contendra todos los valores extraidos.
     */
    private Integer data;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
