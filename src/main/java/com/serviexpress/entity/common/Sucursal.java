package com.serviexpress.entity.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.BaseEntity;
import com.serviexpress.entity.domain.EstadoSucursal;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Sucursal extends BaseEntity {

    @Column(length = 100)
    private String nombre;
    @Column(length = 100)
    private String direccion;
    private Integer numeroTelefono;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadoSucursal estadoSucursal;

    @JoinColumn(referencedColumnName = "id")
    @ManyToOne(optional = false)
    private MultiEmpresa multiEmpresa;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Cliente> clientes;
    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Diagnostico> diagnosticos;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Empleado> empleados;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<OrdenPedido> ordenPedidos;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<ReservaHora> reservaHoras;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Servicio> servicios;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Usuario> usuarios;

    @OneToMany(mappedBy = "sucursal", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Ventas> ventas;


}
