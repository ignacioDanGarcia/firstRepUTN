package org.example;

import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    private Map<Integer, Libro> librosBiblioteca;
    public Biblioteca() {
        this.librosBiblioteca = new HashMap<>();
    }
    public Map<Integer, Libro> getLibrosBiblioteca() {
        return librosBiblioteca;
    }
    public void setLibrosBiblioteca(Map<Integer, Libro> librosBiblioteca) {
        this.librosBiblioteca = librosBiblioteca;
    }
    public void agregarLibro(Libro libro){
        this.librosBiblioteca.put(libro.getId(), libro);
    }
    public Libro traerLibro(Integer id){
        return this.librosBiblioteca.get(id);
    }
    public void prestarLibro(Persona persona, Integer id){
        persona.agregarLibro(this.traerLibro(id));

        this.librosBiblioteca.get(id).setPrestado(true);
        this.librosBiblioteca.get(id).setPersonaTomaPrestado(persona);
    }
    public void consultarDispo(Libro libro){
        if (this.librosBiblioteca.get(libro.getId()).getPrestado()) System.out.println("Prestado");
        else System.out.println("Disponible");
    }

    public void mostrarTamaBiblio(){
        System.out.println("Tenemos: " + this.librosBiblioteca.size() + " libros registrados en la biblio :)");
    }
    public void printCantDispo(){
        Integer contador = 0;
        for (Map.Entry<Integer,Libro> entrada : this.librosBiblioteca.entrySet()){
            if (!entrada.getValue().getPrestado()) contador++;
        }
        System.out.println("Tenemos " + contador + " Libros disponibles. ");
    }

    public void consultarAQuienPresto(Integer id){
        if (!this.librosBiblioteca.get(id).getPrestado()) System.out.println("Disponible en la biblio");
        else{
            System.out.println("El libro fue prestado a " + this.librosBiblioteca.get(id).getPersonaTomaPrestado().getNombre());
        }
    }
}