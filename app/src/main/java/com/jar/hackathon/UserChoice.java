package com.jar.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserChoice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_choice);
        ImageButton farmer = findViewById(R.id.farmer);
        farmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
            }
        });

        ImageButton administrator = findViewById(R.id.administrator);
        administrator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdminLoginPage();
            }
        });
    }

    void openLoginPage(){
        Intent intent = new Intent(this.getApplicationContext(),Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    void openAdminLoginPage(){
        Intent intent = new Intent(this.getApplicationContext(),AdminLogin.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }


}
