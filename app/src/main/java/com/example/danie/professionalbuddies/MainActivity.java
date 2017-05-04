package com.example.danie.professionalbuddies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void googleLogin(View view) {
        Intent intent = new Intent(this, googleLoginActivity.class);
        startActivity(intent);
        // Transfer to google login activity
    }

    public void login(View view) {
        // Need to evaluate whether or not
        // valid username & password have
        // been entered before switching
        // to next activity

        // Transfer to login activity
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }

    public void accountRecovery(View view) {
        Intent intent = new Intent(this, accountRecoveryActivity.class);
        startActivity(intent);
        // Transfer to account recovery acitivity
    }

    public void newUser(View view) {
        // Transfer to new user sign-up activity
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }
}