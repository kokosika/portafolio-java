package com.serviexpress.dto;

import java.util.Date;

/**
 * Modelo base de todas las entidades del sistema.
 */
public class ModeloBaseDto {

    /**
     * Contendra el id de todas la entidades que hereden de esta clase
     */
    private Integer id;

    /**
     * Contendra la fecha de creacion del registro
     */
    private Date fechaCreacion;

    /**
     * Contendra la fecha de la ultima modificacion del registro.
     */
    private Date fechaUltimoUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
