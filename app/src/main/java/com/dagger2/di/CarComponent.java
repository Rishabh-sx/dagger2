package com.dagger2.di;

import com.dagger2.TestActivity;
import com.dagger2.pojo.Car;

import dagger.Component;

@Component
public interface CarComponent {

    // Method name can be anything dagger is
    // only interested in return type of the method.
    Car getCar();

    void inject(TestActivity testActivity);

}
