package com.example.supremegoldieking.rockpaperscissor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class WinActivity extends AppCompatActivity {

    String whoWin(String player, String comp) {
        if (player.equals(comp))
            return "It is a tie!";

        if (player.equals("Rock")) {
            if (comp.equals("Scissors"))
                return "Player wins!";
            else
                return "Player loses!";
        }
        else if (player.equals("Paper")) {
            if (comp.equals("Rock"))
                return "Player wins!";
            else
                return "Player loses!";
        }
        else { //Player chooses scissors
            if (comp.equals("Paper"))
                return "Player wins!";
            else
                return "Player loses!";
        }
    }

    String decodeChoice(String num) {
        String result;

        switch(num) {
            case "1":
                result = "Rock";
                break;
            case "2":
                result = "Paper";
                break;
            case "3":
                result = "Scissors";
                break;
            default:
                result = "Error";
                break;
        }

        return result;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);

        String playerString = "";
        Random rand = new Random();
        String compChoice = decodeChoice(String.valueOf(rand.nextInt(3) + 1));

        TextView compChoiceView = findViewById(R.id.compChoiceView);
        String compString = "Computer chooses " + compChoice;
        compChoiceView.setText(compString);

        if (getIntent().hasExtra("playerChoice")) {
            TextView playerChoiceView = findViewById(R.id.playerChoiceView);
            playerString = getIntent().getExtras().getString("playerChoice");
            String pString = "Player chooses " + playerString;
            playerChoiceView.setText(pString);
        }

        TextView resultView = findViewById(R.id.ResultView);
        resultView.setText(whoWin(playerString, compChoice));
    }
}
