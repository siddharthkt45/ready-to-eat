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
    EditText name , email , mnumber , password , cpassword;
    String sname , semail , smnumber , spassword , scpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_home);
        name = (EditText)findViewById(R.id.edit_Text_name);
        email = (EditText)findViewById(R.id.edit_Text_email);
        mnumber = (EditText)findViewById(R.id.edit_Text_mnumber);
        password = (EditText)findViewById(R.id.edit_Text_password);
        cpassword = (EditText)findViewById(R.id.edit_Text_cpassword);

        register = (Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sname = name.getText().toString();
                semail = email.getText().toString();
                smnumber = mnumber.getText().toString();
                scpassword = cpassword.getText().toString();
                spassword = password.getText().toString();
            }
        });
    }
}