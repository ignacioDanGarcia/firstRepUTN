package org.example.factories;

import org.example.headsets.StarterHeadset;
import org.example.headsets.headset;
import org.example.kitKM.StarterKitKboardMouse;
import org.example.kitKM.kitKboardMouse;
import org.example.webcams.StarterWebcam;
import org.example.webcams.webcam;

public class Starter implements abcFactory {
    @Override
    public webcam createWebcam(){
        return new StarterWebcam();
    }

    @Override
    public headset createHeadset(){
        return new StarterHeadset();
    }
    @Override
    public kitKboardMouse createKitKM(){
        return new StarterKitKboardMouse();
    }
}
