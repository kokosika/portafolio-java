package com.serviexpress.dto.custom;

import com.serviexpress.dto.ModeloBaseDto;

/**
 * Modelo basico del vehiculo, se utilizara como transporte de informacion.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 */
public class VehiculoDto extends ModeloBaseDto {

    /**
     * Variable que contiene la patente del vehiculo.
     */
    private String patente;

    /**
     * Variable que contiene el tipo de vehiculo id
     */
    private Integer tipoVehiculoId;

    /**
     * Variable que contiene el tipo de marca id del vehiculo.
     */
    private Integer marcaVehiculoId;

    /**
     * Variable que contiene el nombre del tipo de vehiculo.
     */
    private String tipoVehiculoNombre;

    /**
     * Variable que contiene el nombre de la marca del vehiculo.
     */
    private String marcaVehiculoNombre;

    /**
     * Variable que contiene el id del cliente.
     */
    private Integer clienteId;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Integer getTipoVehiculoId() {
        return tipoVehiculoId;
    }

    public void setTipoVehiculoId(Integer tipoVehiculoId) {
        this.tipoVehiculoId = tipoVehiculoId;
    }

    public Integer getMarcaVehiculoId() {
        return marcaVehiculoId;
    }

    public void setMarcaVehiculoId(Integer marcaVehiculoId) {
        this.marcaVehiculoId = marcaVehiculoId;
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

    public Integer getClienteId() {
        return clienteId;
    }

    public void setClienteId(Integer clienteId) {
        this.clienteId = clienteId;
    }
}
