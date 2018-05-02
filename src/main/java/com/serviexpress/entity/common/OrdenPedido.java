/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoOrdenPedido;
import com.serviexpress.entity.domain.TipoOrdenPedido;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class OrdenPedido extends BaseEntity {

    private Double cantidadTotal;
    private Double montoTotal;
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoOrdenPedido estadoOrdenPedido;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoOrdenPedido tipoOrdenPedido;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleado empleado;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Proveedor proveedor;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiMoneda multiMoneda;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenPedido")
    @JsonIgnore
    private Set<DetalleOrdenPedido> detalleOrdenPedidos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenPedido")
    @JsonIgnore
    private Set<ControlRecepcion> controlRecepcions;


}
