package org.example;

import org.example.armamento.Armamento;

public abstract class Robot {
    private String numSerie;
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }
    public String getNumSerie() {
        return this.numSerie;
    }


    //------------------------------------
    //TRACCION
    private String traccion;
    public void setTraccion(String traccion) {
        this.traccion = traccion;

    }

    public String getTraccion() {
        return this.traccion;
    }
    //------------------------------
    private Integer resistencia;
    public void setResistencia(Integer resistencia) {
        this.resistencia = resistencia;
    }
    public Integer getResistencia() {
        return this.resistencia;
    }
    //--------------------------------
    private Armamento armamento;
    public void setArmamento(Armamento armamento) {
        this.armamento = armamento;

    }
    public Armamento getArmamento() {
        return this.armamento;
    }
    //--------------------------------
    private String entorno;
    public void setEntorno(String entorno) {
        this.entorno = entorno;
    }

    public String getEntorno() {
        return this.entorno;
    }
    //--------------------------------
    private Integer restaHp;

    public void setRestaHp(Integer restaHp) {
        this.restaHp = restaHp;
    }

    public Integer getRestaHp() {
        return this.restaHp;
    }

    //--------------------------------
    private Integer kmLeft;
    public void setKmLeft(Integer kmLeft) {
        this.kmLeft = kmLeft;
    }

    public Integer getKmLeft() {
        return this.kmLeft;
    }
    //--------------------------------
    private Integer potenciaTraccionBase;
    public Integer getPotenciaTraccionBase() {
        return potenciaTraccionBase;
    }

    public void setPotenciaTraccionBase(Integer potenciaTraccionBase) {
        this.potenciaTraccionBase = potenciaTraccionBase;
    }

    public abstract Integer restarPotenciaTraccion(Integer potenciaTraccion);
    public abstract boolean necesitaReemplazo();
}
