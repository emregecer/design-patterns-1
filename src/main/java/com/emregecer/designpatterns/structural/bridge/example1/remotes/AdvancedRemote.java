package com.emregecer.designpatterns.structural.bridge.example1.remotes;

import com.emregecer.designpatterns.structural.bridge.example1.devices.Device;

public class AdvancedRemote extends BasicRemote {

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
