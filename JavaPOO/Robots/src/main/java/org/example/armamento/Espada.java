package org.example.armamento;

public class Espada extends Armamento {
    @Override
    public Integer restarResistencia(Integer resistencia) {
        return resistencia - 3;
    }
}
