package com.serviexpress.servicios.servicios.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.VehiculoDto;
import com.serviexpress.repositorios.interfaces.common.IVehiculoRepositorio;
import com.serviexpress.servicios.interfaces.common.IVehiculoService;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Clase base para la generacion de servicios de los vehiculos de los clientes dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IVehiculoService que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class VehiculoService extends BaseServicios implements IVehiculoService {

    /**
     * Injeccion de repositorio de vechiculo para llamar a sus metodos de acceso a datos.
     */
    private IVehiculoRepositorio vehiculoRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoRepositorio injeccion del repositorio IVehiculoRepositorio para la utilizacion de sus metodos.
     */
    public VehiculoService(IVehiculoRepositorio vehiculoRepositorio) {
        this.vehiculoRepositorio = vehiculoRepositorio;
    }

    /**
     * Metodo que llama al metodo guardarVehiculo de la interfaz IVehiculoRepositorio para almacenar datos
     * del vehiculo.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoDto objeto de tipo vehiculo que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> guardarVehiculo(VehiculoDto vehiculoDto) {
        try {
            this.vehiculoRepositorio.guardarVehiculo(vehiculoDto);
            return ok("Exito", "El vehiculo fue registrado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

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
    @Override
    public ResponseEntity<GenericResponse> editarVehiculo(VehiculoDto vehiculoDto) {
        try {
            this.vehiculoRepositorio.editarVehiculo(vehiculoDto);
            return ok("Exito", "El vehiculo fue modificado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que llama al metodo editarVehiculo de la interfaz IVehiculoRepositorio para almacenar datos
     * del vehiculo.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param vehiculoId       id del vehiculo.
     * @param estadoVehiculoId id del estado del vehiculo.
     * @return respuesta generica a la capa api web
     */
    @Override
    public ResponseEntity<GenericResponse> eliminarVehiculo(Integer vehiculoId, Integer estadoVehiculoId) {
        try {
            this.vehiculoRepositorio.eliminarVehiculo(vehiculoId, estadoVehiculoId);
            return ok("Exito", "El vehiculo fue eliminado con exito");
        } catch (Exception ex) {
            return customException(ex);
        }
    }

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
    @Override
    public ResponseEntity<GenericResponse> buscarVehiculosPorIdCliente(Integer clienteId) {
        try {
            return ok(this.vehiculoRepositorio.buscarVehiculosPorIdCliente(clienteId));
        } catch (Exception ex) {
            return customException(ex);
        }
    }
}
