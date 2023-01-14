package com.emregecer.designpatterns.structural.adapter.example1.example1.round;

/**
 * RoundPegs are compatible with RoundHoles.
 */
public class RoundPeg {

    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
