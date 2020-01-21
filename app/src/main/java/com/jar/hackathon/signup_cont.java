package com.jar.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class signup_cont extends AppCompatActivity {

    TextInputLayout ox;
    TextInputLayout hen;
    TextInputLayout goat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_cont);
        ox = findViewById(R.id.ox);
        hen = findViewById(R.id.hen);
        goat = findViewById(R.id.goat);
        Button done = findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApplicationForm.numberOfOxen += Integer.parseInt(Objects.requireNonNull(ox.getEditText()).getText().toString());
                ApplicationForm.numberOfChickens += Integer.parseInt(Objects.requireNonNull(hen.getEditText()).getText().toString());
                ApplicationForm.numberOfGoats += Integer.parseInt(Objects.requireNonNull(goat.getEditText()).getText().toString());
                //openSignUpPage();
            }
        });
    }


    void openSignUpPage(){
        Intent intent = new Intent(this.getApplicationContext(),MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
