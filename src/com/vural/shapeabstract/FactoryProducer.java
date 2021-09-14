package com.vural.shapeabstract;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();

        }

        return null;
    }
}
