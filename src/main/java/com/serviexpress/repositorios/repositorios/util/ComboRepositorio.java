package com.serviexpress.repositorios.repositorios.util;

import com.serviexpress.dto.util.ComboDto;
import com.serviexpress.repositorios.context.ComboContext;
import com.serviexpress.repositorios.interfaces.util.IComboRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;


@Repository
@EnableAutoConfiguration
@Transactional
/**
 * Clase encargada de gestionar todos los objectos de tipo combobox dentro del sistema.
 * Hereda de la clase BaseRepositorio donde se encuentran todas las operaciones basicas
 * de consultas a la base de datos.
 * Implementa la Interface IComboRepositorio donde se encuentra la declaracion de los metodos
 * publicos para la injeccion de dependencia en otra capa de la aplicacion.
 *
 * 1.0 Franco Cortez - Version inicial
 */
public class ComboRepositorio extends BaseRepositorio<ComboContext> implements IComboRepositorio {

    /**
     * Inicializacion del contexto para leer el package en oracle y establecer la conexion.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param context contexto asociado a los procedimientos almacenados.
     */
    public ComboRepositorio(ComboContext context) {
        super(context);
    }

    /**
     * Metodo principal que genera la llamada a los procedimientos de forma generica
     * para generar los combos asociados al procedimiento.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param procedimiento nombre del procedimiento almacenado
     * @param filter        filtro para buscar combos con desencadenantes.
     * @return lista combos.
     */
    @SuppressWarnings("unchecked")
    private List<ComboDto> generarCombo(String procedimiento, ComboDto filter) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("BUSCAR_POR_ID", filter.getCode());
        params.put("BUSCAR_POR_NOMBRE", null);
        return (List<ComboDto>) executeList(ComboDto.class, procedimiento, params);
    }

    /**
     * Metodo principal que genera la llamada a los procedimientos de forma generica
     * para generar los combos asociados al procedimiento.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param procedimiento nombre del procedimiento almacenado
     * @return lista combos.
     */
    @SuppressWarnings("unchecked")
    private List<ComboDto> generarCombo(String procedimiento) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("BUSCAR_POR_ID", null);
        params.put("BUSCAR_POR_NOMBRE", null);
        return (List<ComboDto>) executeList(ComboDto.class, procedimiento, params);
    }


    /**
     * Metodo que genera un combo de tipo pais.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna un combo generico.
     */
    @Override
    public List<ComboDto> getComboPais() {
        return generarCombo("GET_COMBO_PAIS");
    }

    /**
     * Metodo que genera un combo de tipo region.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param filter objeto que tiene el codigo del pais para generar el combo.
     * @return retorna un combo generico
     */
    @Override
    public List<ComboDto> getComboRegion(ComboDto filter) {
        return generarCombo("GET_COMBO_REGION", filter);
    }

    /**
     * Metodo que genera un combo de tipo provincia.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param filter objeto que tiene el codigo de la region para generar el combo.
     * @return retorna un combo generico
     */
    @Override
    public List<ComboDto> getComboProvincia(ComboDto filter) {
        return generarCombo("GET_COMBO_PROVINCIA", filter);
    }

    /**
     * Metodo que genera un combo de tipo comuna.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @param filter objeto que tiene el codigo de la provincia para generar el combo.
     * @return retorna un combo generico
     */
    @Override
    public List<ComboDto> getComboComuna(ComboDto filter) {
        return generarCombo("GET_COMBO_COMUNA", filter);
    }

    /**
     * Metodo que genera un combo de tipo marca del vehiculo.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna un combo generico
     */
    @Override
    public List<ComboDto> getComboMarca() {
        return generarCombo("GET_COMBO_MARCA");
    }

    /**
     * Metodo que genera un combo de tipo modelo del vehiculo.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna un combo generico
     */
    @Override
    public List<ComboDto> getComboModelo(ComboDto filter) {
        return generarCombo("GET_COMBO_MODELO", filter);
    }
}
