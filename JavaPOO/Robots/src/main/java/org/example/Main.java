package org.example;

import org.example.armamento.Armamento;
import org.example.armamento.Granadas;
import org.example.armamento.RayoLaser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Armamento armGranadas = new Granadas();
        RobotBuilder ruedaCauchoBuilder = new RuedaCauchoBuilder( "KT-2020-P1",armGranadas, 100);
        RuedaCaucho robot1 = ((RuedaCauchoBuilder) ruedaCauchoBuilder).getObject();

        Armamento armRayo = new RayoLaser();
        RobotBuilder orugaBuilder = new OrugaBuilder("KT-2020-P2", armRayo, 150);
        Oruga robot2 = ((OrugaBuilder) orugaBuilder).getObject();

    }
}