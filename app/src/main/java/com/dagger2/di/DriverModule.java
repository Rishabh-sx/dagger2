package com.dagger2.di;

import com.dagger2.pojo.Driver;

import javax.inject.Singleton;
 
import dagger.Module;
import dagger.Provides;
 
@Module
public abstract class DriverModule {
 
    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}