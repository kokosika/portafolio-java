package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.custom.UsuarioDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

/**
 * Interface base de la logica de usuarios dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */

public interface IUsuarioRepositorio extends IBaseRepositorio {
    /**
     * Metodo para validar el login
     * Llama al procedimiento PRC_VALIDAR_LOGIN
     *
     * @param usuarioDto objecto usuario
     * @return boolean
     */
    public boolean validacionLogin(UsuarioDto usuarioDto);

    /**
     * Metodo para guardar usuarios en la base de datos.
     * Llama al procedimiento PRC_INS_USUARIO
     *
     * @param usuarioDto objecto usuario que se almacenara en la base de datos.
     */
    public void guardarUsuario(UsuarioDto usuarioDto);

    /**
     * Metodo para modificar usuarios en la base de datos.
     * Llama al procedimiento PRC_UDT_USUARIO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param usuarioDto objecto usuario que se modificara en la base de datos.
     */
    public void editarUsuario(UsuarioDto usuarioDto);

    /**
     * Metodo para eliminar usuarios en la base de datos.
     * Llama al procedimiento PRC_DEL_USUARIO
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param usuarioId       id del usuario.
     * @param estadoUsuarioId id del estado de usuario.
     */
    public void eliminarUsuario(Integer usuarioId, Integer estadoUsuarioId);

    /**
     * Metodo especifico para la autenticacion de spring security
     * Obtiene un usuario a travez de su nombre de usuario.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param nombre nombre de usuario
     * @return objecto usuario que rotarna la base de datos
     */
    public UsuarioDto obtenerUsuarioPorNombre(String nombre);
}
