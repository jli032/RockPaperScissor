package com.example.supremegoldieking.rockpaperscissor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Random rand = new Random();
        int compChoice = rand.nextInt(3) + 1;

        Button rockButton = findViewById(R.id.rockButton);
        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //If the player wins.
                Intent winIntent = new Intent(getApplicationContext(), WinActivity.class);
                startActivity(winIntent);
            }
        });
    }
}
