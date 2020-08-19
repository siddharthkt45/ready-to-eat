package com.e.untammeddragons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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
                mAuth.signInWithEmailAndPassword(email,password).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        startActivity(new Intent(SignInHome.this,Home.class));
                        finish();
                    }
                });
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = inemail.getText().toString();
                password = inpassword.getText().toString();
                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignInHome.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            startActivity(new Intent(SignInHome.this,Home.class));
                            Toast.makeText(SignInHome.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
                            finish();
                        }
                        else
                            Toast.makeText(SignInHome.this,"Failed to Register" , Toast.LENGTH_LONG).show();
                    }
                });
            }
        });
    }
}