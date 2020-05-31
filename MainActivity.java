package sg.edu.np.WhackAMole;

import android.support.v7.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /* Hint
        - The function setNewMole() uses the Random class to generate a random value ranged from 0 to 2.
        - Feel free to modify the function to suit your program.
    */
     private Button buttonLeft;
    private Button buttonMiddle;
    private Button buttonRight;
    private TextView score;
    private Integer scoreCount;
    private static final String TAG = "Whack-a-mole!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        buttonLeft = (Button) findViewById(R.id.Button1);
        buttonMiddle = (Button) findViewById(R.id.Button2);
        buttonRight = (Button) findViewById(R.id.Button3);
        score = (TextView) findViewById(R.id.score);

        Log.v(TAG, "Finished Pre-Initialisation!");
    }
     buttonLeft.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                Log.v(TAG,"Button Left clicked");
                if (String.valueOf(buttonLeft).equals("*")) {
                    scoreCount += 1;
                    score.setText(""+scoreCount);
                    Log.v(TAG,"Hit, score added!");
                }
                else
                {
                    scoreCount -= 1;
                    score.setText(""+scoreCount);
                    Log.v(TAG,"Missed, score deducted!");
                }
                onStart();
            }
        });

        buttonMiddle.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                Log.v(TAG, "Button Middle clicked");
                if (String.valueOf(buttonMiddle).equals("*")) {
                    scoreCount += 1;
                    score.setText(""+ scoreCount);
                    Log.v(TAG,"Hit, score added!");
                }
                else
                {
                    scoreCount -= 1;
                    score.setText(""+scoreCount);
                    Log.v(TAG,"Missed, score deducted!");

                }
                onStart();
            }
        });

        buttonRight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                Log.v(TAG, "Button Right clicked");
                if (String.valueOf(buttonRight).equals("*")) {
                    scoreCount += 1;
                    score.setText(""+scoreCount);
                    Log.v(TAG,"Hit, score added!");
                }
                else
                {
                    scoreCount -= 1;
                    score.setText(""+scoreCount);
                    Log.v(TAG,"Missed, score deducted!");

                }
                onStart();
            }
        });
    }

    @Override
    protected void onStart(){
        super.onStart();
        setNewMole();
        Log.v(TAG, "Starting GUI!");
    }


    public void setNewMole()
    {
        Random ran = new Random();
        int randomLocation = ran.nextInt(3);
        if(randomLocation == 0){
            buttonLeft.setText("*");
            buttonMiddle.setText("O");
            buttonRight.setText("O");
        }
        else if(randomLocation == 1){
            buttonLeft.setText("O");
            buttonMiddle.setText("*");
            buttonRight.setText("O");
        }
        else {
            buttonLeft.setText("O");
            buttonMiddle.setText("O");
            buttonRight.setText("*");
        }
    }
}
