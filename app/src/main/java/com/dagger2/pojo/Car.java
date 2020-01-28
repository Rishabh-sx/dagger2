package com.dagger2.pojo;

import android.util.Log;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public void drive() {
        Log.e(TAG, "driving.. ");
    }
}
