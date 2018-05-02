package com.serviexpress.entity.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.serviexpress.entity.common.Vehiculo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class MarcaVehiculo extends BaseDomainEntity {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "marcaVehiculo")
    @JsonIgnore
    private Set<Vehiculo> vehiculos;

}
