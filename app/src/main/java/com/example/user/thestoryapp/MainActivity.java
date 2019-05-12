package com.example.user.thestoryapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView t1 ;
    private Button b1;
    private Button b2;
    private int mStoryIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (TextView) findViewById(R.id.storyTextView);
        b1 = (Button) findViewById(R.id.buttonTop);
        b2 = (Button) findViewById(R.id.buttonBottom);
        mStoryIndex=1;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex==1 || mStoryIndex==2) {

                    t1.setText(R.string.T3_Story);
                    b1.setText(R.string.T3_Ans1);
                    b2.setText(R.string.T3_Ans2);
                    mStoryIndex=3;
                }else if(mStoryIndex==3){
                    t1.setText(R.string.T6_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 1) {
                    t1.setText(R.string.T2_Story);
                    b1.setText(R.string.T2_Ans1);
                    b2.setText(R.string.T2_Ans2);


                    mStoryIndex = 2;
                }else if(mStoryIndex==2){
                    t1.setText(R.string.T4_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);

                }else if(mStoryIndex==3){
                    t1.setText(R.string.T5_End);
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                }

            }
        });
    }
}
