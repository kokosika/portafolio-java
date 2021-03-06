package com.serviexpress.servicios.interfaces.util;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase UtilidadServicios
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IUtilidadServicios extends IBaseServicios {

    /**
     * Metodo que genera una lista de estados del cliente, llama al metodo
     * getRadioEstadoCliente de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    public ResponseEntity<GenericResponse> getRadioEstadoCliente();

    /**
     * Metodo que genera una lista de estados del proveedor, llama al metodo
     * getRadioEstadoProveedor de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    public ResponseEntity<GenericResponse> getRadioEstadoProveedor();

    /**
     * Metodo que genera una lista de tipos del proveedor, llama al metodo
     * getRadioTipoProveedor de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    public ResponseEntity<GenericResponse> getRadioTipoProveedor();

    /**
     * Metodo que genera una lista de estado del empleado, llama al metodo
     * getRadioEstadoEmpleado de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    public ResponseEntity<GenericResponse> getRadioEstadoEmpleado();

    /**
     * Metodo que genera una lista de tipos del empleado, llama al metodo
     * getRadioTipoEmpleado de la capa datos.
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    public ResponseEntity<GenericResponse> getRadioTipoEmpleado();

}
