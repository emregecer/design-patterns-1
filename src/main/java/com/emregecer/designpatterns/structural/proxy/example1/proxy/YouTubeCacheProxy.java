package com.emregecer.designpatterns.structural.proxy.example1.proxy;

import com.emregecer.designpatterns.structural.proxy.example1.somelibrary.ThirdPartyYouTubeClass;
import com.emregecer.designpatterns.structural.proxy.example1.somelibrary.ThirdPartyYouTubeLib;
import com.emregecer.designpatterns.structural.proxy.example1.somelibrary.Video;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib {

    private final ThirdPartyYouTubeLib youtubeService;

    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private final HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    public YouTubeCacheProxy() {
        this.youtubeService = new ThirdPartyYouTubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Retrieved list from cache.");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}
