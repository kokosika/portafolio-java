/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoEmpleado;
import com.serviexpress.entity.domain.TipoEmpleado;

import javax.persistence.*;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Empleado extends BaseEntity {


    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoEmpleado tipoEmpleado;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoEmpleado estadoEmpleado;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnore
    private Set<OrdenPedido> ordenPedidos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnore
    private Set<ReservaHora> reservaHoras;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnore
    private Set<ControlRecepcion> controlRecepcions;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnore
    private Set<Ventas> ventas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleado")
    @JsonIgnore
    private Set<AnulacionVenta> anulacionVentas;
}
