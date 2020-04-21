package com.example.dennisthicklin.funfactsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //Factbook object
    FactBook factBook = new FactBook();

    TextView factDisplay;
    Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        factDisplay = findViewById(R.id.factText);
        showFactButton = findViewById(R.id.showFactButton);



        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                factDisplay.setText(factBook.getFact());
            }
        });

    }
}
