package org.example;
import java.util.LinkedHashSet;
import java.util.Iterator;

/*
LinkedHashSet es similar a HashSet, pero mantiene el orden de inserción de los elementos.
Utiliza una lista doblemente enlazada para mantener el orden.
Ofrece un tiempo de acceso constante para las operaciones básicas.
No permite elementos duplicados.
*/
public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Persona> set = new LinkedHashSet<>();


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
