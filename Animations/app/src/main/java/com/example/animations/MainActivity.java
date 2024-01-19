package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.Scale;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    boolean isWorked = false;
    boolean isOrel = true;
    Animation fadeOut, fadeIn, scale, down, in, out, rotate;
    ImageView imageView;
    Button button;
    ScaleAnimation shrink, grow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*fadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);
        fadeIn = AnimationUtils.loadAnimation(this, R.anim.fadein);*/
//        scale = AnimationUtils.loadAnimation(this, R.anim.scale);
       /* in = AnimationUtils.loadAnimation(this, R.anim.in);
        out = AnimationUtils.loadAnimation(this, R.anim.out);*/
        rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);

        /*fadeIn.setAnimationListener(fin);
        fadeOut.setAnimationListener(fot);*/

//        down = AnimationUtils.loadAnimation(this, R.anim.translate);


        /*shrink = new ScaleAnimation(1.0f, 0.0f, 1.0f, 1.0f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        shrink.setDuration(400);

        grow = new ScaleAnimation(0.0f, 1.0f, 1.0f, 1.0f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f, ScaleAnimation.RELATIVE_TO_SELF, 0.5f);
        grow.setDuration(400);

        shrink.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (isOrel) {
                    imageView.setImageResource(R.drawable.pitak);
                } else {
                    imageView.setImageResource(R.drawable.orel);
                }

                    imageView.startAnimation(grow);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        grow.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                if (isOrel) {
                    imageView.setImageResource(R.drawable.pitak);
                } else {
                    imageView.setImageResource(R.drawable.orel);
                }
                isOrel = !isOrel;

                    imageView.startAnimation(shrink);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });*/

       /* ViewFlipper flipper = findViewById(R.id.view_flipper);

        findViewById(R.id.auto_btn).setOnClickListener(view -> {
            if (!flipper.isFlipping()) {
                flipper.showNext();
                flipper.startFlipping();
            }
        });

        findViewById(R.id.manual_btn).setOnClickListener(view -> {
            if (flipper.isFlipping()) {
                flipper.stopFlipping();
            }
            flipper.showNext();
        });*/

       /* button = findViewById(R.id.btn_one);
        imageView = findViewById(R.id.image_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!isWorked) {
//                  imageView.startAnimation(fadeOut);
//                  imageView.startAnimation(shrink);
                    imageView.startAnimation(down);
                    imageView.setImageResource(R.drawable.orel);
                    button.setText("Stop animation");
                } else {
                    imageView.clearAnimation();
                    button.setText("Start animation");
                    *//*fadeIn.cancel();
                    fadeOut.cancel();*//*

                }
                isWorked = !isWorked;
            }
        });*/

        imageView = findViewById(R.id.image_view);
        findViewById(R.id.btn_one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);*/
                if (!isWorked) {
                    imageView.startAnimation(rotate);
                } else {
                    imageView.clearAnimation();
                }
                isWorked = !isWorked;
            }
        });

    }

    /*Animation.AnimationListener fot = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            if (isWorked) {
                imageView.startAnimation(fadeIn);
            }
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };

    Animation.AnimationListener fin = new Animation.AnimationListener() {
        @Override
        public void onAnimationStart(Animation animation) {

        }

        @Override
        public void onAnimationEnd(Animation animation) {
            if (isWorked) {
                imageView.startAnimation(fadeOut);
            }
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }
    };*/

    @Override
    protected void onStop() {
        super.onStop();
        imageView.clearAnimation();
    }
}