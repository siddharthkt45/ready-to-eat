package com.e.untammeddragons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class SignInHome extends AppCompatActivity {

    private String email , password;
    TextView inemail , inpassword;
    Button signin , signup;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_home);
        mAuth = FirebaseAuth.getInstance();
        inemail = (TextView)findViewById(R.id.editTextTextEmailAddress);
        inpassword = (TextView)findViewById(R.id.editTextTextPassword);
        signin = (Button)findViewById(R.id.btsignin);
        signup = (Button)findViewById(R.id.btsignup);
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = inemail.getText().toString();
                password = inpassword.getText().toString();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignInHome.this,Home.class));
            }
        });
    }
}