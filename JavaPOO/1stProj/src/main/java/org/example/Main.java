package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        persona nacho = new persona();
        nacho.nombre = "Nacho";
        nacho.apellido = "Garcia";

        System.out.println("Nombre: " + nacho.nombre);
        System.out.println("Apellido: " + nacho.apellido);

        vehiculo auto = new vehiculo();
        auto.modelo = "147";
        auto.marca = "Fiat";
        auto.setPatente("ab999cd");
        System.out.println("Patente: " + auto.getPatente());

        articulo nota = new articulo();
        nota.setMarca("Clarin");
        nota.setModelo("24");

    }
}