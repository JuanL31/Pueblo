package com.example.pueblo;

import java.io.Serializable;

public class ActividadTuristica implements Serializable {
    String informacion;
    String actividad;
    int fotosahagun;

    public ActividadTuristica(String informacion, String actividad, int fotosahagun) {
        this.informacion = informacion;
        this.actividad = actividad;
        this.fotosahagun = fotosahagun;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getFotosahagun() {
        return fotosahagun;
    }

    public void setFotosahagun(int fotosahagun) {
        this.fotosahagun = fotosahagun;
    }
}
