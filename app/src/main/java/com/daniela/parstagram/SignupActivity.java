package com.daniela.parstagram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class SignupActivity extends AppCompatActivity {
    public static final String TAG="SignupActivity";
    private EditText etUsername;
    private EditText etPassword;
    private Button btnSignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnSignup = findViewById(R.id.btnSignup);
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser user = new ParseUser();
                if (etUsername.getText().toString().isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Username cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (etPassword.getText().toString().isEmpty()) {
                    Toast.makeText(SignupActivity.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                user.setUsername(etUsername.getText().toString());
                user.setPassword(etPassword.getText().toString());
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e != null){
                            Toast.makeText(SignupActivity.this, "Signup error", Toast.LENGTH_SHORT).show();
                            Log.e(TAG, "Issue with sign up ", e);
                            return;
                        }
                        goLoginActivity();
                        Toast.makeText(SignupActivity.this, "Successfully signed up", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });
    }

    private void goLoginActivity() {
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
        finish(); //avoids user to go back to login (better UX)
    }
}