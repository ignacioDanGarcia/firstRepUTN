package org.example.webcams;

import org.example.webcams.webcam;

public class StarterWebcam implements webcam {
    @Override
    public void write(){
        System.out.println("You have chosen starter webcam.");
    }
}
