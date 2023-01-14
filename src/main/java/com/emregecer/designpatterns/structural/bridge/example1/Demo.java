package com.emregecer.designpatterns.structural.bridge.example1;

import com.emregecer.designpatterns.structural.bridge.example1.devices.Device;
import com.emregecer.designpatterns.structural.bridge.example1.devices.Radio;
import com.emregecer.designpatterns.structural.bridge.example1.devices.Tv;
import com.emregecer.designpatterns.structural.bridge.example1.remotes.AdvancedRemote;
import com.emregecer.designpatterns.structural.bridge.example1.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
