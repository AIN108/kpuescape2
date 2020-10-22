package com.example.kpuescape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserLogin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        Button bt_2=(Button) findViewById(R.id.bt_2);
        Button bt_3=(Button) findViewById(R.id.bt_3);
        Button bt_4=(Button) findViewById(R.id.bt_4);

        bt_2.setOnClickListener(new View.OnClickListener() {
            public void onClick (View V){
                Intent intent = new Intent(UserLogin.this, UserMypage.class);
                startActivity(intent);

            }
                                });

        bt_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserLogin.this, FireStation.class);
                startActivity(intent);
            }
        });

        bt_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserLogin.this, KPUEmergencyEvacuation.class);
                startActivity(intent);
            }
        });
    }
}