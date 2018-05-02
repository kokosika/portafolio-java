/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoCliente;

import javax.persistence.*;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Cliente extends BaseEntity {

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoCliente estadoCliente;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    @JsonIgnore
    private Set<Ventas> ventas;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    @JsonIgnore
    private Set<Vehiculo> vehiculos;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    @JsonIgnore
    private Set<ReservaHora> reservaHoras;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    @JsonIgnore
    private Set<AnulacionVenta> anulacionVentas;

}
