package com.bonkersabouttech.lotterynumbergenerator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the user taps the Generate button
     */
    public void generateAndDisplayLotteryNumber(View view) {
        // Generate a random number between 1 and 59 and store in our variable called "randomNumber"
        int randomNumber = generateRandomNumber(1, 59);

        displayLotteryNumberToUser(randomNumber);
    }

    private void displayLotteryNumberToUser(int randomNumber) {
        TextView randomNumberTv = (TextView) findViewById(R.id.randomNumberTv);
        randomNumberTv.setText(randomNumber);
    }

    // Our private method called "generateRandomNumber".  It accepts two arguments "min" and "max"
    // and returns a random integer between "min" and "max".
    private int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
