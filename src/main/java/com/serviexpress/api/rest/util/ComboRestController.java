package com.serviexpress.api.rest.util;

import com.serviexpress.api.rest.BaseRest;
import com.serviexpress.dto.GenericResponse;
import com.serviexpress.dto.util.ComboDto;
import com.serviexpress.servicios.interfaces.util.IComboServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.serviexpress.config.ApiPathConfig.PATH;

@RestController
@RequestMapping(value = PATH + "combo")
public class ComboRestController extends BaseRest {

    /**
     * Injeccion de la interface IComboServicios.
     */
    @Autowired
    private IComboServicios comboServicios;

    /**
     * Metodo que llama al metodo getComboPais de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/pais")
    public ResponseEntity<GenericResponse> getComboPais() {
        return this.comboServicios.getComboPais();
    }

    /**
     * Metodo que llama al metodo getComboRegion de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/region")
    public ResponseEntity<GenericResponse> getComboRegion(@RequestBody ComboDto filter) {
        System.out.println(filter.getCode());
        return this.comboServicios.getComboRegion(filter);
    }

    /**
     * Metodo que llama al metodo getComboProvincia de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/provincia")
    public ResponseEntity<GenericResponse> getComboProvincia(@RequestBody ComboDto filter) {
        return this.comboServicios.getComboProvincia(filter);
    }

    /**
     * Metodo que llama al metodo getComboComuna de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @param filter objecto que contiene el codigo para un combo en cascada
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/comuna")
    public ResponseEntity<GenericResponse> getComboComuna(@RequestBody ComboDto filter) {
        return this.comboServicios.getComboComuna(filter);
    }

    /**
     * Metodo que llama al metodo getComboMarca de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/marca")
    public ResponseEntity<GenericResponse> getComboMarca() {
        return this.comboServicios.getComboMarca();
    }

    /**
     * Metodo que llama al metodo getComboModelo de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/modelo")
    public ResponseEntity<GenericResponse> getComboModelo(@RequestBody ComboDto filter) {
        return this.comboServicios.getComboModelo(filter);
    }

    /**
     * Metodo que llama al metodo getComboSucursal de la Interface IComboServicio.
     * Genera una respuesta tipo json.
     *
     * @return respuesta al cliente.
     */
    @PostMapping(value = "/sucursal")
    public ResponseEntity<GenericResponse> getComboSucursal() {
        return this.comboServicios.getComboSucursal();
    }

    @PostMapping(value = "/vehiculo")
    public ResponseEntity<GenericResponse> getVehiculosPorUsuario(@RequestBody ComboDto filter) {
        return this.comboServicios.getVehiculosPorUsuario(filter);
    }
}
