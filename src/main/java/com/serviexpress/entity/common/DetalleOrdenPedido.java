/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.serviexpress.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author pc casa
 */
@Entity
public class DetalleOrdenPedido extends BaseEntity {

    private Integer cantidad;
    private Double precioCompra;
    private Double montoTotal;
    @Column(length = 50)
    private String nombreProducto;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private OrdenPedido ordenPedido;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producto producto;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiMoneda multiMoneda;

}
