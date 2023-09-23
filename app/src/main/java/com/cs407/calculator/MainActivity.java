package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addFunction(View view){
        try {
            int num1 = 0;
            int num2 = 0;
            EditText myTextField1 = (EditText) findViewById(R.id.int1);
            EditText myTextField2 = (EditText) findViewById(R.id.int2);
            num1 = Integer.parseInt(myTextField1.getText().toString());
            num2 = Integer.parseInt(myTextField2.getText().toString());
            int answer = num1 + num2;
            goToActivity(Integer.toString(answer));
        } catch(NumberFormatException er){
            goToActivity("Invalid Number");
        }
    }

    public void minusFunction(View view){
        try {
            int num1 = 0;
            int num2 = 0;
            EditText myTextField1 = (EditText) findViewById(R.id.int1);
            EditText myTextField2 = (EditText) findViewById(R.id.int2);
            num1 = Integer.parseInt(myTextField1.getText().toString());
            num2 = Integer.parseInt(myTextField2.getText().toString());
            int answer = num1 - num2;
            goToActivity(Integer.toString(answer));
        } catch(NumberFormatException er){
            goToActivity("Invalid Number");
        }
    }

    public void multFunction(View view){
        try {
            int num1 = 0;
            int num2 = 0;
            EditText myTextField1 = (EditText) findViewById(R.id.int1);
            EditText myTextField2 = (EditText) findViewById(R.id.int2);
            num1 = Integer.parseInt(myTextField1.getText().toString());
            num2 = Integer.parseInt(myTextField2.getText().toString());
            int answer = num1 * num2;
            goToActivity(Integer.toString(answer));
        } catch(NumberFormatException er){
            goToActivity("Invalid Number");
        }
    }

    public void divFunction(View view){
        try {
            int num1 = 0;
            int num2 = 0;
            EditText myTextField1 = (EditText) findViewById(R.id.int1);
            EditText myTextField2 = (EditText) findViewById(R.id.int2);
            num1 = Integer.parseInt(myTextField1.getText().toString());
            num2 = Integer.parseInt(myTextField2.getText().toString());
            if (num2 != 0) {
                int answer = num1 / num2;
                goToActivity(Integer.toString(answer));
            } else {
                goToActivity("Divide By Zero Error");
            }
        } catch(NumberFormatException er){
            goToActivity("Invalid Number");
        }
    }

    public void goToActivity(String s) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}