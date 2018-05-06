package com.serviexpress.repositorios.repositorios.util;

import com.serviexpress.repositorios.context.UtilidadContext;
import com.serviexpress.repositorios.interfaces.util.IUtilidadRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


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


}
