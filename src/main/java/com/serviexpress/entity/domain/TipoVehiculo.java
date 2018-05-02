package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.Vehiculo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class TipoVehiculo extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoVehiculo")
    @JsonIgnore
    private Set<Vehiculo> vehiculos;


}
