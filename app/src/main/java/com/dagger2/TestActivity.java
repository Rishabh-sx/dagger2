package com.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger2.di.CarComponent;
import com.dagger2.di.DaggerCarComponent;
import com.dagger2.di.DieselEngineModule;
import com.dagger2.pojo.Car;

import javax.inject.Inject;

public class TestActivity extends AppCompatActivity {

    //Dagger field injection does not works with private & final fields
    //as it internally access the fields object of consumer class and inject
    //the field dependencies.
    @Inject public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        CarComponent component = DaggerCarComponent
                .builder()
                .horsePower(100)
                .engineCapacity(2000)
                .build();

        component.inject(this);
        car.drive();
    }
}
