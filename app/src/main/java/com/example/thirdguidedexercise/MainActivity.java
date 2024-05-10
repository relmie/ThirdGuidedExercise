package com.example.thirdguidedexercise;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText num1, num2;
    Button sum, sub, mult, div;
    Toast toast;
    View view;
    double firstNum = 0, secondNum = 0, total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = findViewById(R.id.etNum1GE3);
        num2 = findViewById(R.id.etNum2GE3);
        sum = findViewById(R.id.btnSumGE3);
        sub = findViewById(R.id.btnSubGE3);
        mult = findViewById(R.id.btnMultGE3);
        div  = findViewById(R.id.btnDivGE3);

        computeTotal();
    }
    public void computeTotal(){
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// this will check if our two EditText has a text value
                if(num1.getText().toString().isEmpty() ||
                        num2.getText().toString().isEmpty()){
                    displayErrorMessage();
                }else{
                    firstNum = Double.parseDouble(num1.getText().toString());
                    secondNum = Double.parseDouble(num2.getText().toString());
                    total = firstNum + secondNum;
                    Toast.makeText(getApplicationContext(),
                            "Addition: " + total,Toast.LENGTH_SHORT).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// this will check if our two EditText has a text value
                if(num1.getText().toString().isEmpty() ||
                        num2.getText().toString().isEmpty()){
                    displayErrorMessage();
                }else{
                    firstNum = Double.parseDouble(num1.getText().toString());
                    secondNum = Double.parseDouble(num2.getText().toString());
                    total = firstNum - secondNum;
                    Toast.makeText(getApplicationContext(),
                            "Subtraction: " + total,Toast.LENGTH_SHORT).show();
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// this will check if our two EditText has a text value
                if(num1.getText().toString().isEmpty() ||
                        num2.getText().toString().isEmpty()){
                    displayErrorMessage();
                }else{
                    firstNum = Double.parseDouble(num1.getText().toString());
                    secondNum = Double.parseDouble(num2.getText().toString());
                    total = firstNum * secondNum;
                    Toast.makeText(getApplicationContext(),
                            "Multiply: " + total,Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
// this will check if our two EditText has a text value
                if(num1.getText().toString().isEmpty() ||
                        num2.getText().toString().isEmpty()){
                    displayErrorMessage();
                }else{
                    firstNum = Double.parseDouble(num1.getText().toString());
                    secondNum = Double.parseDouble(num2.getText().toString());
                    total = firstNum / secondNum;
                    Toast.makeText(getApplicationContext(),
                            "Divide: " + total,Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    public void displayErrorMessage(){
        toast = Toast.makeText(getApplicationContext(),
                "Please Enter a Number",Toast.LENGTH_SHORT);
        view = toast.getView();
        view.getBackground().setColorFilter(Color.RED, PorterDuff.Mode.SRC_IN);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}
