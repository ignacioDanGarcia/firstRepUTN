package org.example;

import org.example.factories.abcFactory;
import org.example.headsets.headset;
import org.example.kitKM.kitKboardMouse;
import org.example.webcams.webcam;

public class Combo {
    private webcam webcam;
    private headset headset;
    private kitKboardMouse kitKM;
    public Combo(abcFactory factory){
        this.headset = factory.createHeadset();
        this.kitKM = factory.createKitKM();
        this.webcam = factory.createWebcam();
    }
    public void write(){
        this.headset.write();
        this.webcam.write();
        this.kitKM.write();
    }

    public void setHeadset(org.example.headsets.headset headset) {
        this.headset = headset;
    }

    public org.example.headsets.headset getHeadset() {
        return this.headset;
    }

    public void setKitKM(kitKboardMouse kitKM) {
        this.kitKM = kitKM;
    }

    public kitKboardMouse getKitKM() {
        return this.kitKM;
    }

    public void setWebcam(org.example.webcams.webcam webcam) {
        this.webcam = webcam;
    }

    public org.example.webcams.webcam getWebcam() {
        return this.webcam;
    }
}
