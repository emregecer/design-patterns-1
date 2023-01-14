package com.emregecer.designpatterns.behavioral.mediator.example1.components;

import com.emregecer.designpatterns.behavioral.mediator.example1.mediator.Mediator;

/**
 * Common component interface.
 */
public interface Component {

    void setMediator(Mediator mediator);

    String getName();

}
