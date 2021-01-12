package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class more extends AppCompatActivity {

    Button sin,cos,tan;
    TextView result;
    EditText num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        sin=findViewById(R.id.sin);
        cos=findViewById(R.id.cos);
        tan=findViewById(R.id.tan);
        num=findViewById(R.id.num);
        result=findViewById(R.id.result);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a;
                a= Integer.parseInt(num.getText().toString());
                double d1,d2;
                d1=Math.toRadians(a);
                d2=Math.sin(d1);
                result.setText("the result is "+d2);

            }
        });
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a;
                a= Integer.parseInt(num.getText().toString());
                double d1,d2;
                d1=Math.toRadians(a);
                d2=Math.cos(d1);
                result.setText("the result is "+d2);

            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a;
                a= Integer.parseInt(num.getText().toString());
                double d1,d2;
                d1=Math.toRadians(a);
                d2=(Math.sin(d1)/Math.cos(d1));
                result.setText("the result is "+d2);

            }
        });


    }
}