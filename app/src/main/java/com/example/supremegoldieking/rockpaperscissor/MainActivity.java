package com.example.supremegoldieking.rockpaperscissor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rockButton = findViewById(R.id.rockButton);
        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent winIntent = new Intent(getApplicationContext(), WinActivity.class);
                winIntent.putExtra("playerChoice", "Rock");
                startActivity(winIntent);
            }
        });

        Button paperButton = findViewById(R.id.paperButton);
        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent winIntent = new Intent(getApplicationContext(), WinActivity.class);
                winIntent.putExtra("playerChoice", "Paper");
                startActivity(winIntent);
            }
        });

        Button scissorButton = findViewById(R.id.scissorButton);
        scissorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent winIntent = new Intent(getApplicationContext(), WinActivity.class);
                winIntent.putExtra("playerChoice", "Scissors");
                startActivity(winIntent);
            }
        });
    }
}
