package org.example;

import java.util.*;

public class cine {
    private String pelicula;
    public String getPelicula() {
        return pelicula;
    }
    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    private String horario;
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List obtenerCartelera(){
        List list = new ArrayList();
        list.add(horario);
        list.add(pelicula);

        return list;
    }
}
