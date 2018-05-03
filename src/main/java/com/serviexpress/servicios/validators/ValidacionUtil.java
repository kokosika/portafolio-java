package com.serviexpress.servicios.validators;

public class ValidacionUtil {

    public static final Validacion<String> notNullString = ValidacionGenerica.from(s -> s != null);
    public static final Validacion<String> notEmptyString = ValidacionGenerica.from(s -> !s.isEmpty());
    public static final Validacion<Integer> notNullInteger = ValidacionGenerica.from(s -> s != null);
    public static final Validacion<Integer> greaterThanZero = ValidacionGenerica.from(s -> s > 0);

    public static final Validacion<String> stringMoreThan(int size) {
        return ValidacionGenerica.from(s -> ((String) s).length() > size);
    }

    ;

    public static final Validacion<String> stringLessThan(int size) {
        return ValidacionGenerica.from(s -> ((String) s).length() < size);
    }

    ;

    public static final Validacion<String> stringBetween(int morethan, int lessThan) {
        return stringMoreThan(morethan).and(stringLessThan(lessThan));
    }

    ;

    public static final Validacion<Integer> integerMoreThan(int limit) {
        return ValidacionGenerica.from(s -> s > limit);
    }

    ;

    public static final Validacion<Integer> integerLessThan(int size) {
        return ValidacionGenerica.from(s -> s < size);
    }

    ;

    public static final Validacion<Integer> integerBetween(int morethan, int lessThan) {
        return integerMoreThan(morethan).and(integerLessThan(lessThan));
    }

    ;

}
