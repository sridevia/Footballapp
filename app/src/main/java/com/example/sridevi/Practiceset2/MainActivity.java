package com.example.sridevi.Practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreteamA = 0;
    public int scoreteamB = 0;
    public TextView scoreView;
    public Button poinsthree;
    public Button pointstwo;
    public Button freeThrow;
    public TextView scoreviewBteam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.sridevi.Practiceset2.R.layout.activity_main);

        scoreView = (TextView) findViewById(com.example.sridevi.Practiceset2.R.id.scoreview);
        poinsthree = (Button) findViewById(com.example.sridevi.Practiceset2.R.id.points3);
        pointstwo = (Button) findViewById(com.example.sridevi.Practiceset2.R.id.points2);
        freeThrow = (Button) findViewById(com.example.sridevi.Practiceset2.R.id.Freethroew);
        scoreviewBteam = (TextView)findViewById(com.example.sridevi.Practiceset2.R.id.scoreviewBteam);

        poinsthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scoreteamA = scoreteamA + 3;
                displayAteam(scoreteamA);
            }
        });
        pointstwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scoreteamA = scoreteamA + 2;
                displayAteam(scoreteamA);
            }
        });
        freeThrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreteamA = scoreteamA + 1;
                displayAteam(scoreteamA);
            }
        });
    }
        public void Bteam3points(View v){

          scoreteamB = scoreteamB + 3;
        displayBteam(scoreteamB);
    }
    public void Bteam2points(View v){
        scoreteamB = scoreteamB + 2;
        displayBteam(scoreteamB);

    }
    public void Bteamfreethrow(View v){
        scoreteamB = scoreteamB + 2;
        displayBteam(scoreteamB);

    }
    public void displayAteam(int scorenumber){
        scoreteamA = scorenumber;
        scoreView.setText("" + scoreteamA);
    }
    public void displayBteam(int scorenumber){
        scoreteamB = scorenumber;
        scoreviewBteam.setText("" + scoreteamB);

    }
    public void Resetscore(View v){
        scoreteamA = 0;
        scoreteamB = 0;
        displayAteam(scoreteamA);
        displayBteam(scoreteamB);
    }

}
