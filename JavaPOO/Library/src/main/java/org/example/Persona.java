package org.example;

import java.util.ArrayList;

public class Persona {
    private String nombre;
    private String mail;
    ArrayList<Libro> librosPrestados;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ArrayList<Libro> getlibrosPrestados() {
        return librosPrestados;
    }

    public void setlibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void devolverLibro(Biblioteca biblioteca, Libro libro){
        biblioteca.getLibros_biblio().get(libro.getId()).setPrestado(false);
        //Borrar los datos de quien lo prestó de la biblio.
        this.librosPrestados.remove(libro);
    }
    public void agregarLibro(Libro libro){
        this.librosPrestados.add(libro);
    }
}
