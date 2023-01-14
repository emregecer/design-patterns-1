package com.emregecer.designpatterns.creational.builder.carbuilder.builders;

import com.emregecer.designpatterns.creational.builder.carbuilder.car.CarType;
import com.emregecer.designpatterns.creational.builder.carbuilder.car.Manual;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.Engine;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.GPSNavigator;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.Transmission;
import com.emregecer.designpatterns.creational.builder.carbuilder.components.TripComputer;

/**
 * Builder of Car Manual
 * Unlike other creational patterns, Builder can construct unrelated products,
 * which don't have the common interface.
 * In this case we build a user manual for a car, using the same steps as we
 * built a car. This allows to produce manuals for specific car models,
 * configured with different features.
 */
public class CarManualBuilder implements Builder {

    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
