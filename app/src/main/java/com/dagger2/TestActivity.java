package com.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.dagger2.pojo.Car;
import com.dagger2.pojo.Engine;
import com.dagger2.pojo.Wheels;

public class TestActivity extends AppCompatActivity {

    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        Engine engine = new Engine();
        Wheels wheels = new Wheels();


        Car car = new Car(engine,wheels);

        car.drive();
    }
}
