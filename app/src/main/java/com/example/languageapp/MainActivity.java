package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = (TextView) findViewById(R.id.numbers);
        // Find the View that shows the family category
        TextView family = (TextView) findViewById(R.id.family);
        // Find the View that shows the Phrase category
        TextView phrase = (TextView) findViewById(R.id.phrases);
        // Find the View that shows the Color category
        TextView color = (TextView) findViewById(R.id.colors);
        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        family.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent familyIntent = new Intent(MainActivity.this,FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phraseIntent = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phraseIntent);
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorIntent = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(colorIntent);
            }
        });


    }
}