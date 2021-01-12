package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import java.time.Instant;

public class splashAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitivity);

        getSupportActionBar().hide();//for hiding tool bar

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
       // getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);



        Thread thread=new Thread()
        {
            public void run()
            {
                try {
                    sleep(3000);

                }
                catch (Exception e){
                    e.printStackTrace();

                }
                finally {
                    Intent intent= new Intent(splashAcitivity.this,MainActivity.class);
                    startActivity(intent);
                }


            }
        };thread.start();
    }

}