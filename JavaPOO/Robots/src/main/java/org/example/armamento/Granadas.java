package org.example.armamento;

public class Granadas extends Armamento {
    @Override
    public Integer restarResistencia(Integer resistencia) {
        return resistencia - 35;
    }
}
