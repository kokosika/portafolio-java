/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoServicio;
import com.serviexpress.entity.domain.TipoServicio;

import javax.persistence.*;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Servicio extends BaseEntity {

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoServicio tipoServicio;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoServicio estadoServicio;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicio")
    @JsonIgnore
    private Set<DetalleVentas> detalleVentas;

}
