package org.example;
/*
Crear una clase Persona que tenga los atributos privados nombre y apellido, con sus setters y
getters.
● Crear una clase llamada Visitante con los mismos atributos.
● Crear una clase Guardia con los mismos atributos.
● Crear una instancia de cada una de las clases y asignarle valores.
● Mostrar por pantalla los valores.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Visitante visita = new Visitante();


        visita.setApellido("elMesi" + " wenas");
        System.out.println(visita.getApellido());
    }
}