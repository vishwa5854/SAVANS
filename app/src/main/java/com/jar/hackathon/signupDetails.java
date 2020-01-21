package com.jar.hackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class signupDetails extends AppCompatActivity {

    TextInputLayout name;
    TextInputLayout password;
    TextInputLayout confirm;
    EditText phone;
    TextInputLayout farm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_details);
        name = findViewById(R.id.name);
        password = findViewById(R.id.confirm);
        phone = findViewById(R.id.phone);
        confirm = findViewById(R.id.password);
        farm = findViewById(R.id.farmArea);
        Button next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ApplicationForm.userName = name.getEditText().getText().toString();
                ApplicationForm.passWord = password.getEditText().getText().toString();
                ApplicationForm.phone = phone.getText().toString();
                ApplicationForm.farmArea = Integer.parseInt(farm.getEditText().getText().toString());
                if(!ApplicationForm.userName.equals("") && !ApplicationForm.passWord.equals("")) {
                    if(ApplicationForm.passWord.equals(confirm.getEditText().getText().toString())) {
                        openSignUpPage();
                    }
                    else {
                        confirm.setHint("re enter");
                    }
                }else {
                    name.setHint(ApplicationForm.userName + ApplicationForm.passWord + ApplicationForm.phone);
                }
            }
        });
    }

    void openSignUpPage(){
        Intent intent = new Intent(this.getApplicationContext(),SignUp.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
