package com.dagger2.di;

import com.dagger2.TestActivity;
import com.dagger2.pojo.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class, modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(TestActivity mainActivity);


    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engineCapacity") int engineCapacity);

        Builder appComponent(AppComponent component);

        ActivityComponent build();
    }
}