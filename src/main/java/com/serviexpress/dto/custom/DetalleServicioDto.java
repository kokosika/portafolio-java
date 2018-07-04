package com.serviexpress.dto.custom;

public class DetalleServicioDto {

    private String tipoServicioNombre;
    private Double costo;
    private Double porcentaje;
    private Double totalServicio;

    public String getTipoServicioNombre() {
        return tipoServicioNombre;
    }

    public void setTipoServicioNombre(String tipoServicioNombre) {
        this.tipoServicioNombre = tipoServicioNombre;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getTotalServicio() {
        return totalServicio;
    }

    public void setTotalServicio(Double totalServicio) {
        this.totalServicio = totalServicio;
    }
}
