package com.local;

public abstract class BaseAprobacion implements AprobacionHandler {

    private AprobacionHandler nextAprobacionHandler;

    public BaseAprobacion() {
    }

    public AprobacionHandler getNextAprobacionHandler() {
        return this.nextAprobacionHandler;
    }

    public void setNextAprobacionHandler(AprobacionHandler nextAprobacionHandler) {
        this.nextAprobacionHandler = nextAprobacionHandler;
    }

    public void nextHandler(AprobacionHandler t) {
        this.setNextAprobacionHandler(t);
    }

    public void handler(Double t) {
        if (puedeAprobar(t)) {
            System.out.println("Ha sido aprobado por " + getClass().getSimpleName());
        } else if (this.nextAprobacionHandler != null) {
            this.nextAprobacionHandler.handler(t);
        } else {
            System.out.println("No fue posible aprobar la solicitud");
        }
    }

    protected abstract boolean puedeAprobar(Double t);

    @Override
    public String toString() {
        return "{" +
                " nextAprobacionHandler='" + getNextAprobacionHandler() + "'" +
                "}";
    }

}
