package com.example.tmahlangu3.soccerscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAGoalCount = 0;
    int teamBGoalCount = 0;
    TextView team_a_score;
    TextView team_b_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        team_a_score = (TextView) findViewById(R.id.team_a_score);
        team_b_score = (TextView) findViewById(R.id.team_b_score);


    }

    public void addTeamAGoal(View view) {
        teamAGoalCount = addGoal(teamAGoalCount);
        team_a_score.setText(String.valueOf(teamAGoalCount));
        displayScore(team_a_score, teamAGoalCount);

    }

    public void addTeamBGoal(View view) {

        teamBGoalCount = addGoal(teamBGoalCount);
        displayScore(team_b_score, teamBGoalCount);

    }

    public void subtractTeamAGoal(View view) {
        teamAGoalCount = subtractGoal(teamAGoalCount);
        displayScore(team_a_score, teamAGoalCount);

    }

    public void subtractTeamBGoal(View view) {
        teamBGoalCount = subtractGoal(teamBGoalCount);
        displayScore(team_b_score, teamBGoalCount);
    }

    public int addGoal(int currentGoal) {
        return currentGoal += 1;

    }

    public int subtractGoal(int currentGoal) {
        return currentGoal -= 1;
    }

    public void displayScore(TextView textView, int goal) {
        textView.setText(String.valueOf(goal));

    }

    public void resetScores(View view) {
        teamAGoalCount = 0;
        teamBGoalCount = 0;
        displayScore(team_a_score, teamAGoalCount);
        displayScore(team_b_score, teamBGoalCount);


    }
}
