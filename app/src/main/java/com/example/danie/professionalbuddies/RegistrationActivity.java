package com.example.danie.professionalbuddies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

public class RegistrationActivity extends AppCompatActivity {
    Spinner spinnerQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        spinnerQ = (Spinner) findViewById(R.id.spinner);

        spinnerQ.setOnItemSelectedListener(new);
    }
}
