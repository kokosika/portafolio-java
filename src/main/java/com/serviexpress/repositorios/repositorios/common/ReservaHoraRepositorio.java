package com.serviexpress.repositorios.repositorios.common;

import com.serviexpress.dto.common.ReservaDetalleCustomDto;
import com.serviexpress.dto.custom.DetalleServicioDto;
import com.serviexpress.dto.custom.ReservaHoraDto;
import com.serviexpress.dto.custom.ServicioPorDiagnosticoDto;
import com.serviexpress.repositorios.context.ReservaHoraContext;
import com.serviexpress.repositorios.interfaces.common.IReservaHoraRepositorio;
import com.serviexpress.repositorios.repositorios.BaseRepositorio;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Repository
@EnableAutoConfiguration
@Transactional
public class ReservaHoraRepositorio extends BaseRepositorio<ReservaHoraContext> implements IReservaHoraRepositorio {

    public ReservaHoraRepositorio(ReservaHoraContext context) {
        super(context);
    }

    public ServicioPorDiagnosticoDto guardarReservaHora(ReservaHoraDto reservaHora) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_CLIENTE_ID", reservaHora.getClienteId());
        params.put("V_EMPLEADO_ID", reservaHora.getEmpleadoId());
        params.put("V_ESTADO_RESERVA_ID", reservaHora.getEstadoReservaId());
        params.put("V_SUCURSAL_ID", reservaHora.getSucursalId());
        params.put("V_TIPO_RESERVA_ID", reservaHora.getTipoReservaId());
        params.put("V_VEHICULO_ID", reservaHora.getVehiculoId());
        params.put("V_FECHA_RESERVA", reservaHora.getFechaReserva());
        List<ServicioPorDiagnosticoDto> result = (List<ServicioPorDiagnosticoDto>) executeList(ServicioPorDiagnosticoDto.class, "PRC_INSERT_RESERVA_HORA", params);
        if (result.isEmpty())
            return null;
        return result.get(0);
    }

    public void guardarServicioPorDiagnostico(ServicioPorDiagnosticoDto servicioPorDiagnostico) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_ID_DIAGNOSTICO", servicioPorDiagnostico.getIdDiagnostico());
        params.put("V_ID_SERVICIO", servicioPorDiagnostico.getIdServicio());
        params.put("V_ID_ESTADO", servicioPorDiagnostico.getIdEstado());
        execute("PRC_INSERTAR_SER_X_DIAG", params);

    }

    public List<ReservaDetalleCustomDto> getReservasCliente(String nombreUsuario) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("NOMBRE_USUARIO", nombreUsuario);
        return (List<ReservaDetalleCustomDto>) executeList(ReservaDetalleCustomDto.class, "PRC_GET_RESERVAS_CLIENTE", params);

    }

    public List<DetalleServicioDto> getDetalleServicios(Integer idDiagnostico) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("V_ID_DIAGNOSTICO", idDiagnostico);
        return (List<DetalleServicioDto>) executeList(DetalleServicioDto.class, "PRC_DETALLE_SERVICIOS", params);

    }
}
