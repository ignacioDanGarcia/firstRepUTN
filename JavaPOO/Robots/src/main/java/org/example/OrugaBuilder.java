package org.example;

import org.example.armamento.Armamento;

public class OrugaBuilder implements RobotBuilder{
    private Oruga producto;

    public void setProducto(Oruga producto) {
        this.producto = producto;
    }

    public Oruga getProducto() {
        return producto;
    }
    public OrugaBuilder(String numSerie, Armamento armamento, Integer res){
        this.producto = new Oruga(numSerie, armamento, res);
    }

    //NUMSERIE
    public void setNumSerie(String numSerie) {
        this.producto.setNumSerie(numSerie);
    }
    public String getNumSerie() {
        return this.producto.getNumSerie();
    }

    //TRACCION
    public void setTraccion(String traccion) {
        this.producto.setTraccion(traccion);
    }

    public String getTraccion() {
        return this.producto.getTraccion();
    }
    //RESISTENCIA
    @Override
    public void setResistencia(Integer resistencia) {
        this.producto.setResistencia(resistencia);
    }
    public Integer getResistencia() {
        return this.producto.getResistencia();
    }


    //ARMAMENTO
    @Override
    public void setArmamento(Armamento armamento) {
        this.producto.setArmamento(armamento);

    }
    public Armamento getArmamento() {
        return this.producto.getArmamento();
    }

    public Oruga getObject(){
        return this.producto;
    }

}
