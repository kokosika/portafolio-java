package com.serviexpress.servicios.servicios;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 * Clase base de los servicios implimentados en la aplicacion, todas las clases que deseen ser servicios
 * en la aplicacion deben heredar de esta clase para poder utilizar las implementaciones de metodos de retorno
 * hacia la api web
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public class BaseServicios implements IBaseServicios {

    /**
     * Metodo base de respuestas ok donde se logra obtener un mensaje generico si no se pasan parametros
     * dentro del metodo en si.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param response objecto de respuesta para ser modificado dentro de el metodo.
     * @return retorna el mismo objeto pasado por parametros pero con las modificiaciones por defecto si
     * todos los parametros de respues vienen en null
     */
    private GenericResponse responseOk(GenericResponse response) {
        if (response.title == null)
            response.title = "Exito";
        if (response.data == null)
            response.data = "Operacion realizada con exito";
        response.http = HttpStatus.OK;
        return response;
    }

    /**
     * Metodo base de respuestas error donde se logra obtener un mensaje generico si no se pasan parametros
     * dentro del metodo en si.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param response bjecto de respuesta para ser modificado dentro de el metodo.
     * @return retorna el mismo objeto pasado por parametros pero con las modificiaciones por defecto si
     * todos los parametros de respues vienen en null
     */
    private GenericResponse responseError(GenericResponse response) {
        if (response.title == null)
            response.title = "Error";
        if (response.data == null)
            response.data = "Hubo un error al realizar la operacion";
        response.http = HttpStatus.BAD_REQUEST;
        return response;
    }

    /**
     * Metodo base de respuestas advertencia donde se logra obtener un mensaje generico si no se pasan parametros
     * dentro del metodo en si.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param response bjecto de respuesta para ser modificado dentro de el metodo.
     * @return retorna el mismo objeto pasado por parametros pero con las modificiaciones por defecto si
     * todos los parametros de respues vienen en null
     */
    private GenericResponse responseWarning(GenericResponse response) {
        if (response.title == null)
            response.title = "Advertencia";
        if (response.data == null)
            response.data = "Existen advertencias en la operacion";
        response.http = HttpStatus.CONFLICT;
        return response;
    }

    /**
     * Metodo que retorna una respuesta positiva o ok con un titulo personalizado.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @return retorna la respuesta con data y http por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> ok(String title) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * Metodo que retorna una respuesta positiva o ok con un titulo y data personalizado.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @param data  cuerpo de la respuesta
     * @return retorna la respuesta http por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> ok(String title, Object data) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * Metodo que retorna una respuesta positiva o ok con data personalizada.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param data cuerpo de la respuesta
     * @return retorna la respuesta http y el titulo por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> ok(Object data) {
        GenericResponse response = new GenericResponse();
        response.data = data;
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * Metodo que retorna una respuesta positiva o ok con todos los datos por default .
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna la respuesta por default del sistema
     */
    protected ResponseEntity<GenericResponse> ok() {
        GenericResponse response = new GenericResponse();
        return new ResponseEntity<>(responseOk(response), responseOk(response).http);
    }

    /**
     * Metodo que retorna una respuesta error con un titulo y data personalizado.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @param data  cuerpo de la respuesta
     * @return retorna la respuesta http por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> error(String title, Object data) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * Metodo que retorna una respuesta error con un titulo personalizado.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @return retorna la respuesta http y data por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> error(String title) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * Metodo que retorna una respuesta error con data personalizada.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param data cuerpo de la respuesta
     * @return retorna la respuesta http y titulo por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> error(Object data) {
        GenericResponse response = new GenericResponse();
        response.data = data;
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * Metodo que retorna una respuesta error con todos los datos por default .
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna la respuesta por default del sistema
     */
    protected ResponseEntity<GenericResponse> error() {
        GenericResponse response = new GenericResponse();
        return new ResponseEntity<>(responseError(response), responseError(response).http);
    }

    /**
     * Metodo que retorna una respuesta de advertencia con un titulo y data personalizado.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @param data  cuerpo de la respuesta
     * @return retorna la respuesta http por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> warning(String title, Object data) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * Metodo que retorna una respuesta advertencia con un titulopersonalizado.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @return retorna la respuesta http y data por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> warning(String title) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * Metodo que retorna una respuesta advertencia con data personalizada.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param data cuerpo de la respuesta
     * @return retorna la respuesta http y titulo por default dentro del metodo.
     */
    protected ResponseEntity<GenericResponse> warning(Object data) {
        GenericResponse response = new GenericResponse();
        response.data = data;
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * Metodo que retorna una respuesta advertencia con todos los atributos por defautl.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna la respuesta por defautl.
     */
    protected ResponseEntity<GenericResponse> warning() {
        GenericResponse response = new GenericResponse();
        return new ResponseEntity<>(responseWarning(response), responseWarning(response).http);
    }

    /**
     * Metodo con una respuesta personaliza donde se deben pasar todos los parametros para lograr el efecto
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param title titulo de la respuesta
     * @param data  data o cuerpo de la respuesta
     * @param http  codigo http para el cliente identifique el tipo de respuesta
     * @return la respuesta con todos los parametros inicializados
     */
    protected ResponseEntity<GenericResponse> customResponse(String title, Object data, HttpStatus http) {
        GenericResponse response = new GenericResponse();
        response.title = title;
        response.data = data;
        response.http = http;
        return new ResponseEntity<>(response, response.http);
    }

    /**
     * Metodo para lansar una respuesta con excepciones no controladas
     * con un trace para seguiemiento.
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param ex excepcion de la capa de negocio para excepciones no controladas
     * @return retorna la respuesta 400 con los detalles de la excepcion.
     */
    protected ResponseEntity<GenericResponse> customException(Exception ex) {
        GenericResponse response = new GenericResponse();
        response.title = "Error inesperado";
        response.data = ex.getMessage();
        response.http = HttpStatus.BAD_REQUEST;
        response.trace = ex.getStackTrace();
        return new ResponseEntity<>(response, response.http);
    }

}
