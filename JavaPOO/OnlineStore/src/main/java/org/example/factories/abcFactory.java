package org.example.factories;

import org.example.headsets.headset;
import org.example.kitKM.kitKboardMouse;
import org.example.webcams.webcam;

public interface abcFactory {
    webcam createWebcam();
    headset createHeadset();
    kitKboardMouse createKitKM();
}
