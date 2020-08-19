package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUpHome extends AppCompatActivity {

    Button register;
    EditText name , email , password;
    private String names;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_home);
        register = (Button)findViewById(R.id.btreg);
        name = (EditText)findViewById(R.id.editTextTextPersonName);
        email = (EditText)findViewById(R.id.editTextTextPassword2);
        password = (EditText)findViewById(R.id.editTextTextEmailAddress2);
    }
}