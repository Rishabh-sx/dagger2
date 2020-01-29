package com.dagger2.pojo.engines;

import android.util.Log;

import com.dagger2.pojo.Engine;

import javax.inject.Inject;
 
public class DieselEngine implements Engine {

    private static final String TAG = "Car";
    private final int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }
 
    @Override
    public void start() {
        Log.e(TAG, "Diesel engine started" +
                 "\nHorsepower: " + horsePower);
    }
}