package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class MultiMoneda extends BaseEntity {

    @Temporal(TemporalType.DATE)
    private Date fechaCambio;
    private Double monto;
    @Column(length = 10)
    private String tipoModoneda;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiMoneda")
    @JsonIgnore
    private Set<DetalleAnulacionVenta> detalleAnulacionVentas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiMoneda")
    @JsonIgnore
    private Set<DetalleControlRecepcion> detalleControlRecepcions;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiMoneda")
    @JsonIgnore
    private Set<DetalleOrdenPedido> detalleOrdenPedidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiMoneda")
    @JsonIgnore
    private Set<DetalleVentas> detalleVentas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiMoneda")
    @JsonIgnore
    private Set<OrdenPedido> ordenPedidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "multiMoneda")
    @JsonIgnore
    private Set<Ventas> ventas;

}
