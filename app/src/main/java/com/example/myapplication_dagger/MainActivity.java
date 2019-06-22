package com.example.myapplication_dagger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // instance of the CarComponent > Interface
        CarComponent component = DaggerCarComponent.create(); // DaggerCarComponent is an implementation of an interface

        //assignation of car to get car

        car = component.getCar();


        car.drive();
    }
}
