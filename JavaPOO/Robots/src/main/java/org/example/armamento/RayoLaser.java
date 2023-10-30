package org.example.armamento;

public class RayoLaser extends Armamento {
    @Override
    public Integer restarResistencia(Integer resistencia) {
        return resistencia - 20;
    }
}
