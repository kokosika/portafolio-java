/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoProveedor;
import com.serviexpress.entity.domain.TipoProveedor;

import javax.persistence.*;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Proveedor extends BaseEntity {

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoProveedor tipoProveedor;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoProveedor estadoProveedor;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor")
    @JsonIgnore
    private Set<OrdenPedido> ordenPedidos;


}
