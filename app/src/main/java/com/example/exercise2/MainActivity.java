package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Homehal;
    EditText Nama, Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Homehal = findViewById(R.id.btnok);
        Nama = findViewById(R.id.masukan);
        Pass = findViewById(R.id.masukanpas);


        Homehal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Nama.getText().toString().equals("admin") && Pass.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(), "Login Sucses", Toast.LENGTH_LONG).show();

                    Intent i = new Intent(MainActivity.this, Home.class);
                    startActivity(i);
                }
                else {
                    Toast.makeText(getApplicationContext(),"Username atau Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
