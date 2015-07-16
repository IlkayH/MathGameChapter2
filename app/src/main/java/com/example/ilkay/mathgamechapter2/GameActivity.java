package com.example.ilkay.mathgamechapter2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;


public class GameActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        //Initialise code for our variables

        int partA = 9;
        int partB = 9;
        int correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 1;

        /*Here I am getting the TextViews and Buttons from the layout so i can access
        them with code*/

        TextView textObjectPartA = (TextView) findViewById(R.id.textPartA);
        TextView textObjectPartB = (TextView) findViewById(R.id.textPartB);

        Button buttonObjectChoice1 = (Button) findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = (Button) findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = (Button) findViewById(R.id.buttonChoice3);

        /*Now we use the setText method of the class on our objects
        to show our variable values on the UI elements.*/

        textObjectPartA.setText("" + partA);
        textObjectPartB.setText("" + partB);

        //which button receives which answer

        buttonObjectChoice1.setText("" + correctAnswer);
        buttonObjectChoice2.setText("" + wrongAnswer1);
        buttonObjectChoice3.setText("" + wrongAnswer2);

    }

}
