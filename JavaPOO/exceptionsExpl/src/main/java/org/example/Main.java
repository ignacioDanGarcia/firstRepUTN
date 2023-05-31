package org.example;

public class Main {
    //-----------------------------------------------------------------------
    /*
    7.Control y lanzamiento de excepciones personalizadas en Java:

    El control y lanzamiento de excepciones personalizadas en Java implica la creación de
    excepciones personalizadas y su manejo adecuado utilizando bloques try-catch en la
    programación orientada a objetos.

    Aquí hay un ejemplo detallado:
    */

    // Creamos una excepción personalizada que hereda de Exception
    class CustomException extends Exception {
        public CustomException(String message) {
            super(message);
        }
    }

    // Clase que utiliza la excepción personalizada
    class MiClase {
        public void metodoQueLanzaExcepcion() throws CustomException {
            // Lanzamos la excepción personalizada con un mensaje de error
            throw new CustomException("Esto es una excepción personalizada.");
        }
    }

    public class MainTres {
        public static void main(String[] args) {
            MiClase miObjeto = new MiClase();
            try {
                miObjeto.metodoQueLanzaExcepcion();
            } catch (CustomException e) {
                System.out.println("¡Se ha capturado una excepción personalizada!");
                System.out.println("Mensaje de la excepción: " + e.getMessage());
            }
        }
    }
/*
    En este ejemplo, creamos una excepción personalizada llamada CustomException que hereda de la
    clase Exception. Luego, en la clase MiClase, definimos un método llamado metodoQueLanzaExcepcion()
    que lanza la excepción personalizada utilizando la palabra clave throws.


    En el bloque try del método main(), creamos una instancia de MiClase y llamamos al método
    metodoQueLanzaExcepcion(), que lanza la excepción personalizada. Luego, en el bloque catch,
    capturamos la excepción personalizada CustomException y manejamos el error mostrando un mensaje
    en la consola.


    Es importante tener en cuenta que, al utilizar excepciones personalizadas, es necesario declararlas
    con la palabra clave throws en la firma del método que las lanza, y capturarlas adecuadamente
    utilizando bloques try-catch en los lugares apropiados para manejar los errores de manera adecuada.

    El método getMessage() es un método de la clase Throwable, que es la clase base para todas las
    excepciones en Java, incluyendo las excepciones personalizadas que hayas creado. Este método te
    permite obtener el mensaje asociado a la excepción, que puede ser proporcionado cuando se crea la
    instancia de la excepción o durante su lanzamiento.
    Al crear la instancia de la excepción personalizada CustomException
    en la línea throw new CustomException("Esto es una excepción personalizada.");, se le pasa un mensaje
    de error como argumento. Este mensaje de error se puede obtener más tarde utilizando el método
    getMessage() en el bloque catch.

    La clase Exception tiene funciones predeterminadas. El uso de super() en las excepciones personalizadas
    se refiere a llamar al constructor de la clase padre de la jerarquía de excepciones, pasando un mensaje
    de error como argumento.


    Lo que generalmente se hace es una funcion en una clase que pueda tirar una excepcion personalizada, se
    crea la excepcion personalizada que extienda de Exception o runtimeException, y en el mail se coloca la
    funcion que puede generar una excepcion dentro del TRY, y la accion a seguir si salta la excepcion en
    el CATCH. En la clase personalizada, dentro del constructor, se usa el super(<lo pasado por parametros
    que generalmente es un mensaje>)

 */

}