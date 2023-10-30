package org.example;

import org.example.armamento.Armamento;

public class RuedaCaucho extends Robot{


    //--------------------------------------
    public RuedaCaucho(String numSerie, Armamento armamento, Integer res) {
        this.setNumSerie(numSerie);
        this.setResistencia(res);
        this.setArmamento(armamento);
        this.setEntorno("Urbanos");
        this.setPotenciaTraccionBase(10);
        this.setKmLeft(100);
        this.setRestaHp(1);
    }

    public Integer restarPotenciaTraccion(Integer potenciaTraccion) {
        return potenciaTraccion - 1;
    }
    public boolean necesitaReemplazo() {
        return this.getKmLeft() <= 0;
    }
}
