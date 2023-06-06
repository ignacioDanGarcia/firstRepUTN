package org.example.factories;

import org.example.headsets.PlatinumHeadset;
import org.example.headsets.headset;
import org.example.kitKM.PlatinumKitKboardMouse;
import org.example.kitKM.kitKboardMouse;
import org.example.webcams.PlatinumWebcam;
import org.example.webcams.webcam;

public class Platinum implements abcFactory {
    @Override
    public webcam createWebcam(){
        return new PlatinumWebcam();
    }

    @Override
    public headset createHeadset(){
        return new PlatinumHeadset();
    }
    @Override
    public kitKboardMouse createKitKM(){
        return new PlatinumKitKboardMouse();
    }
}
