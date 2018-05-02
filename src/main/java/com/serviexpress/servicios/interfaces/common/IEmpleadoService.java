package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.EmpleadoDto;
import com.serviexpress.dto.custom.ProveedorDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase EmpleadoService
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IEmpleadoService extends IBaseServicios {

    /**
     * Metodo que llama al metodo guardarEmpleado de la interfaz IEmpleadoRepositorio para almacenar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo empleado que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> guardarEmpleado(EmpleadoDto dto);

    /**
     * Metodo que llama al metodo editarEmpleado de la interfaz IEmpleadoRepositorio para modificar datos
     * del cliente.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo empleado que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> editarEmpleado(EmpleadoDto dto);

    /**
     * Metodo que llama al metodo editarEmpleado de la interfaz IEmpleadoRepositorio para modificar datos
     * del cliente.
     * Envia una respuesta http para la modificacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param empleadoId id del empleado
     * @param estadoEmpleadoId id del estado del empleado
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> eliminarEmpleado(Integer empleadoId, Integer estadoEmpleadoId);

    /**
     * Metodo que llama al metodo obtenerTodosLosEmpleados de la interfaz IEmpleadoRepositorio para traer
     * todos los empleados de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> obtenerTodosLosEmpleados();
}
