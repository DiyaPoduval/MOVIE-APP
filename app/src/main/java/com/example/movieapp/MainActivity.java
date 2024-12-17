package com.example.movieapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    Button b1
            String getUse,getPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        et1=(EditText) findViewById(R.id.uname);
        et2=(EditText) findViewById(R.id.pw);
        b1=(Button) findViewById(R.id.but);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getUse=et1.getText().toString();
                getPass=et2.getText().toString();
                Intent ob=new Intent(getApplicationContext(),DashboardActivity.class);
                if(getUse.equals("theatre") &&getPass.equals("12345"));
                    startActivity(ob);
            }
        });
    }
}