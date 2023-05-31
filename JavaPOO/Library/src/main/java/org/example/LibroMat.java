package org.example;

public class LibroMat extends Libro{
    public LibroMat(Integer id, String titulo, Integer cant_capitulos, Boolean prestado) {
        super(id, titulo, cant_capitulos, prestado);
    }

    @Override
    public Integer getDiasPrestamo() {
        if (this.getcantCaps() >= 2) return 21;
        else return 7;
    }
}
