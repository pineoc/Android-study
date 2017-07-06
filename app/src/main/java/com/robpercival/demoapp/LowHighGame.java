package com.robpercival.demoapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class LowHighGame extends AppCompatActivity {

    private int randomNumber;

    public void guess(View v) {
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessInt = 0;
        String text = guessEditText.getText().toString();
        if(!text.isEmpty())
            guessInt = Integer.parseInt(text);

        if(guessInt > randomNumber) {
            Toast.makeText(LowHighGame.this, "Lower!", Toast.LENGTH_SHORT).show();
        } else if (guessInt < randomNumber) {
            Toast.makeText(LowHighGame.this, "Higher!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(LowHighGame.this, "That's right! New Game!", Toast.LENGTH_SHORT).show();
            randomNumber = new Random().nextInt(20) + 1;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_low_high_game);


        //make random number
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }

}
