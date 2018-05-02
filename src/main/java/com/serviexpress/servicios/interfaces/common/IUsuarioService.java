package com.serviexpress.servicios.interfaces.common;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.custom.UsuarioDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;

/**
 * Interfaz que muestra hacia la otra capa los metodos declarados.
 * Es implementada en la clase UsuarioService
 * Extiende la la interface IBaseServicios que contiene logica encapsulada de forma generica.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public interface IUsuarioService extends IBaseServicios {

    /**
     * Metodo que valida las credenciales del usuario, llama al metodo validacionLogin de
     * la capa repositorio
     * Envia una respuesta http con autorizado o no autorizado para su validacion en la capa cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objecto usuario para ser validado
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> validacionLogin(UsuarioDto dto);

    /**
     * Metodo que envia un usuario para ser guardado en la base de datos
     * llama al metodo guardarUsuario de la capa repositorio
     * Envia una respuesta http con la insersion del usuario a la capa cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objecto usuario para ser enviado a la capa datos
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> guardarUsuario(UsuarioDto dto);

    /**
     * Metodo que envia un usuario para ser modificado en la base de datos
     * llama al metodo editarUsuario de la capa repositorio
     * Envia una respuesta http con la modificacion del usuario
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param dto objecto usuario para ser enviado a la capa datos
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> editarUsuario(UsuarioDto dto);

    /**
     * Metodo que envia un usuario para ser eliminado en la base de datos
     * llama al metodo eliminarUsuario de la capa repositorio
     * Envia una respuesta http con la elimacion del usuario
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param usuarioId       id del usuario
     * @param estadoUsuarioId id del estado del usuario
     * @return respuesta generica a la capa api web
     */
    public ResponseEntity<GenericResponse> eliminarUsuario(Integer usuarioId, Integer estadoUsuarioId);

}
