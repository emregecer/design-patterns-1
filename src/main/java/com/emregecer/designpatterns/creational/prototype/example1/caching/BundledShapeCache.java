package com.emregecer.designpatterns.creational.prototype.example1.caching;

import com.emregecer.designpatterns.creational.prototype.example1.Circle;
import com.emregecer.designpatterns.creational.prototype.example1.Rectangle;
import com.emregecer.designpatterns.creational.prototype.example1.Shape;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype Factory
 */
public class BundledShapeCache {

    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }

}
