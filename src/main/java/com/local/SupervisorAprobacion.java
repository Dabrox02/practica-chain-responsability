package com.local;

public class SupervisorAprobacion extends BaseAprobacion {

    private static final double LIMITE_APROBACION = 100;

    @Override
    protected boolean puedeAprobar(Double t) {
        return t <= LIMITE_APROBACION && t > 0;
    }

}
