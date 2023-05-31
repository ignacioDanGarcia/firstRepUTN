package org.example;

public class Libro {
    private Integer id;
    private String titulo;
    private Integer cantCaps;

    public Libro(Integer id, String titulo, Integer cantCaps, Boolean prestado) {
        this.id = id;
        this.titulo = titulo;
        this.cantCaps = cantCaps;
        this.prestado = prestado;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public Integer getcantCaps() {
        return cantCaps;
    }
    public void setcantCaps(Integer cantCaps) {
        this.cantCaps = cantCaps;
    }

    private Boolean prestado;
    public Boolean getPrestado() {
        return prestado;
    }
    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    private Persona personaTomaPrestado;
    public Persona getPersonaTomaPrestado() {
        return personaTomaPrestado;
    }

    public void setPersonaTomaPrestado(Persona personaTomaPrestado) {
        this.personaTomaPrestado = personaTomaPrestado;
    }


    public Integer getDiasPrestamo(){
        return 35;
    }
}