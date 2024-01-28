package com.local;

public class GerenteAprobacion extends BaseAprobacion {

    private static final double LIMITE_APROBACION = 500;

    @Override
    protected boolean puedeAprobar(Double t) {
        return t <= LIMITE_APROBACION && t > 0;
    }

}
