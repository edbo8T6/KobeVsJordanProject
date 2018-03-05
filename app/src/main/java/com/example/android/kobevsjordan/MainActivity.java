package com.example.android.kobevsjordan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreKobe = 0;
    int scoreMJ = 0;
    int reboundKobe = 0;
    int blockKobe = 0;
    int stealKobe = 0;
    int foulKobe = 0;
    int turnOverKobe = 0;
    int twoPointMadeKobe = 0;
    int freeThrowMadeKobe = 0;
    int fgMadeKobe = 0;
    int fgTakenKobe = 0;
    int twoPointTakenKobe = 0;
    int ftTakenKobe = 0;
    int reboundMJ = 0;
    int blockMJ = 0;
    int stealMJ = 0;
    int foulMJ = 0;
    int turnOverMJ = 0;
    int twoPointMadeMJ = 0;
    int freeThrowMadeMJ = 0;
    int fgMadeMJ = 0;
    int fgTakenMJ = 0;
    int twoPointTakenMJ = 0;
    int ftTakenMJ = 0;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForKobe(0);
        displayForMJ(0);


    }



    /**
     * Displays the given score for Kobe.
     */
    public void displayForKobe(int score) {
        TextView scoreView = (TextView) findViewById(R.id.KobeScore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given Rebound for Kobe.
     */
    public void reboundForKobe(int rebound) {
        TextView scoreView = (TextView) findViewById(R.id.KobeRebound);
        scoreView.setText(String.valueOf(rebound));
    }

    /**
     * Displays the given block for Kobe.
     */
    public void blockForKobe(int block) {
        TextView scoreView = (TextView) findViewById(R.id.KobeBlock);
        scoreView.setText(String.valueOf(block));
    }

    /**
     * Displays the given steal for Kobe.
     */
    public void stealForKobe(int steal) {
        TextView scoreView = (TextView) findViewById(R.id.KobeSteal);
        scoreView.setText(String.valueOf(steal));
    }

    /**
     * Displays the given foul for Kobe.
     */
    public void foulForKobe(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.KobeFoul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given turnover for Kobe.
     */
    public void turnOverForKobe(int turnOver) {
        TextView scoreView = (TextView) findViewById(R.id.KobeTO);
        scoreView.setText(String.valueOf(turnOver));
    }

    /**
     * Displays the given two points made in stats for Kobe.
     */
    public void twoPointKobeMade (int twoPoints) {
        TextView scoreView = (TextView) findViewById(R.id.KobeTwoPointsMade);
        scoreView.setText(String.valueOf(twoPoints));
    }



    /**
     * Displays the given Free Throw made in stats for Kobe.
     */
    public void freeThrowKobeMade (int freeThrow) {
        TextView scoreView = (TextView) findViewById(R.id.KobeFreeThrowMade);
        scoreView.setText(String.valueOf(freeThrow));
    }

    /**
     * Displays the given FG's Made in stats for Kobe.
     */
    public void fgKobeMade (int fgMade) {
        TextView scoreView = (TextView) findViewById(R.id.KobeFGMade);
        scoreView.setText(String.valueOf(fgMade));
    }


    /**
     * Displays the total fg taken in stats for Kobe.
     */
    public void fgKobeTaken (int fgTaken) {
        TextView scoreView = (TextView) findViewById(R.id.KobeFGTaken);
        scoreView.setText(String.valueOf(fgTaken));
    }

    /**
     * Displays the total 2pts taken in stats for Kobe.
     */
    public void twoPointKobeTaken (int twoPointTaken) {
        TextView scoreView = (TextView) findViewById(R.id.KobeTwoPointTaken);
        scoreView.setText(String.valueOf(twoPointTaken));
    }

    /**
     * Displays the total FT taken in stats for Kobe.
     */
    public void ftKobeTaken (int ftTaken) {
        TextView scoreView = (TextView) findViewById(R.id.KobeFreeThrowTaken);
        scoreView.setText(String.valueOf(ftTaken));
    }






    /**
     * Displays the given score for MJ.
     */
    public void displayForMJ(int score) {
        TextView scoreView = (TextView) findViewById(R.id.MJScore);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Displays the given Rebound for MJ.
     */
    public void reboundForMJ(int rebound) {
        TextView scoreView = (TextView) findViewById(R.id.MJRebound);
        scoreView.setText(String.valueOf(rebound));
    }

    /**
     * Displays the given block for MJ.
     */
    public void blockForMJ(int block) {
        TextView scoreView = (TextView) findViewById(R.id.MJBlock);
        scoreView.setText(String.valueOf(block));
    }

    /**
     * Displays the given steal for MJ.
     */
    public void stealForMJ(int steal) {
        TextView scoreView = (TextView) findViewById(R.id.MJSteal);
        scoreView.setText(String.valueOf(steal));
    }

    /**
     * Displays the given foul for MJ.
     */
    public void foulForMJ(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.MJFoul);
        scoreView.setText(String.valueOf(foul));
    }

    /**
     * Displays the given turnover for MJ.
     */
    public void turnOverForMJ(int turnOver) {
        TextView scoreView = (TextView) findViewById(R.id.MJTO);
        scoreView.setText(String.valueOf(turnOver));
    }

    /**
     * Displays the given two points made in stats for MJ.
     */
    public void twoPointMJMade (int twoPoints) {
        TextView scoreView = (TextView) findViewById(R.id.MJTwoPointsMade);
        scoreView.setText(String.valueOf(twoPoints));
    }

    /**
     * Displays the given Free Throw made in stats for MJ.
     */
    public void freeThrowMJMade (int freeThrow) {
        TextView scoreView = (TextView) findViewById(R.id.MJFreeThrowMade);
        scoreView.setText(String.valueOf(freeThrow));
    }

    /**
     * Displays the given FG's Made in stats for MJ.
     */
    public void fgMJMade (int fgMade) {
        TextView scoreView = (TextView) findViewById(R.id.MJFGMade);
        scoreView.setText(String.valueOf(fgMade));
    }


    /**
     * Displays the total fg taken in stats for MJ.
     */
    public void fgMJTaken (int fgTaken) {
        TextView scoreView = (TextView) findViewById(R.id.MJFGTaken);
        scoreView.setText(String.valueOf(fgTaken));
    }

    /**
     * Displays the total 2pts taken in stats for MJ.
     */
    public void twoPointMJTaken (int twoPointTaken) {
        TextView scoreView = (TextView) findViewById(R.id.MJTwoTaken);
        scoreView.setText(String.valueOf(twoPointTaken));
    }

    /**
     * Displays the total FT taken in stats for MJ.
     */
    public void ftMJTaken (int ftTaken) {
        TextView scoreView = (TextView) findViewById(R.id.MJFreeThrowTaken);
        scoreView.setText(String.valueOf(ftTaken));
    }






    /**
     * Increases the score for Kobe by 1,
     * adds 1 to the stats under FG Made/Taken
     */

    public void OnePointsKobe(View view) {
            displayForKobe (1);
            scoreKobe = scoreKobe + 1;
            displayForKobe(scoreKobe);
            fgKobeMade (1);
            fgMadeKobe = (fgMadeKobe + 1);
            fgKobeMade(fgMadeKobe);
            fgKobeTaken (1);
            fgTakenKobe = (fgTakenKobe + 1);
            fgKobeTaken(fgTakenKobe);
    }

    /**
     * Increases the score for Kobe by 2,
     * adds 1 to the stats under two points made
     * adds 1 to the stats under FG Made/Taken
     */

    public void TwoPointsKobe(View view) {
        displayForKobe (2);
        scoreKobe = scoreKobe + 2;
        displayForKobe(scoreKobe);
        twoPointKobeMade (1);
        twoPointMadeKobe = (twoPointMadeKobe + 1);
        twoPointKobeMade(twoPointMadeKobe);
        fgKobeMade (1);
        fgMadeKobe = (fgMadeKobe + 1);
        fgKobeMade(fgMadeKobe);
        fgKobeTaken (1);
        fgTakenKobe = (fgTakenKobe + 1);
        fgKobeTaken(fgTakenKobe);
        twoPointKobeTaken(1);
        twoPointTakenKobe = (twoPointTakenKobe + 1);
        twoPointKobeTaken(twoPointTakenKobe);

    }

    /**
     * Increases the score for Kobe by 1,
     * adds 1 to the stats under Free Throws made/Taken
     */
    public void AndOneKobe(View view) {
        reboundForKobe (1);
        scoreKobe = scoreKobe + 1;
        displayForKobe(scoreKobe);
        freeThrowKobeMade (1);
        freeThrowMadeKobe = (freeThrowMadeKobe + 1);
        freeThrowKobeMade(freeThrowMadeKobe);
        ftKobeTaken(1);
        ftTakenKobe = (ftTakenKobe + 1);
        ftKobeTaken(ftTakenKobe);
    }

    /**
     * Increases the stats under FG Taken Kobe by 1,
     */

    public void MissedOneKobe(View view) {
        fgKobeTaken (1);
        fgTakenKobe = (fgTakenKobe + 1);
        fgKobeTaken(fgTakenKobe);

    }

    /**
     * Increases the stats under two points Taken Kobe by 1,
     */

    public void MissedTwoKobe(View view) {
        twoPointKobeTaken(1);
        twoPointTakenKobe = (twoPointTakenKobe + 1);
        twoPointKobeTaken(twoPointTakenKobe);
    }

    /**
     * Increases the stats under free throws Taken Kobe by 1,
     */

    public void MissedFreeThrowKobe(View view) {
        ftKobeTaken(1);
        ftTakenKobe = (ftTakenKobe + 1);
        ftKobeTaken(ftTakenKobe);
    }

    /**
     * Increases the Rebound for Kobe by 1.
     */

    public void ReboundKobe(View view) {
        reboundForKobe (1);
            reboundKobe = reboundKobe + 1;
            reboundForKobe(reboundKobe);
    }

    /**
     * Increases the block for Kobe by 1.
     */
    public void BlockKobe(View view) {
        blockForKobe (1);
        blockKobe = blockKobe + 1;
        blockForKobe(blockKobe);
        ftKobeTaken(1);
        ftTakenKobe = (ftTakenKobe + 1);
        ftKobeTaken(ftTakenKobe);
    }

    /**
     * Increases the Steal for Kobe by 1.
     */

    public void StealKobe(View view) {
        stealForKobe (1);
        stealKobe = stealKobe + 1;
        stealForKobe(stealKobe);

    }

    /**
     * Increases the Foul for Kobe by 1.
     */

    public void FoulKobe(View view) {
        foulForKobe (1);
        foulKobe = foulKobe + 1;
        foulForKobe(foulKobe);
    }

    /**
     * Increases the Turnover for Kobe by 1.
     */


    public void TurnOverKobe(View view) {
        turnOverForKobe (1);
        turnOverKobe = turnOverKobe + 1;
        turnOverForKobe(turnOverKobe);
    }






    /**
     * Increases the score for MJ by 2,
     * adds 1 to the stats under two points made
     * adds 1 to the stats under FG Made/Taken
     */

    public void TwoPointsMJ(View view) {
        displayForMJ (2);
        scoreMJ = scoreMJ + 2;
        displayForMJ(scoreMJ);
        twoPointMJMade (1);
        twoPointMadeMJ = (twoPointMadeMJ + 1);
        twoPointMJMade(twoPointMadeMJ);
        fgMJMade (1);
        fgMadeMJ = (fgMadeMJ + 1);
        fgMJMade(fgMadeMJ);
        fgMJTaken(1);
        fgTakenMJ = (fgTakenMJ + 1);
        fgMJTaken(fgTakenMJ);
        twoPointMJTaken(1);
        twoPointTakenMJ = (twoPointTakenMJ + 1);
        twoPointMJTaken(twoPointTakenMJ);
    }

    /**
     * Increases the score for MJ by 1,
     * adds 1 to the stats under FG Made/Taken
     */

    public void OnePointsMJ(View view) {
        displayForMJ (1);
        scoreMJ = scoreMJ + 1;
        displayForMJ(scoreMJ);
        fgMJMade (1);
        fgMadeMJ = (fgMadeMJ + 1);
        fgMJMade(fgMadeMJ);
        fgMJTaken(1);
        fgTakenMJ = (fgTakenMJ + 1);
        fgMJTaken(fgTakenMJ);
    }

    /**
     * Increases the score for MJ by 1,
     * adds 1 to the stats under FT Made/Taken
     */

    public void AndOneMJ(View view) {
        displayForMJ (1);
        scoreMJ = scoreMJ + 1;
        displayForMJ(scoreMJ);
        freeThrowMJMade (1);
        freeThrowMadeMJ = (freeThrowMadeMJ + 1);
        freeThrowMJMade(freeThrowMadeMJ);
        ftMJTaken(1);
        ftTakenMJ = (ftTakenMJ + 1);
        ftMJTaken(ftTakenMJ);
    }

    /**
     * Increases the stats under FG Taken MJ by 1,
     */

    public void MissedOneMJ(View view) {
        fgMJTaken(1);
        fgTakenMJ = (fgTakenMJ + 1);
        fgMJTaken(fgTakenMJ);
    }

    /**
     * Increases the stats under two points Taken MJ by 1,
     */
    public void MissedTwoMJ(View view) {
        twoPointMJTaken(1);
        twoPointTakenMJ = (twoPointTakenMJ + 1);
        twoPointMJTaken(twoPointTakenMJ);
    }

    /**
     * Increases the stats under free throws Taken MJ by 1,
     */

    public void MissedFreeThrowMJ(View view) {
        ftMJTaken(1);
        ftTakenMJ = (ftTakenMJ + 1);
        ftMJTaken(ftTakenMJ);
    }

    /**
     * Increases the foul for MJ by 1.
     */
    public void ReboundMJ(View view) {
        reboundForMJ (1);
        reboundMJ = reboundMJ + 1;
        reboundForMJ(reboundMJ);
    }

    /**
     * Increases the block for MJ by 1.
     */

    public void BlockMJ(View view) {
        blockForMJ (1);
        blockMJ = blockMJ + 1;
        blockForMJ(blockMJ);
    }

    /**
     * Increases the steal for MJ by 1.
     */

    public void StealMJ(View view) {
        stealForMJ (1);
        stealMJ = stealMJ + 1;
        stealForMJ(stealMJ);
    }

    /**
     * Increases the turn over for MJ by 1.
     */
    public void TurnOverMJ(View view) {
        turnOverForMJ (1);
        turnOverMJ = turnOverMJ + 1;
        turnOverForMJ(turnOverMJ);
    }

    /**
     * Increases the foul for MJ by 1.
     */

    public void FoulMJ(View view) {
        foulForMJ (1);
        foulMJ = foulMJ + 1;
        foulForMJ(foulMJ);
    }





    /**
     * Resets all attributes in app back to zero
     */

    public void Reset(View view) {
        scoreKobe = 0;
        scoreMJ = 0;
        reboundKobe = 0;
        blockKobe = 0;
        stealKobe = 0;
        foulKobe = 0;
        turnOverKobe = 0;
        twoPointMadeKobe = 0;
        freeThrowMadeKobe = 0;
        fgMadeKobe = 0;
        fgTakenKobe = 0;
        twoPointTakenKobe = 0;
        ftTakenKobe = 0;
        reboundMJ = 0;
        blockMJ = 0;
        stealMJ = 0;
        foulMJ = 0;
        turnOverMJ = 0;
        twoPointMadeMJ = 0;
        freeThrowMadeMJ = 0;
        fgMadeMJ = 0;
        fgTakenMJ = 0;
        twoPointTakenMJ = 0;
        ftTakenMJ = 0;
        displayForKobe(scoreKobe);
        displayForMJ(scoreMJ);
        reboundForKobe(reboundKobe);
        blockForKobe(blockKobe);
        stealForKobe(stealKobe);
        foulForKobe(foulKobe);
        turnOverForKobe(turnOverKobe);
        twoPointKobeMade(twoPointMadeKobe);
        freeThrowKobeMade(freeThrowMadeKobe);
        fgKobeTaken(fgTakenKobe);
        twoPointKobeTaken(twoPointTakenKobe);
        ftKobeTaken(ftTakenKobe);
        fgKobeMade(fgMadeKobe);
        reboundForMJ(reboundMJ);
        blockForMJ(blockMJ);
        stealForMJ(stealMJ);
        foulForMJ(foulMJ);
        turnOverForMJ(turnOverMJ);
        twoPointMJMade(twoPointMadeMJ);
        freeThrowMJMade(freeThrowMadeMJ);
        fgMJMade(fgMadeMJ);
        fgMJTaken(fgTakenMJ);
        twoPointMJTaken(twoPointTakenMJ);
        ftMJTaken(ftTakenMJ);



    }

}
