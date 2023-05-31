package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/*En este ejemplo, utilizaremos un HashMap con objetos de la clase Persona como clave y valores
asociados. La clase Persona debe tener correctamente implementados los métodos equals() y
hashCode() para garantizar el correcto funcionamiento del HashMap.
*/
public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Persona, String> map = new HashMap<>();


        map.put(new Persona("John", 25), "Inglaterra");
        map.put(new Persona("Alice", 30), "Estados Unidos");
        map.put(new Persona("Bob", 35), "Canadá");


        Iterator<Map.Entry<Persona, String>> iterator = map.entrySet().iterator();

        // Iterar sobre los elementos utilizando el Iterator
        while (iterator.hasNext()) {
            Map.Entry<Persona, String> entry = iterator.next();
            Persona persona = entry.getKey();
            String pais = entry.getValue();
            System.out.println(persona + " - " + pais);
        }
    }
}
