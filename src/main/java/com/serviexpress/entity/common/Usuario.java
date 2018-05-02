/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoUsuario;
import com.serviexpress.entity.domain.TipoUsuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author pc casa
 */
@Entity
public class Usuario extends BaseEntity {

    @Column(length = 100)
    private String nombre;
    @Column(length = 100)
    private String contracena;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Sucursal sucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoUsuario tipoUsuario;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoUsuario estadoUsuario;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Persona persona;


}
