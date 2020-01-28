package com.dagger2.di;

import com.dagger2.TestActivity;
import com.dagger2.pojo.Car;

import dagger.Component;

@Component
public interface CarComponent {

    // Method name can be anything dagger is
    // only interested in return type of the method.
    Car getCar();

    // Field injection is meant for framework types
    // data entry instantiates like activities and fragment as
    // we do not own framework instantiates and hence can't do construction injection.
    void inject(TestActivity testActivity);

}
