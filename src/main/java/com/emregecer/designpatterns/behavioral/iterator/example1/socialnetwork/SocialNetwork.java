package com.emregecer.designpatterns.behavioral.iterator.example1.socialnetwork;

import com.emregecer.designpatterns.behavioral.iterator.example1.iterators.ProfileIterator;

public interface SocialNetwork {

    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);

}
