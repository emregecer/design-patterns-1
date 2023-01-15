package com.emregecer.designpatterns.behavioral.observer.example1.listeners;

import java.io.File;

public interface EventListener {

    void update(String eventType, File file);

}
