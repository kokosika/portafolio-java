package com.serviexpress.repositorios.interfaces.domain;

import com.serviexpress.dto.util.ComboDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

public interface IEstadoUsuarioRepositorio extends IBaseRepositorio {
    /**
     * Genera un combo con code y name, para su uso en el cliente.
     * Llama al procedimiento GET_COMBO_ESTADO_USUARIO
     *
     * @return lista con un comboDto
     */
    public List<ComboDto> getComboEstadoUsuario();
}
