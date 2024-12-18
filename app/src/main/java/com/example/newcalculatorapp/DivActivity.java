package com.example.newcalculatorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DivActivity extends AppCompatActivity {
    Button bb4,bb1;
    EditText t1,t2;
    String getNum1,getNum2,result;
    int num1,num2,div;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        tv=(TextView) findViewById(R.id.res);
        bb4=(Button) findViewById(R.id.bm4);
        bb1=(Button) findViewById(R.id.d1);
        t1=(EditText) findViewById(R.id.n4);
        t2=(EditText) findViewById(R.id.nn4);
        bb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob4=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob4);
            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=t1.getText().toString();
                getNum2=t2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                div=num1/num2;
                result=String.valueOf(div);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                tv.setText(result);
            }
        });
    }
}