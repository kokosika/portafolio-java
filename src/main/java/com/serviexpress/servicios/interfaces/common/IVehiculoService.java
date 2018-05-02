package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.VehiculoDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase VehiculoService
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IVehiculoService extends IBaseServicios {
    /**
     * Metodo que llama al metodo guardarVehiculo de la interfaz IVehiculoRepositorio para almacenar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoDto objeto de tipo vehiculo que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> guardarVehiculo(VehiculoDto vehiculoDto);

    /**
     * Metodo que llama al metodo editarVehiculo de la interfaz IVehiculoRepositorio para almacenar datos
     * del vehiculo.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoDto objeto de tipo vehiculo que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> editarVehiculo(VehiculoDto vehiculoDto);

    /**
     * Metodo que llama al metodo editarVehiculo de la interfaz IVehiculoRepositorio para almacenar datos
     * del vehiculo.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoId id del vehiculo.
     * @param estadoVehiculoId id del estado del vehiculo.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> eliminarVehiculo(Integer vehiculoId, Integer estadoVehiculoId);

    /**
     * Metodo que llama al metodo buscarVehiculosPorIdCliente de la interfaz IVehiculoRepositorio para traer
     * todos los vehiculos de un cliente de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param clienteId id del cliente que se utilizara como busqueda.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> buscarVehiculosPorIdCliente(Integer clienteId);
}
