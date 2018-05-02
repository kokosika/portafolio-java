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
public class DetalleVentas extends BaseEntity {

    private Double montoTotal;
    private Double precioVenta;
    private Integer cantidad;
    @Column(length = 50)
    private String nombreProducto;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ventas ventas;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Servicio servicio;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producto producto;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiMoneda multiMoneda;

}
