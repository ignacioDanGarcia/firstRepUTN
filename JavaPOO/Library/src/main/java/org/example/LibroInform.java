package org.example;

public class LibroInform extends Libro{
    public LibroInform(Integer id, String titulo, Integer cant_capitulos, Boolean prestado) {
        super(id, titulo, cant_capitulos, prestado);
    }

    @Override
    public Integer getDiasPrestamo() {
        return 14;
    }
}
