package com.local;

public class Main {
    public static void main(String[] args) {

        AprobacionHandler apro1 = new SupervisorAprobacion();
        AprobacionHandler apro2 = new GerenteAprobacion();
        AprobacionHandler apro3 = new DirectorAprobacion();
        // Crear cadena de manejadores
        apro2.nextHandler(apro3);
        apro1.nextHandler(apro2);

        // Iniciar
        apro1.handler(550D);
    }
}