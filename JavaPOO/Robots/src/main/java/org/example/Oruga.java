package org.example;

import org.example.armamento.Armamento;

public class Oruga extends Robot{

    public Oruga(String numSerie, Armamento armamento, Integer res) {
        this.setNumSerie(numSerie);
        this.setResistencia(res);
        this.setArmamento(armamento);
        this.setEntorno("Cualquiera");
        this.setKmLeft(400);
        this.setRestaHp(3);
    }
    public Integer restarPotenciaTraccion(Integer potenciaTraccion) {
        return potenciaTraccion - 3;
    }
    public boolean necesitaReemplazo() {
        return this.getKmLeft() <= 0;
    }
}