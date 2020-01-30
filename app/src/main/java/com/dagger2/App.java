package com.dagger2;

import android.app.Application;

import com.dagger2.di.AppComponent;

import com.dagger2.di.DaggerAppComponent;

public class App extends Application {
    private AppComponent component;
 
    @Override
    public void onCreate() {
        super.onCreate();
 
        component = DaggerAppComponent.create();
    }
 
    public AppComponent getAppComponent() {
        return component;
    }
}