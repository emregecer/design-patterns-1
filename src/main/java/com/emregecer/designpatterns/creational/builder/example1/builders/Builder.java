package com.emregecer.designpatterns.creational.builder.example1.builders;

import com.emregecer.designpatterns.creational.builder.example1.car.CarType;
import com.emregecer.designpatterns.creational.builder.example1.components.Engine;
import com.emregecer.designpatterns.creational.builder.example1.components.GPSNavigator;
import com.emregecer.designpatterns.creational.builder.example1.components.Transmission;
import com.emregecer.designpatterns.creational.builder.example1.components.TripComputer;

/**
 * Common Builder Interface
 * The builder interface defines all possible ways to configure a product.
 */
public interface Builder {

    void setCarType(CarType type);

    void setSeats(int seats);

    void setEngine(Engine engine);

    void setTransmission(Transmission transmission);

    void setTripComputer(TripComputer tripComputer);

    void setGPSNavigator(GPSNavigator gpsNavigator);

}
