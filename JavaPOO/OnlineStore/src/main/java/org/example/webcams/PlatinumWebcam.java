package org.example.webcams;

import org.example.webcams.webcam;

public class PlatinumWebcam implements webcam {
    @Override
    public void write(){
        System.out.println("You have chosen platinum webcam.");
    }
}
