package com.serviexpress.servicios.interfaces.util;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.util.ComboDto;
import com.serviexpress.servicios.interfaces.IBaseServicios;
import org.springframework.http.ResponseEntity;


public interface IComboServicios extends IBaseServicios {
    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboPais
     * Envia una respuesta generica al cliente
     *
     * @return retorna una respuesta generica
     */
    public ResponseEntity<GenericResponse> getComboPais();

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboRegion
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return retorna una respuesta generica.
     */
    public ResponseEntity<GenericResponse> getComboRegion(ComboDto filter);

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboProvincia
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return retorna una respuesta generica.
     */
    public ResponseEntity<GenericResponse> getComboProvincia(ComboDto filter);

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboComuna
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return retorna una respuesta generica.
     */
    public ResponseEntity<GenericResponse> getComboComuna(ComboDto filter);

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboMarca
     *
     * @return retorna una respuesta generica.
     */
    public ResponseEntity<GenericResponse> getComboMarca();

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboModelo
     *
     * @return retorna una respuesta generica.
     */
    public ResponseEntity<GenericResponse> getComboModelo(ComboDto filter);

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboSucursal
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica.
     */
    public ResponseEntity<GenericResponse> getComboSucursal();
}
