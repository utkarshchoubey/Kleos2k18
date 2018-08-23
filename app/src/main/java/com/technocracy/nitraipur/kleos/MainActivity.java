package com.technocracy.nitraipur.kleos;

import android.graphics.Point;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SlideAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        adapter= new SlideAdapter(this);
        viewPager.setAdapter(adapter);

    }
}
