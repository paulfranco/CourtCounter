package co.paulfran.paulfranco.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;
    //int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score);
        displayForTeamB(score);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addThreeForTeamA(View view){

        score += 3;
        displayForTeamA(score);

    }

    public void addTwoForTeamA(View view){

        score += 2;
        displayForTeamA(score);

    }

    public void addOneForTeamA(View view){

        score += 1;
        displayForTeamA(score);

    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }

    public void addThreeForTeamB(View view){

        score += 3;
        displayForTeamB(score);

    }

    public void addTwoForTeamB(View view){

        score += 2;
        displayForTeamB(score);

    }

    public void addOneForTeamB(View view){

        score += 1;
        displayForTeamB(score);

    }
    public void reset(View view) {
        score = 0;
        displayForTeamA(score);
        displayForTeamB(score);

    }

}
