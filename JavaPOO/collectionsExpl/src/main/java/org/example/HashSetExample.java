package org.example;
import java.util.HashSet;
import java.util.Iterator;
/*
HashSet implementa la interfaz Set utilizando una tabla hash.
No mantiene ningún orden específico de los elementos.
Ofrece un tiempo de acceso constante para las operaciones básicas (add, remove, contains, etc.).
No permite elementos duplicados.
*/
public class HashSetExample {
    public static void main(String[] args) {

        HashSet<Persona> set = new HashSet<>();


        set.add(new Persona("Juan", 25));
        set.add(new Persona("Alicia", 30));
        set.add(new Persona("Pepe", 35));

        // Iterar sobre los elementos utilizando el Iterator
        Iterator<Persona> it = set.iterator();
        while (it.hasNext()){
            Persona persona = (Persona)it.next();
            System.out.println(persona);
        }
    }
}
