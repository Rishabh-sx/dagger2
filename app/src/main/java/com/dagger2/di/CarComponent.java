package com.dagger2.di;

import com.dagger2.TestActivity;
import com.dagger2.pojo.Car;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    // Method name can be anything dagger is
    // only interested in return type of the method.
    Car getCar();

    // Field injection is meant for framework types
    // data entry instantiates like activities and fragment as
    // we do not own framework instantiates and hence can't do construction injection.
    void inject(TestActivity testActivity);


    @Component.Builder
    public interface Builder{

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsepower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int horsepower);

        CarComponent build();
    }

}
