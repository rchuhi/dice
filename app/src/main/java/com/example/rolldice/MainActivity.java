package com.example.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random ran = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//finds the Image view in the layout
        imageViewDice = findViewById(R.id.view_dice);
        //runs when clicked.
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }
    private void rollDice(){
        //animates the image when clicked
        int randomNum = ran.nextInt(6)+1;
        Animation animate = AnimationUtils.loadAnimation(this, R.anim.roll);
        imageViewDice.startAnimation(animate);
        //switches the image to match the number clicked.
        switch (randomNum){
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;

            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.win);
                break;
        }
    }
}