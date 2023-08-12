package com.mobmasterproductions.codigo1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        LottieAnimationView lttictac = (LottieAnimationView)findViewById(R.id.ltTictac);
        LottieAnimationView lttopos = (LottieAnimationView)findViewById(R.id.ltTopo);

        lttictac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lttictac.playAnimation();
            }
        });

        lttopos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lttopos.playAnimation();
            }
        });

        lttictac.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(principal.this, TicTacToe.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        lttopos.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(principal.this, Topo.class);
                startActivity(intent);
                principal.this.finish();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

    }































    private void iniciar(){
        LottieAnimationView ltTictac = (LottieAnimationView)findViewById(R.id.ltTictac);
        LottieAnimationView ltTopo = (LottieAnimationView)findViewById(R.id.ltTopo);

        ltTictac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ltTictac.playAnimation();
            }
        });

        ltTopo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ltTopo.playAnimation();
            }
        });

        ltTictac.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(principal.this, TicTacToe.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });

        ltTopo.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                Intent intent = new Intent(principal.this, Topo.class);
                startActivity(intent);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
}