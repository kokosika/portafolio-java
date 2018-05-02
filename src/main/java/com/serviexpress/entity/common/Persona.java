/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.Comuna;
import com.serviexpress.entity.domain.EstadoPersona;
import com.serviexpress.entity.domain.TipoPersona;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * @author pc casa
 */
@Entity
public class Persona extends BaseEntity {
    private Integer numId;
    @Column(length = 2)
    private String divId;
    @Column(length = 50)
    private String nombre;
    @Column(length = 50)
    private String apellido;
    @Column(length = 100)
    private String direccion;
    @Column(precision = 10, scale = 0)
    private Integer telefonoFijo;
    @Column(precision = 10, scale = 0)
    private Integer telefonoCelular;
    @Column(length = 100)
    private String correo;
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoPersona tipoPersona;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoPersona estadoPersona;
    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Comuna comuna;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonIgnore
    private Set<Usuario> usuarios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonIgnore
    private Set<Cliente> cliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonIgnore
    private Set<Proveedor> proveedors;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "persona")
    @JsonIgnore
    private Set<Empleado> empleados;


}
