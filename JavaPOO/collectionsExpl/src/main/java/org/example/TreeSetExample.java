package org.example;
import java.util.TreeSet;
import java.util.Iterator;
/*
TreeSet implementa la interfaz SortedSet utilizando un árbol binario.
Mantiene los elementos ordenados en orden ascendente (por defecto) o en otro orden especificado mediante un comparador.
Ofrece un tiempo de acceso logarítmico para las operaciones básicas.
No permite elementos duplicados.
*/
public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Persona> set = new TreeSet<>();


        set.add(new Persona("Juan", 25));
        set.add(new Persona("Alicia", 30));
        set.add(new Persona("Pepe", 35));


        Iterator<Persona> iterator = set.iterator();

        // Iterar sobre los elementos utilizando el Iterator
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona);
        }
    }
}