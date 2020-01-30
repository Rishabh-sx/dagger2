package com.dagger2.pojo;

import android.util.Log;

import com.dagger2.di.ActivityScope;
import com.dagger2.externalLibrary.Wheels;

import javax.inject.Inject;

// Order Of Dagger to execute inject annotation
// Constructor -> Fields -> Methods

@ActivityScope
public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.e(TAG, driver + "drives ..." + this);
        engine.start();
    }
}
