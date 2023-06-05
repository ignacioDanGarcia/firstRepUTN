package org.example;

import org.example.factories.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose your combo!");
        // just modify the factory instance

        abcFactory Factory;
        Factory = new Platinum();
        Combo combo = new Combo(Factory);
        combo.write();

    }
}