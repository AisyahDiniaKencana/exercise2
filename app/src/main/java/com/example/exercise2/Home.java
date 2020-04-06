package com.example.exercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Home extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    Button Login, sisi, panjang, bulat, tiga, trap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Login = findViewById(R.id.back);
        sisi = findViewById(R.id.persgiempat);
        panjang = findViewById(R.id.persgipan);
        bulat = findViewById(R.id.lingkar);
        tiga = findViewById(R.id.segi);
        trap = findViewById(R.id.trape);


        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(Home.this, MainActivity.class);
                startActivity(e);
            }
        });
        sisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Home.this, view);
                popupMenu.setOnMenuItemClickListener(Home.this);
                popupMenu.inflate(R.menu.popup);
                popupMenu.show();
            }
        });
        panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Home.this, view);
                popupMenu.setOnMenuItemClickListener(Home.this);
                popupMenu.inflate(R.menu.popup);
                popupMenu.show();
            }
        });
        bulat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Home.this, view);
                popupMenu.setOnMenuItemClickListener(Home.this);
                popupMenu.inflate(R.menu.popup);
                popupMenu.show();
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Home.this, view);
                popupMenu.setOnMenuItemClickListener(Home.this);
                popupMenu.inflate(R.menu.popup);
                popupMenu.show();
            }
        });
        trap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(Home.this, view);
                popupMenu.setOnMenuItemClickListener(Home.this);
                popupMenu.inflate(R.menu.popup);
                popupMenu.show();
            }
        });
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.HitungLuas:
                Intent a = new Intent(Home.this, Luas.class);
                startActivity(a);
                break;
            case R.id.HitungKeliling:
                Intent o = new Intent(Home.this, Keliling.class);
                startActivity(o);
                break;
        }
        return false;
    }
}
