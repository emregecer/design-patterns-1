package com.emregecer.designpatterns.behavioral.iterator.example1.iterators;

import com.emregecer.designpatterns.behavioral.iterator.example1.profile.Profile;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();

}
