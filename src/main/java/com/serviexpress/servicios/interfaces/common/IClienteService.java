package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.ClienteDto;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase ClienteService
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IClienteService extends IBaseServicios {

    /**
     * Metodo que llama al metodo guardarCliente de la interfaz IClienteRepositorio para almacenar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo cliente que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> guardarCliente(ClienteDto dto);

    /**
     * Metodo que llama al metodo editarCliente de la interfaz IClienteRepositorio para modificar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objeto de tipo cliente que sera enviado a la capa datos.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> editarCliente(ClienteDto dto);

    /**
     * Metodo que llama al metodo eliminarCliente de la interfaz IClienteRepositorio para eliminar datos
     * del cliente.
     * Envia una respuesta http para la creacion o fallo del ingreso de datos.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param clienteId       id del cliente.
     * @param estadoClienteId id del estado del cliente.
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> eliminarCliente(Integer clienteId, Integer estadoClienteId);

    /**
     * Metodo que llama al metodo buscarClientePorRut de la interfaz IClienteRepositorio para traer
     * el id del cliente de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param personaDto objeto de tipo persona que sera enviado como filtro de la consulta
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> buscarClientePorRut(PersonaDto personaDto);

    /**
     * Metodo que llama al metodo obtenerTodosLosClientes de la interfaz IClienteRepositorio para traer
     * todos los clientes de la base de datos.
     * Envia una respuesta http para la busqueda.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> obtenerTodosLosClientes();

    public ResponseEntity<GenericResponse> buscarClientePorId(String nombre);
}
