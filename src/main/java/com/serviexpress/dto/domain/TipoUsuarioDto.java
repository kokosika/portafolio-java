package com.serviexpress.dto.domain;

import java.util.Date;

public class TipoUsuarioDto {

    private Integer id;
    private String nombre;
    private String descripcion;
    private Date fechaCreacion;
    private Date fechaUltimoUpdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
