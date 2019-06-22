package com.example.myapplication_dagger;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    // now we allow Android studio generate construckors for above private carparts

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
}
