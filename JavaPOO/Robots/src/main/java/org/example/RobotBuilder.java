package org.example;

import org.example.armamento.Armamento;

public interface RobotBuilder {
    void setNumSerie(String modelo);
    void setArmamento(Armamento armamento);


    void setTraccion(String traccion);

    void setResistencia(Integer resistencia);

}
