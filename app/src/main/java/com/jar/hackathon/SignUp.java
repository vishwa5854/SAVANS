package com.jar.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class SignUp extends AppCompatActivity {

    TextInputLayout cow;
    TextInputLayout sheep;
    TextInputLayout buffalo;
    TextInputLayout donkey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        cow = findViewById(R.id.cow);
        sheep = findViewById(R.id.sheep);
        buffalo = findViewById(R.id.buffalo);
        donkey = findViewById(R.id.donkey);
        Button button = findViewById(R.id.nextPage);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ApplicationForm.numberOfCows += Integer.parseInt(cow.getEditText().getText().toString());
                    ApplicationForm.numberOfSheep += Integer.parseInt(sheep.getEditText().getText().toString());
                    ApplicationForm.numberOfBuffaloes += Integer.parseInt(buffalo.getEditText().getText().toString());
                    ApplicationForm.numberOfDonkeys += Integer.parseInt(donkey.getEditText().getText().toString());
                }catch (NumberFormatException ignored){
                }
                openSignUpContPage();
            }
        });
    }


    void openSignUpContPage(){
        Intent intent = new Intent(this.getApplicationContext(),signup_cont.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
