package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editNum1,editNum2;
    TextView editTv;
    Button butDivide,butAdd,butSub,butMultiple,more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum1=findViewById(R.id.editNum1);
        editNum2=findViewById(R.id.editNum2);
        editTv=findViewById(R.id.editTv);
        butAdd=findViewById(R.id.butAdd);
        butSub=findViewById(R.id.butSub);
        butMultiple=findViewById(R.id.butMultiple);
        butDivide=findViewById(R.id.butDivide);
        more=findViewById(R.id.more);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        butAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,result;
                num1= Integer.parseInt(editNum1.getText().toString());
                num2=Integer.parseInt(editNum2.getText().toString());
                result=num1+num2;

                editTv.setText("The ans is "+result);
            }
        });

        butSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,result;
                num1= Integer.parseInt(editNum1.getText().toString());
                num2=Integer.parseInt(editNum2.getText().toString());
                result=num1-num2;

                editTv.setText("The ans is "+result);
            }
        });

        butDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,result;
                num1= Integer.parseInt(editNum1.getText().toString());
                num2=Integer.parseInt(editNum2.getText().toString());
                result=num1/num2;

                editTv.setText("The ans is "+result);
            }
        });

        butMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1,num2,result;
                num1= Integer.parseInt(editNum1.getText().toString());
                num2=Integer.parseInt(editNum2.getText().toString());
                result=num1*num2;

                editTv.setText("The ans is "+result);
            }
        });


        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this ,more.class);
                startActivity(intent);
            }
        });







    }

}