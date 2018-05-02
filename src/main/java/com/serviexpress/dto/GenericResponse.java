package com.serviexpress.dto;

import org.springframework.http.HttpStatus;

/**
 * Respuesta basica para todas las peticiones http, generara un componente json generico
 * para su llamada en la parte del cliente, siendo
 * title: el titulo de la respuesta
 * data: los datos que se desean enviar como base del cuerpo de la respuesta
 * http: tipo de respues http (200 , 400 etc)
 * trace: control de excepcion con seguimiento en el trace, usar esto para excepciones no controladas y
 * desarrollo de la aplicacion, evitar el uso en produccion o en el cliente ya que no son utilizada para
 * mensajes de usuario
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
public class GenericResponse {

    /**
     * Variable que contendra el titulo de la respuesta.
     */
    public String title;

    /**
     * Variable que contendra el cuerpo de la respuesta.
     */
    public Object data;

    /**
     * Variable que contendra el tipo de respuesta http.
     */
    public HttpStatus http;

    /**
     * Variable que contendra el trace de la excepcion si tubiera.
     */
    public Object trace;
}
