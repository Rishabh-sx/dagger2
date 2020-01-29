package com.dagger2.pojo.engines;

import android.util.Log;

import com.dagger2.pojo.Engine;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    int horsePower;
    int engineCapacity;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower, @Named("engineCapacity") int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {

        Log.e(TAG, "Petrol engine started" +
                "\nHorsepower: " + horsePower   +
                "\nengineCapacity: " + engineCapacity);
    }
}