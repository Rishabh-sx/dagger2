package com.dagger2.di;

import com.dagger2.pojo.Engine;
import com.dagger2.pojo.engines.PetrolEngine;

import dagger.Binds;
import dagger.Module;
 
@Module
public abstract class PetrolEngineModule {
 
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}