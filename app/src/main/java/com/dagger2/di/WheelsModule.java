package com.dagger2.di;

import com.dagger2.externalLibrary.Rims;
import com.dagger2.externalLibrary.Tires;
import com.dagger2.externalLibrary.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    Rims getRims(){
        return new Rims();
    }

    @Provides
    Tires getTires(){
        Tires t = new Tires();
        t.inflate();
        return t;
    }

    @Provides
    Wheels getWheels(Rims rims, Tires tires){
        return new Wheels(rims,tires);
    }

}
