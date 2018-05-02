/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoControlRecepcion;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class ControlRecepcion extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private Date fechaRecepcion;
    @Column(length = 100)
    private String comentario;
    @Temporal(TemporalType.DATE)
    private Date fechaAprovacion;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleado empleado;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private OrdenPedido ordenPedido;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoControlRecepcion estadoControlRecepcion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "controlRecepcion")
    @JsonIgnore
    private Set<DetalleControlRecepcion> detalleControlRecepcions;
}
