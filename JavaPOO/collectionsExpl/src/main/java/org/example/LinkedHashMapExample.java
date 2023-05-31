package org.example;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map;
/*En este ejemplo, creamos un LinkedHashMap que almacena objetos de la clase Persona como
clave y valores de tipo Double. Obtenemos un Iterator del conjunto de entradas (EntrySet)
del LinkedHashMap utilizando el método entrySet().iterator(). Luego, iteramos sobre los
elementos utilizando el Iterator y mostramos cada clave y valor en la salida.*/
public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Persona, Double> map = new LinkedHashMap<>();

        map.put(new Persona("John", 25), 5.5);
        map.put(new Persona("Alice", 30), 7.8);
        map.put(new Persona("Bob", 35), 6.2);

        Iterator<Map.Entry<Persona, Double>> iterator = map.entrySet().iterator();

        // Iterar sobre los elementos utilizando el Iterator
        while (iterator.hasNext()) {
            Map.Entry<Persona, Double> entry = iterator.next();
            Persona persona = entry.getKey();
            Double puntaje = entry.getValue();
            System.out.println(persona + " - " + puntaje);
        }
    }
}
