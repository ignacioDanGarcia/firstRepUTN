package org.example;
import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList es una implementación de la interfaz List en Java que utiliza un arreglo dinámico
para almacenar los elementos. Proporciona un acceso rápido a los elementos por índice, pero
puede tener un rendimiento más lento para insertar o eliminar elementos en el medio de la lista.
*/
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Persona> list = new ArrayList<>();


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
