/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.TipoVenta;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Ventas extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private Date fechaVenta;
    private Integer cantidadTotal;
    private Double montoTotal;


    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empleado empleado;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoVenta tipoVenta;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiMoneda multiMoneda;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventas")
    @JsonIgnore
    private Set<DetalleVentas> detalleVentas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ventas")
    @JsonIgnore
    private Set<AnulacionVenta> anulacionVentas;


}
