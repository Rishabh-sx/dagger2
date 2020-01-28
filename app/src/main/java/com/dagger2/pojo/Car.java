package com.dagger2.pojo;

import android.util.Log;

import javax.inject.Inject;

// Order Of Dagger to execute inject annotation
// Constructor -> Fields -> Methods

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive() {
        Log.e(TAG, "driving.. ");
    }
}
