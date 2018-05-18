package com.serviexpress.repositorios.repositorios.util;

import com.serviexpress.dto.util.UtilidadesDto;
import com.serviexpress.repositorios.context.UtilidadContext;
import com.serviexpress.repositorios.interfaces.util.IUtilidadRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@EnableAutoConfiguration
@Transactional
/**
 * Clase encargada de gestionar todos los objectos de tipo utilidad dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IUtilidadRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 *
 * 1.0 Franco Cortez - Version inicial
 */
public class UtilidadRepositorio extends BaseRepositorio<UtilidadContext> implements IUtilidadRepositorio {

    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param context contexto asociado a los procedimientos almacenados.
     */
    public UtilidadRepositorio(UtilidadContext context) {
        super(context);
    }

    /**
     * Metodo que genera una lista de utilidad para los estados del cliente
     * Llama al procedimiento almacenado PRC_RADIO_ESTADO_CLIENTE
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna una lista de utilidades de estados del cliente
     */
    @SuppressWarnings("unchecked")
    public List<UtilidadesDto> getRadioEstadoCliente() {
        return (List<UtilidadesDto>) executeList(UtilidadesDto.class, "PRC_RADIO_ESTADO_CLIENTE");
    }


}
