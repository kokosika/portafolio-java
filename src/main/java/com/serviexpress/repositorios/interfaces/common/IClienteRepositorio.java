package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.common.ClienteCustomDto;
import com.serviexpress.dto.custom.ClienteDto;
import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

/**
 * Interface base de la logica de cliente dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IClienteRepositorio extends IBaseRepositorio {

    /**
     * Metodo que registra a un cliente en la base de datos.
     * Llama al procedimiento almacenado PRC_INS_CLIENTE
     *
     * @param dto objeto de tipo cliente para registrar en la base de datos.
     */
    public void guardarCliente(ClienteDto dto);

    /**
     * Metodo que modifica a un cliente en la base de datos.
     * Llama al procedimiento almacenado PRC_UDT_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteDto objeto de tipo cliente para modificar en la base de datos.
     */
    public void editarCliente(ClienteDto clienteDto);

    /**
     * Metodo que elimina a un cliente en la base de datos.
     * Llama al procedimiento almacenado PRC_DEL_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param clienteId       variable de tipo id del cliente.
     * @param estadoClienteId variable de tipo id del estado de la persona.
     */
    public void eliminarCliente(Integer clienteId, Integer estadoClienteId);

    /**
     * Metodo para obtener el id del cliente por su rut
     * Llama al procedimiento almacenado PRC_BUSCAR_CLIENTE_X_RUT
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param personaDto objecto de tipo persona que servira como filtro de la busqueda.
     * @return retorna el id del cliente
     */
    public ClienteDto buscarClientePorRut(PersonaDto personaDto);

    /**
     * Metodo un listado de todos los clientes con todas las columnas.
     * Llama al procedimiento almacenado PRC_LISTAR_CLIENTES
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna el todos los campos del cliente.
     */
    public List<ClienteCustomDto> obtenerTodosLosClientes();

}
