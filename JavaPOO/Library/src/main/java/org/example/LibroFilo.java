package org.example;

public class LibroFilo extends Libro{

    public LibroFilo(Integer id, String titulo, Integer cantCaps, Boolean prestado) {
        super(id, titulo, cantCaps, prestado);
    }

    @Override
    public Integer getDiasPrestamo() {
        return 14;
    }
}
