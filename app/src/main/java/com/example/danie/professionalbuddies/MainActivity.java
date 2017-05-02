package com.example.danie.professionalbuddies;

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
        // Transfer to google login activity
    }

    public void login(View view) {
        // Transfer to login activity
    }

    public void accountRecovery(View view) {
        // Transfer to account recovery acitivity
    }

    public void newUser(View view) {
        // Transfer to new user sign-up activity
    }
}