package com.serviexpress.servicios.validators.custom;

import com.serviexpress.dto.custom.PersonaDto;
import com.serviexpress.servicios.validators.ValidacionUtil;
import com.serviexpress.servicios.validators.interfaces.IPersonaValidator;

public class PersonaValidator implements IPersonaValidator {


    @Override
    public void validate(PersonaDto personaDto) {
        StringBuilder errorFields = new StringBuilder();
        errorFields.append(validarStringNotNullAndNotEmpty(personaDto.getApellido(), "El apellido no puede ser null"));
        errorFields.append(validarStringNotNullAndNotEmpty(personaDto.getNombre(), "El nombre no puede ser null"));
        errorFields.append(validarStringNotNullAndNotEmpty(personaDto.getCorreo(), "El correo no puede ser null"));
        errorFields.append(validarStringNotNullAndNotEmpty(personaDto.getDireccion(), "La direccion no puede ser null"));
        errorFields.append(validarStringNotNullAndNotEmpty(personaDto.getDivId(), "El digito verificador no puede ser null"));
        errorFields.append(validarIntegerNotNullAndNotEmpty(personaDto.getNumId(), "El numero del rut no puede ser null"));
        errorFields.append(validarIntegerNotNullAndNotEmpty(personaDto.getComunaId(), "La comuna no puede ser null"));
        errorFields.append(validarIntegerNotNullAndNotEmpty(personaDto.getEstadoPersonaId(), "El estado de la personano puede ser null"));
    }

    public String validarStringNotNullAndNotEmpty(String campo, String mensaje) {
        return ValidacionUtil.notNullString.or(ValidacionUtil.notEmptyString).test(campo).getFieldNameIfInvalid(mensaje).orElse("");
    }

    public String validarStringNotNull(String campo, String mensaje) {
        return ValidacionUtil.notNullString.test(campo).getFieldNameIfInvalid(mensaje).orElse("");
    }

    public String validarStringEmpty(String campo, String mensaje) {
        return ValidacionUtil.notEmptyString.test(campo).getFieldNameIfInvalid(mensaje).orElse("");
    }

    public String validarIntegerNotNullAndNotEmpty(Integer campo, String mensaje) {
        return ValidacionUtil.notNullInteger.and(ValidacionUtil.greaterThanZero).test(campo).getFieldNameIfInvalid(mensaje).orElse("");
    }
}
