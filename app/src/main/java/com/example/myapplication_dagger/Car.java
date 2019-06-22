package com.example.myapplication_dagger;

import android.util.Log;

public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    // now we allow Android studio generate public constructors for above private carparts

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }
    public void drive(){
        Log.d(TAG, "driving...");
    }
}
