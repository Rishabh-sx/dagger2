package com.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger2.di.ActivityComponent;

import com.dagger2.di.DaggerActivityComponent;
import com.dagger2.pojo.Car;
import javax.inject.Inject;

public class TestActivity extends AppCompatActivity {

    //Dagger field injection does not works with private & final fields
    //as it internally access the fields object of consumer class and inject
    //the field dependencies.
    @Inject public Car car,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((App) getApplication()).getAppComponent())
                .build();

        component.inject(this);
        car.drive();
        car2.drive();
    }
}
