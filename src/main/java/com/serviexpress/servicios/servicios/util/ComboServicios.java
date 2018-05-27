package com.serviexpress.servicios.servicios.util;

import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.util.ComboDto;
import com.serviexpress.repositorios.interfaces.util.IComboRepositorio;
import com.serviexpress.servicios.interfaces.util.IComboServicios;
import com.serviexpress.servicios.servicios.BaseServicios;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 * Clase base para la generacion de servicios de combos dentro del sistema.
 * Hereda de la clase BaseSerivicios que contiene logica asociada a la respuesta de los
 * metodos hacia el cliente.
 * Extiende de la clase IComboServicios que contiene la declaracion de todos los
 * metodos de la clase para su injeccion en las siguientes capas.
 * <p>
 * 1.0 Franco Cortez - Version inicial.
 */
@Service
public class ComboServicios extends BaseServicios implements IComboServicios {
    /**
     * Injeccion de la interface IComboRepositorio para la utilizacion de sus metodos.
     */
    private IComboRepositorio comboRepositorio;

    /**
     * Injeccion de repositorios dentro del servicio
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param comboRepositorio injeccion del repositorio IComboRepositorio para la utilizacion de sus metodos.
     */
    public ComboServicios(IComboRepositorio comboRepositorio) {
        this.comboRepositorio = comboRepositorio;
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboPais
     * Envia una respuesta generica al cliente
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica
     */
    @Override
    public ResponseEntity<GenericResponse> getComboPais() {
        try {
            return ok(this.comboRepositorio.getComboPais());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboRegion
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return retorna una respuesta generica.
     */
    @Override
    public ResponseEntity<GenericResponse> getComboRegion(ComboDto filter) {
        try {
            return ok(this.comboRepositorio.getComboRegion(filter));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboProvincia
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return retorna una respuesta generica.
     */
    @Override
    public ResponseEntity<GenericResponse> getComboProvincia(ComboDto filter) {
        try {
            return ok(this.comboRepositorio.getComboProvincia(filter));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboComuna
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return retorna una respuesta generica.
     */
    @Override
    public ResponseEntity<GenericResponse> getComboComuna(ComboDto filter) {
        try {
            return ok(this.comboRepositorio.getComboComuna(filter));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboMarca
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica.
     */
    @Override
    public ResponseEntity<GenericResponse> getComboMarca() {
        try {
            return ok(this.comboRepositorio.getComboMarca());
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboModelo
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica.
     */
    @Override
    public ResponseEntity<GenericResponse> getComboModelo(ComboDto filter) {
        try {
            return ok(this.comboRepositorio.getComboModelo(filter));
        } catch (Exception ex) {
            return customException(ex);
        }
    }

    /**
     * Metodo que genera un combo llamando al repositorio IComboRepositorio a su metodo
     * getComboSucursal
     * <p>
     * 1.0 Franco Cortez - Version inicial.
     *
     * @return retorna una respuesta generica.
     */
    @Override
    public ResponseEntity<GenericResponse> getComboSucursal() {
        try {
            return ok(this.comboRepositorio.getComboSucursal());
        } catch (Exception ex) {
            return customException(ex);
        }
    }
}
