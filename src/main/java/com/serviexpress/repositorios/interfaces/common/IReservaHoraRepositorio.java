package com.serviexpress.repositorios.interfaces.common;

import com.serviexpress.dto.common.ReservaDetalleCustomDto;
import com.serviexpress.dto.custom.DetalleServicioDto;
import com.serviexpress.dto.custom.ReservaHoraDto;
import com.serviexpress.dto.custom.ServicioPorDiagnosticoDto;
import com.serviexpress.repositorios.interfaces.IBaseRepositorio;

import java.util.List;

public interface IReservaHoraRepositorio extends IBaseRepositorio {
    public ServicioPorDiagnosticoDto guardarReservaHora(ReservaHoraDto reservaHora);

    public void guardarServicioPorDiagnostico(ServicioPorDiagnosticoDto servicioPorDiagnostico);

    public List<ReservaDetalleCustomDto> getReservasCliente(String nombreUsuario);

    public List<DetalleServicioDto> getDetalleServicios(Integer idDiagnostico);
}
