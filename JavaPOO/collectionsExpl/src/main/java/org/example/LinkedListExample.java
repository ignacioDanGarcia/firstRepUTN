package org.example;
import java.util.LinkedList;
import java.util.Iterator;

/*
LinkedList es una implementación de la interfaz List en Java que utiliza una estructura de
lista enlazada para almacenar los elementos. Proporciona un acceso rápido para insertar o
eliminar elementos en el medio de la lista, pero puede tener un rendimiento más lento para
el acceso por índice.
*/

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<Persona> list = new LinkedList<>();


        list.add(new Persona("Juan", 25));
        list.add(new Persona("Alicia", 30));
        list.add(new Persona("Pepe", 35));


        Iterator<Persona> iterator = list.iterator();

        // Iterar sobre los elementos utilizando el Iterator
        while (iterator.hasNext()) {
            Persona persona = iterator.next();
            System.out.println(persona);
        }
    }
}
