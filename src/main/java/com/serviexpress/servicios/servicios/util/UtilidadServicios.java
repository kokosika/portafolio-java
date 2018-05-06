package com.serviexpress.servicios.servicios.util;

import com.serviexpress.repositorios.interfaces.util.IUtilidadRepositorio;
import com.serviexpress.servicios.interfaces.util.IUtilidadServicios;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.stereotype.Service;

/**
 * Clase base para la generacion de servicios de utilidad dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IUtilidadServicios que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class UtilidadServicios extends BaseServicios implements IUtilidadServicios {
    /**
     * Injeccion de la interface IUtilidadRepositorio para la utilizacion de sus metodos.
     */
    private IUtilidadRepositorio utilidadRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param comboRepositorio injeccion del repositorio IUtilidadRepositorio para la utilizacion de sus metodos.
     */
    public UtilidadServicios(IUtilidadRepositorio comboRepositorio) {
        this.utilidadRepositorio = utilidadRepositorio;
    }


}
