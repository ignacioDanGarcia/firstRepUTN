package org.example;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
/*En este ejemplo, utilizaremos un TreeMap con objetos de la clase Persona como clave.
La clase Persona debe implementar la interfaz Comparable o proporcionar un comparador
personalizado.*/
public class TreeMapIteratorExample {
    public static void main(String[] args) {
        TreeMap<Persona, Integer> map = new TreeMap<>();

        map.put(new Persona("John", 25), 100);
        map.put(new Persona("Alice", 30), 200);
        map.put(new Persona("Bob", 35), 300);

        Iterator<Map.Entry<Persona, Integer>> iterator = map.entrySet().iterator();

        // Iterar sobre los elementos utilizando el Iterator
        while (iterator.hasNext()) {
            Map.Entry<Persona, Integer> entry = iterator.next();
            Persona persona = entry.getKey();
            int valor = entry.getValue();
            System.out.println(persona + " - " + valor);
        }
    }
}
