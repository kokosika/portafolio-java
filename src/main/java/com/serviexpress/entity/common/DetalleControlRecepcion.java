/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoRecepcion;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author pc casa
 */
@Entity
public class DetalleControlRecepcion extends BaseEntity {

    private Integer cantidadTotal;
    private Integer cantidadIngresada;
    @Column(length = 100)
    private String comentario;
    @Column(length = 50)
    private String nombreProducto;
    private Double precioCompra;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ControlRecepcion controlRecepcion;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producto producto;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoRecepcion estadoRecepcion;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiMoneda multiMoneda;


}
