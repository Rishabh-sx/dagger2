package com.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger2.di.CarComponent;
import com.dagger2.di.DaggerCarComponent;
import com.dagger2.pojo.Car;
import com.dagger2.pojo.Engine;
import com.dagger2.pojo.Wheels;

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

        CarComponent component = DaggerCarComponent.create();
        component.inject(this);

        car.drive();
    }
}
