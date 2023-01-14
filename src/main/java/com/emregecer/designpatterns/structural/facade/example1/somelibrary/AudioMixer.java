package com.emregecer.designpatterns.structural.facade.example1.somelibrary;

import java.io.File;

public class AudioMixer {

    public File fix(VideoFile result) {
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }

}
