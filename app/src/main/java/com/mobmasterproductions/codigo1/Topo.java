package com.mobmasterproductions.codigo1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.Map;
import java.util.Random;
import java.util.Set;

public class Topo extends AppCompatActivity {


    int puntosT = 0;
    int nGhost = 0;
    boolean click = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.topo_level_dos);


        TextView txtPuntos = (TextView)findViewById(R.id.txtPuntos);
        TextView txtGhost = (TextView)findViewById(R.id.txtGhost);
        LottieAnimationView animGhost = (LottieAnimationView)findViewById(R.id.animGhost);

        //animGhost.playAnimation();



        animGhost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!click){
                    puntosT++;
                    txtPuntos.setText("SCORE: " + puntosT);
                    click = true;
                }
            }
        });

        animGhost.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                nGhost++;
                txtGhost.setText("GHOST: " + nGhost);
                click = false;
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if(!txtGhost.getText().toString().equals("GHOST: 3")){
                    float x = (float) Math.random()*1900;
                    float y = (float) Math.random()*850;
                    animGhost.setX(x);
                    animGhost.setY(y);
                    animGhost.playAnimation();
                }else{
                    mostrar_dialogo_score();
                }

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });


    }

    private void mostrar_dialogo_score(){

        SharedPreferences preferences = Topo.this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        int score1 = preferences.getInt("SCORE1", 0);
        int score2 = preferences.getInt("SCORE2", 0);
        int score3 = preferences.getInt("SCORE3", 0);

        if(puntosT >= score1){
            score3 = score2;
            score2 = score1;
            score1 = puntosT;
            editor.putInt("SCORE1", puntosT);
            editor.putInt("SCORE2", score2);
            editor.putInt("SCORE3", score3);
        }else if(puntosT >= score2){
            score3 = score2;
            score2 = puntosT;
            editor.putInt("SCORE2", puntosT);
            editor.putInt("SCORE3", score3);
        }else if(puntosT >= score3){
            score3 = puntosT;
            editor.putInt("SCORE3", puntosT);
        }

        editor.apply();

        Dialog dialog = new Dialog(Topo.this);
        dialog.setContentView(R.layout.dialogo_score);
        TextView txtScore1 = (TextView)dialog.findViewById(R.id.txtScore1);
        TextView txtScore2 = (TextView)dialog.findViewById(R.id.txtScore2);
        TextView txtScore3 = (TextView)dialog.findViewById(R.id.txtScore3);
        txtScore1.setText("1. " + score1 + " pts.");
        txtScore2.setText("2. " + score2 + " pts.");
        txtScore3.setText("3. " + score3 + " pts.");

        Window window = dialog.getWindow();
        window.setLayout(1000, LinearLayout.LayoutParams.WRAP_CONTENT);

        dialog.show();
    }




























    /*private void mostrar_dialogo_score(){
        SharedPreferences preferences = this.getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        int SCORE1 = preferences.getInt("SCORE1", 0);
        int SCORE2 = preferences.getInt("SCORE2", 0);
        int SCORE3 = preferences.getInt("SCORE3", 0);

        if(puntosT >= SCORE1){
            editor.putInt("SCORE1", puntosT);
            SCORE3 = SCORE2;
            SCORE2 = SCORE1;
            SCORE1 = puntosT;
        }else if(puntosT >= SCORE2){
            editor.putInt("SCORE2", puntosT);
            SCORE3 = SCORE2;
            SCORE2 = puntosT;
        }else if(puntosT >= SCORE3){
            editor.putInt("SCORE3", puntosT);
            SCORE3 = puntosT;
        }

        editor.apply();

        Dialog dialog = new Dialog(Topo.this);
        dialog.setContentView(R.layout.dialogo_score);
        TextView txtScore1 = (TextView)dialog.findViewById(R.id.txtScore1);
        TextView txtScore2 = (TextView)dialog.findViewById(R.id.txtScore2);
        TextView txtScore3 = (TextView)dialog.findViewById(R.id.txtScore3);

        txtScore1.setText("1. " + SCORE1 + " pts.");
        txtScore2.setText("2. " + SCORE2 + " pts.");
        txtScore3.setText("3. " + SCORE3 + " pts.");

        Window window = dialog.getWindow();
        window.setLayout(800, LinearLayout.LayoutParams.WRAP_CONTENT);


        dialog.show();
    }*/


    private void ghostAnim(LottieAnimationView ghost){
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    for(float i=0.0f; i<1.0f; i=i+0.1f){
                        ghost.setAlpha(i);
                        Thread.sleep((long)((float)(((ghost.getDuration()/ghost.getSpeed())/2.0f)/10.0f)));
                    }

                    for(float i=1.0f; i>0.0f; i=i-0.1f){
                        ghost.setAlpha(i);
                        Thread.sleep((long)((float)(((ghost.getDuration()/ghost.getSpeed())/2.0f)/10.0f)));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }


























/*




    TextView txtNivel, txtScore, txtTopos;
    Button btnIniciar;
    LottieAnimationView anim[] = new LottieAnimationView[7];

    int nivel = 1;
    int score = 0;
    boolean estado = false;
    int cont = 1;
    private void nivel_1(){
        setContentView(R.layout.activity_topo);
        txtNivel = (TextView)findViewById(R.id.txtnivel);
        txtScore = (TextView)findViewById(R.id.txtScore);
        txtTopos = (TextView)findViewById(R.id.txtTopos);
        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        anim[0] = (LottieAnimationView)findViewById(R.id.anim1);
        anim[1] = (LottieAnimationView)findViewById(R.id.anim2);
        anim[2] = (LottieAnimationView)findViewById(R.id.anim3);
        anim[3] = (LottieAnimationView)findViewById(R.id.anim4);
        anim[4] = (LottieAnimationView)findViewById(R.id.anim5);
        anim[5] = (LottieAnimationView)findViewById(R.id.anim6);
        anim[6] = (LottieAnimationView)findViewById(R.id.anim7);



        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNivel.setText("Nivel: " + nivel);
                txtScore.setText("Score: " + score);
                txtTopos.setText("Topos: " + cont);
                estado = true;
                topo((int)(Math.random()*7));
            }
        });

        for(int i=0; i<anim.length; i++){
            int finalI = i;
            anim[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(anim[finalI].isAnimating()){
                        score++;
                        anim[finalI].setClickable(false);
                        anim[finalI].setSpeed(4.0f);
                    }else{
                        score--;
                    }
                    txtScore.setText("Score: " + score);
                }
            });
            anim[i].addAnimatorListener(new Animator.AnimatorListener() {
                @Override
                public void onAnimationStart(Animator animation) {

                }

                @Override
                public void onAnimationEnd(Animator animation) {
                    if(estado && cont < 30){
                        activarLottieView();
                        cont++;
                        txtTopos.setText("Topos: " + cont);
                        topo((int)(Math.random()*7));
                        anim[finalI].setSpeed(1.0f);
                    }
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


    private void topo(int x){
        for(int i=0; i<anim.length; i++){
            if(i != x){
                anim[i].setClickable(false);
            }
        }
        anim[x].playAnimation();
    }

    private void activarLottieView(){
        for(int i=0; i<anim.length; i++){
            anim[i].setClickable(true);
        }
    }



    boolean click = false;
    int contG = -1;
    private void level2(){
        setContentView(R.layout.topo_level_dos);
        LottieAnimationView ghost = (LottieAnimationView)findViewById(R.id.animGhost);
        TextView txtGhost = (TextView)findViewById(R.id.txtGhost);
        TextView txtPuntos = (TextView)findViewById(R.id.txtPuntos);
        ghost.playAnimation();
        ghost.setSpeed(1.0f);

        ghost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!click){
                    if(contG > 0)txtPuntos.setText("SCORE: " + (Integer.parseInt(txtPuntos.getText().toString().split(" ")[1]) + 1));
                    click = true;
                }
            }
        });

        ghost.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                contG++;
                txtGhost.setText("GHOST: " + contG);
                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        try {
                            for(float i=0.0f; i<1.0f; i=i+0.1f){
                                ghost.setAlpha(i);
                                Thread.sleep((long)((float)(((ghost.getDuration()/ghost.getSpeed())/2.0f)/10.0f)));
                            }

                            for(float i=1.0f; i>0.0f; i=i-0.1f){
                                ghost.setAlpha(i);
                                Thread.sleep((long)((float)(((ghost.getDuration()/ghost.getSpeed())/2.0f)/10.0f)));
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                };
                thread.start();
            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if(contG < 3000000){
                    float x = (float) Math.random()*1900;
                    float y = (float) Math.random()*850;
                    ghost.setX(x);
                    ghost.setY(y);
                    ghost.playAnimation();
                    click = false;
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }
*/

}