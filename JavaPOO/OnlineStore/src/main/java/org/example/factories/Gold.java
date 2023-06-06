package org.example.factories;

import org.example.headsets.GoldHeadset;
import org.example.headsets.headset;
import org.example.kitKM.GoldKitKboardMouse;
import org.example.kitKM.kitKboardMouse;
import org.example.webcams.GoldWebcam;
import org.example.webcams.webcam;

public class Gold implements abcFactory {
    @Override
    public webcam createWebcam(){
        return new GoldWebcam();
    }

    @Override
    public headset createHeadset(){
        return new GoldHeadset();
    }
    @Override
    public kitKboardMouse createKitKM(){
        return new GoldKitKboardMouse();
    }
}
