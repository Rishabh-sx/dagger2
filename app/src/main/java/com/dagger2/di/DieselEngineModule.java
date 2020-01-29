package com.dagger2.di;

import com.dagger2.pojo.Engine;
import com.dagger2.pojo.engines.DieselEngine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int providesHorsePower() {
        return horsePower;
    }

    @Provides
    Engine providesEngine() {
        return new DieselEngine(horsePower);
    }

}


