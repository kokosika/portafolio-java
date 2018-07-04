package com.serviexpress.repositorios.interfaces.util;

import com.serviexpress.dto.util.ComboDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

/**
 * Interface base de la logica de combos dentro de la aplicacion.
 * Hereda de la interfaz IBaseRepositorio para obtener declaraciones especificas para
 * su funcionamiento.
 * <p>
 * 1.0 Franco Cortez - Version Inicial.
 */
public interface IComboRepositorio extends IBaseRepositorio {
    /**
     * Metodo que genera un combo de tipo pais.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna un combo generico.
     */
    public List<ComboDto> getComboPais();

    /**
     * Metodo que genera un combo de tipo region.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param filter objeto que tiene el codigo del pais para generar el combo.
     * @return retorna un combo generico
     */
    public List<ComboDto> getComboRegion(ComboDto filter);

    /**
     * Metodo que genera un combo de tipo provincia.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param filter objeto que tiene el codigo de la region para generar el combo.
     * @return retorna un combo generico
     */
    public List<ComboDto> getComboProvincia(ComboDto filter);

    /**
     * Metodo que genera un combo de tipo comuna.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @param filter objeto que tiene el codigo de la provincia para generar el combo.
     * @return retorna un combo generico
     */
    public List<ComboDto> getComboComuna(ComboDto filter);

    /**
     * Metodo que genera un combo de tipo marca del vehiculo.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna un combo generico
     */
    public List<ComboDto> getComboMarca();

    /**
     * Metodo que genera un combo de tipo modelo del vehiculo.
     * <p>
     * 1.0 Franco Cortez - Version Inicial
     *
     * @return retorna un combo generico
     */
    public List<ComboDto> getComboModelo(ComboDto filter);

    /**
     * Metodo que genera un combo de las sucursales.
     * <p>
     * 1.0 Franco Cortez - Version inicial
     *
     * @return retorna un combo generico
     */
    public List<ComboDto> getComboSucursal();

    public List<ComboDto> getVehiculosPorUsuario(ComboDto filter);
}
