package com.example.basicattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GpaCalculator extends AppCompatActivity {

    String[] ss = {"Önceki Dönem Akts ve Gpa Bilgisi Giriniz(Opsiyonel)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calculator);

        Spinner spinner = findViewById(R.id.spinner7);
        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, ss);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    }
}