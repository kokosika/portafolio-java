package com.serviexpress.dto.common;

public class ServicioCustomDto {

    private Integer servicioId;
    private Integer estadoServicioId;
    private String estadoServicioNombre;
    private Integer sucursalId;
    private String sucursalNombre;
    private Integer tipoServicioId;
    private String tipoServicioNombre;
    private Double costo;
    private String calculoProducto;
    private Double valorCalculado;

    public Integer getServicioId() {
        return servicioId;
    }

    public void setServicioId(Integer servicioId) {
        this.servicioId = servicioId;
    }

    public Integer getEstadoServicioId() {
        return estadoServicioId;
    }

    public void setEstadoServicioId(Integer estadoServicioId) {
        this.estadoServicioId = estadoServicioId;
    }

    public String getEstadoServicioNombre() {
        return estadoServicioNombre;
    }

    public void setEstadoServicioNombre(String estadoServicioNombre) {
        this.estadoServicioNombre = estadoServicioNombre;
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

    public Integer getTipoServicioId() {
        return tipoServicioId;
    }

    public void setTipoServicioId(Integer tipoServicioId) {
        this.tipoServicioId = tipoServicioId;
    }

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

    public String getCalculoProducto() {
        return calculoProducto;
    }

    public void setCalculoProducto(String calculoProducto) {
        this.calculoProducto = calculoProducto;
    }

    public Double getValorCalculado() {
        return valorCalculado;
    }

    public void setValorCalculado(Double valorCalculado) {
        this.valorCalculado = valorCalculado;
    }
}
