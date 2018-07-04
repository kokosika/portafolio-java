package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

import java.util.Date;

public class ReservaHoraDto extends ModeloBaseDto {
    private Integer clienteId;
    private Integer empleadoId;
    private Integer estadoReservaId;
    private Integer sucursalId;
    private Integer tipoReservaId;
    private Integer vehiculoId;
    private Date fechaReserva;

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Integer empleadoId) {
        this.empleadoId = empleadoId;
    }

    public Integer getEstadoReservaId() {
        return estadoReservaId;
    }

    public void setEstadoReservaId(Integer estadoReservaId) {
        this.estadoReservaId = estadoReservaId;
    }

    public Integer getSucursalId() {
        return sucursalId;
    }

    public void setSucursalId(Integer sucursalId) {
        this.sucursalId = sucursalId;
    }

    public Integer getTipoReservaId() {
        return tipoReservaId;
    }

    public void setTipoReservaId(Integer tipoReservaId) {
        this.tipoReservaId = tipoReservaId;
    }

    public Integer getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(Integer vehiculoId) {
        this.vehiculoId = vehiculoId;
    }
}
