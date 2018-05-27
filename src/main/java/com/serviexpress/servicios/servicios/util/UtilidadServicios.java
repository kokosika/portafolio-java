package com.serviexpress.servicios.servicios.util;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.repositorios.interfaces.util.IUtilidadRepositorio;
import com.serviexpress.servicios.interfaces.util.IUtilidadServicios;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
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
     * @param utilidadRepositorio injeccion del repositorio IUtilidadRepositorio para la utilizacion de sus metodos.
     */
    public UtilidadServicios(IUtilidadRepositorio utilidadRepositorio) {
        this.utilidadRepositorio = utilidadRepositorio;
    }

    /**
     * Metodo que genera una lista de estados del cliente, llama al metodo
     * getRadioEstadoCliente de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    @Override
    public ResponseEntity<GenericResponse> getRadioEstadoCliente() {
        try {
            return ok(this.utilidadRepositorio.getRadioEstadoCliente());
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que genera una lista de estados del proveedor, llama al metodo
     * getRadioEstadoProveedor de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    @Override
    public ResponseEntity<GenericResponse> getRadioEstadoProveedor() {
        try {
            return ok(this.utilidadRepositorio.getRadioEstadoProveedor());
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que genera una lista de tipos del proveedor, llama al metodo
     * getRadioTipoProveedor de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    @Override
    public ResponseEntity<GenericResponse> getRadioTipoProveedor() {
        try {
            return ok(this.utilidadRepositorio.getRadioTipoProveedor());
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que genera una lista de estado del empleado, llama al metodo
     * getRadioEstadoEmpleado de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    @Override
    public ResponseEntity<GenericResponse> getRadioEstadoEmpleado() {
        try {
            return ok(this.utilidadRepositorio.getRadioEstadoEmpleado());
        } catch (Exception e) {
            return customException(e);
        }
    }

    /**
     * Metodo que genera una lista de tipos del empleado, llama al metodo
     * getRadioTipoEmpleado de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    @Override
    public ResponseEntity<GenericResponse> getRadioTipoEmpleado() {
        try {
            return ok(this.utilidadRepositorio.getRadioTipoEmpleado());
        } catch (Exception e) {
            return customException(e);
        }
    }

}
