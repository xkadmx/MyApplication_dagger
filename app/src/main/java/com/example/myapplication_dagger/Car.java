package com.example.myapplication_dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    // now we allow Android studio generate public constructors for above private carparts
    @Inject  // injecting car constructorr
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    public void drive(){
        Log.d(TAG, "driving...");
    }
}
