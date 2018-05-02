package com.serviexpress.entity.common;

import com.serviexpress.entity.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleAnulacionVenta extends BaseEntity {

    @Column(length = 50)
    private String nombreProducto;
    private Integer cantidad;
    private Double precioVenta;
    @Column(length = 200)
    private String observacion;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private AnulacionVenta anulacionVenta;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producto producto;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiMoneda multiMoneda;


}
