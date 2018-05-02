/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.domain.BaseDomainEntity;
import com.serviexpress.entity.domain.Categoria;
import com.serviexpress.entity.domain.EstadoProducto;
import com.serviexpress.entity.domain.Marca;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Producto extends BaseDomainEntity {

    @Column(length = 100)
    private String sku;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stock;
    private Integer stockCritico;

    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Categoria categoria;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Marca marca;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoProducto estadoProducto;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    @JsonIgnore
    private Set<DetalleOrdenPedido> detalleOrdenPedidos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    @JsonIgnore
    private Set<DetalleControlRecepcion> detalleControlRecepcions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    @JsonIgnore
    private Set<DetalleVentas> detalleVentas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    @JsonIgnore
    private Set<DetalleAnulacionVenta> detalleAnulacionVentas;
}
