package com.local;

public class DirectorAprobacion extends BaseAprobacion {
    private static final double LIMITE_APROBACION = 1000;

    @Override
    protected boolean puedeAprobar(Double t) {
        return t <= LIMITE_APROBACION && t > 0;
    }
}
