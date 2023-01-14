package com.emregecer.designpatterns.creational.builder.carbuilder.builders;

import com.emregecer.designpatterns.creational.builder.carbuilder.car.CarType;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.Engine;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.GPSNavigator;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.Transmission;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.TripComputer;

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
