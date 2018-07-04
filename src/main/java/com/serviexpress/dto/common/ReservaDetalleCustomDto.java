package com.serviexpress.dto.common;

import java.util.Date;

public class ReservaDetalleCustomDto {

    private Integer reservaId;
    private Integer diagnosticoId;
    private Date fechaResarva;
    private String patente;
    private String tipoVehiculoNombre;
    private String marcaVehiculoNombre;
    private String sucursalNombre;

    public Integer getReservaId() {
        return reservaId;
    }

    public void setReservaId(Integer reservaId) {
        this.reservaId = reservaId;
    }

    public Integer getDiagnosticoId() {
        return diagnosticoId;
    }

    public void setDiagnosticoId(Integer diagnosticoId) {
        this.diagnosticoId = diagnosticoId;
    }

    public Date getFechaResarva() {
        return fechaResarva;
    }

    public void setFechaResarva(Date fechaResarva) {
        this.fechaResarva = fechaResarva;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoVehiculoNombre() {
        return tipoVehiculoNombre;
    }

    public void setTipoVehiculoNombre(String tipoVehiculoNombre) {
        this.tipoVehiculoNombre = tipoVehiculoNombre;
    }

    public String getMarcaVehiculoNombre() {
        return marcaVehiculoNombre;
    }

    public void setMarcaVehiculoNombre(String marcaVehiculoNombre) {
        this.marcaVehiculoNombre = marcaVehiculoNombre;
    }

    public String getSucursalNombre() {
        return sucursalNombre;
    }

    public void setSucursalNombre(String sucursalNombre) {
        this.sucursalNombre = sucursalNombre;
    }
}
