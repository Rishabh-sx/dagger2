package com.dagger2.di;

import com.dagger2.pojo.Engine;
import com.dagger2.pojo.engines.DieselEngine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
 
/*@Module
public abstract class DieselEngineModule {
 
    @Binds
    abstract Engine bindEngine(DieselEngine engine);

}*/

@Module
public class DieselEngineModule {

    @Provides
    Engine providesEngine(DieselEngine engine){
        return engine;
    }

}


