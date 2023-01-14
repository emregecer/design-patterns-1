package com.emregecer.designpatterns.structural.proxy.example1.somelibrary;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}