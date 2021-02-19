package com.example.androidcoursesecondtask;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    private int foulsA = 0;
    private int foulsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        displayGoalsForTeamA(scoreA);
        displayGoalsForTeamB(scoreB);
        displayFoulsForTeamA(foulsA);
        displayFoulsForTeamB(foulsB);
    }

    private void displayGoalsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("Points: " + score);
    }

    private void displayGoalsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("Points: " + score);
    }

    private void displayFoulsForTeamA(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText("Fouls: " + fouls);
    }

    private void displayFoulsForTeamB(int fouls) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText("Fouls: " + fouls);
    }

    public void addGoalA(View view) {
        displayGoalsForTeamA(++scoreA);
    }

    public void addFoulA(View view) {
        displayFoulsForTeamA(++foulsA);
    }

    public void addGoalB(View view) {
        displayGoalsForTeamB(++scoreB);
    }

    public void addFoulB(View view) {
        displayFoulsForTeamB(++foulsB);
    }

    public void resetScore(View view) {
        displayGoalsForTeamA(scoreA = 0);
        displayGoalsForTeamB(scoreB = 0);
        displayFoulsForTeamA(foulsA = 0);
        displayFoulsForTeamB(foulsB = 0);
    }
}