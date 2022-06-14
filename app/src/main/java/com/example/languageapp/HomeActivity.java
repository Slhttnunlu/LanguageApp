package com.example.languageapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout homelayout = findViewById(R.id.homelinearlayout);

        /*
        try {
            Thread.sleep(2000);
            System.out.println("HomeActivity başladı 2 saniye bekliyor");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        homelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CatagoryActivity.class);
                startActivity(intent);
            }
        });
    }
}