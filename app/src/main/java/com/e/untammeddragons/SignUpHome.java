package com.e.untammeddragons;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

public class SignUpHome extends AppCompatActivity {

    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_home);
        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                email = inemail.getText().toString();
//                password = inpassword.getText().toString();
//                mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignInHome.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                            startActivity(new Intent(SignInHome.this,Home.class));
//                            Toast.makeText(SignInHome.this, "User Registered Successfully", Toast.LENGTH_SHORT).show();
////                            finish();
//                        }
//                        else
//                            Toast.makeText(SignInHome.this,"Failed to Register" , Toast.LENGTH_LONG).show();
            }
        });

    }
}