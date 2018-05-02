package com.serviexpress.dto.common;

import java.util.Date;

/**
 * Modelo custom del vehiculo, se utilizara como transporte de informacion.
 * Contiene informacion tanto del vehiculo para poder listar
 * todas sus propiedades.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class VehiculoCustomDto {

    /**
     * Variable que almacena el id del vehiculo.
     */
    private Integer vehiculoId;

    /**
     * Variable que almacena la fecha de creacion del vehiculo.
     */
    private Date fechaCreacion;

    /**
     * Variable que almacena la fecha de ultima edicion del vehiculo.
     */
    private Date fechaUltimoUpdate;

    /**
     * Variable que almacena la patente del vehiculo.
     */
    private String patente;

    /**
     * Variable que almacena el id del dueño del vehiculo.
     */
    private Integer clienteId;

    /**
     * Variable que almacena el id de la marca del vehiculo.
     */
    private Integer marcaVehiculoId;

    /**
     * Variable que almacena el nombre de la marca del vehiculo.
     */
    private String marcaVehiculoNombre;

    /**
     * Variable que almacena el id del tipo de vehiculo.
     */
    private Integer tipoVehiculoId;

    /**
     * Variable que almacena el nombre del tipo de vehiculo.
     */
    private String tipoVehiculoNombre;

    public Integer getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(Integer vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaUltimoUpdate() {
        return fechaUltimoUpdate;
    }

    public void setFechaUltimoUpdate(Date fechaUltimoUpdate) {
        this.fechaUltimoUpdate = fechaUltimoUpdate;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }

    public Integer getMarcaVehiculoId() {
        return marcaVehiculoId;
    }

    public void setMarcaVehiculoId(Integer marcaVehiculoId) {
        this.marcaVehiculoId = marcaVehiculoId;
    }

    public String getMarcaVehiculoNombre() {
        return marcaVehiculoNombre;
    }

    public void setMarcaVehiculoNombre(String marcaVehiculoNombre) {
        this.marcaVehiculoNombre = marcaVehiculoNombre;
    }

    public Integer getTipoVehiculoId() {
        return tipoVehiculoId;
    }

    public void setTipoVehiculoId(Integer tipoVehiculoId) {
        this.tipoVehiculoId = tipoVehiculoId;
    }

    public String getTipoVehiculoNombre() {
        return tipoVehiculoNombre;
    }

    public void setTipoVehiculoNombre(String tipoVehiculoNombre) {
        this.tipoVehiculoNombre = tipoVehiculoNombre;
    }
}
