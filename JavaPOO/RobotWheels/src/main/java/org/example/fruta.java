package org.example;

public class fruta {
    private Double peso;
    private Boolean esEstacional;
    public Boolean esComestible(){
        if (this.peso < 200 && esEstacional){
            return true;
        }
        return false;
    }
}
