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

public class SubActivity extends AppCompatActivity {
    Button bb2,bb1;
    EditText t1,t2;
    TextView tt;
    String getNum1,getNum2,result;
    int num1,num2,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        bb2=(Button) findViewById(R.id.bm2);
        bb1=(Button) findViewById(R.id.s1);
        t1=(EditText) findViewById(R.id.n2);
        t2=(EditText) findViewById(R.id.nn2);
        tt=(TextView) findViewById(R.id.tv);
        bb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ob2=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(ob2);

            }
        });
        bb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=t1.getText().toString();
                getNum2=t2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                sub=num1-num2;
                result=String.valueOf(sub);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                tt.setText(result);
            }
        });
    }
}