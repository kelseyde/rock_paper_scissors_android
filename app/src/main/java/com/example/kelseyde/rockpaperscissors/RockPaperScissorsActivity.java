package com.example.kelseyde.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RockPaperScissorsActivity extends AppCompatActivity {

    RockPaperScissors rockPaperScissors;
    Button rock_button;
    Button paper_button;
    Button scissors_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rock_paper_scissors);
        rockPaperScissors = new RockPaperScissors();

        rock_button = (Button) findViewById(R.id.rock_button);
        paper_button = (Button) findViewById(R.id.paper_button);
        scissors_button = (Button) findViewById(R.id.scissors_button);

    }

    public void onClickRock(View button) {
        Intent intent = new Intent(this, ResultActivity.class);
        rockPaperScissors.setPlayerHand(HandType.ROCK);
        String result = rockPaperScissors.compareHands();
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onClickPaper(View button) {
        Intent intent = new Intent(this, ResultActivity.class);
        rockPaperScissors.setPlayerHand(HandType.PAPER);
        String result = rockPaperScissors.compareHands();
        intent.putExtra("result", result);
        startActivity(intent);
    }

    public void onClickScissors(View button) {
        Intent intent = new Intent(this, ResultActivity.class);
        rockPaperScissors.setPlayerHand(HandType.SCISSORS);
        String result = rockPaperScissors.compareHands();
        intent.putExtra("result", result);
        startActivity(intent);
    }

}
