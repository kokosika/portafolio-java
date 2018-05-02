package com.serviexpress.repositorios.repositorios;

import com.serviexpress.repositorios.context.BaseContext;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import java.util.HashMap;
import java.util.List;

/**
 * Base de los repositorios por herencia, tiene la funcionalidad de llamar a procedimientos almacenados
 * a travez de JdbcTemplate de spring, junto con SimpleJdbcCall para llamar a los procesos
 * contiene un automapper para la trasferencia de datos en los dto y su auto mapeo por atributos de clases
 * con los atributos exportados por el procedimiento almacenado.
 * <p>
 * 1.0 Franco Cortez - Version Inicial
 *
 * @param <Context> contexto de datos o package en oracle que recibe la funcionalidad de los procedimientos almacenados
 *                  este contexto, debe ser hereado por el base context como helper para la conexion con el package en
 *                  oracle.
 */
public class BaseRepositorio<Context extends BaseContext> implements IBaseRepositorio {

    /**
     * Injeccion de la funcion de dependencia de jdbc template para realizar
     * diferentes consultas a la base de datos.
     */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * Variable que almacena el contexto asociado a los procedimientos almacenados que
     * se estan llamando.
     */
    private String context;

    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version Inicial.
     *
     * @param context contexto asosiacion a los procedimientos almacenados.
     */
    public BaseRepositorio(Context context) {
        this.context = context.getContext();
    }

    /**
     * Metodo para llamar procedimientos almacenados que no reciben argumentos en su firma
     * retorna una lista mapeada con el dto que se le pase por parametros.
     * <p>
     * 1.0 Franco Cortez - Version Inicial.
     *
     * @param pojo clase que se desea mapear como salida.
     * @param sp   nombre del procedimiento almacenado al cual se desea llamar para recivir datos.
     * @return lista de objectos mapeados por el metodo.
     */
    protected List<?> executeList(Class<?> pojo, String sp) {
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp)
                .withCatalogName(this.context)
                .returningResultSet(DATA, new BeanPropertyRowMapper<>(pojo));
        return (List<?>) call.execute(new HashMap<>(0)).get(DATA);
    }

    /**
     * Metodo para llamar procedimientos almacenados que reciben argumentos en su firma
     * retorna una lista mapeada con el dto que se le pase por parametros.
     * <p>
     * 1.0 Franco Cortez - Version Inicial.
     *
     * @param pojo   clase que se desea mapear como salida.
     * @param sp     nombre del procedimiento almacenado al cual se desea llamar para recivir datos.
     * @param params parametros recibidos por clave / valor para su mapeo en el procedimiento almacenado.
     * @return lista de objectos mapeados por el metodo.
     */
    protected List<?> executeList(Class<?> pojo, String sp, HashMap<String, Object> params) {
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp)
                .withCatalogName(this.context)
                .returningResultSet(DATA, new BeanPropertyRowMapper<>(pojo));
        return (List<?>) call.execute(params).get(DATA);
    }

    /**
     * Metodo para ejecutar procedimientos almacenados por si funcionalidad sin retorno de datos
     * solamente se debe utilizar cuando no aya un cursor de salida como referencia.
     * <p>
     * 1.0 Franco Cortez - Version Inicial.
     *
     * @param sp nombre del procedimiento almacenado al cual se desea llamar para ejecutar alguna accion
     *           dentro de la base de datos.
     */
    protected void execute(String sp) {
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp)
                .withCatalogName(this.context);
        call.execute(new HashMap<>(0));
    }

    /**
     * Metodo para ejecutar procedimientos almacenados por si funcionalidad sin retorno de datos.
     * solamente se debe utilizar cuando no aya un cursor de salida como referencia.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param sp     nombre del procedimiento almacenado al cual se desea llamar para ejecutar alguna accion
     *               dentro de la base de datos.
     * @param params parametros que recive el procedimiento almacenado como clave / valor.
     */
    protected void execute(String sp, HashMap<String, Object> params) {
        SimpleJdbcCall call = new SimpleJdbcCall(this.jdbcTemplate)
                .withProcedureName(sp)
                .withCatalogName(this.context);
        call.execute(params);
    }

}
