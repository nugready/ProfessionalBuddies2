package com.example.danie.professionalbuddies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class RegistrationActivity extends AppCompatActivity {
    Spinner spinnerQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        spinnerQ = (Spinner) findViewById(R.id.spinner);

        spinnerQ.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
              public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                parent.getItemAtPosition(position);

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //not required now
            }
        });




    }
}
