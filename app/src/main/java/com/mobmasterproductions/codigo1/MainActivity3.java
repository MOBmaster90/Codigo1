package com.mobmasterproductions.codigo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity3 extends AppCompatActivity {

    Button btn1;
    LottieAnimationView imgTurno;
    TextView txtJugador;
    LottieAnimationView img1;
    LottieAnimationView img2;
    LottieAnimationView img3;
    LottieAnimationView img4;
    LottieAnimationView img5;
    LottieAnimationView img6;
    LottieAnimationView img7;
    LottieAnimationView img8;
    LottieAnimationView img9;

    TextView txtGanador;

    TextView txtDialogoG;

    int turno;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tictactoe_anim);
        btn1 = (Button) findViewById(R.id.btn1);
        imgTurno = (LottieAnimationView)findViewById(R.id.imgTurno);
        txtJugador = (TextView) findViewById(R.id.txtJugador);
        txtGanador = (TextView)findViewById(R.id.txtGanador);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                turno = ((int)(Math.random()*2))+1;
                if(turno == 1){
                    imgTurno.setImageResource(R.mipmap.android);
                    txtJugador.setText("Jugador 1");
                }else{
                    imgTurno.setImageResource(R.mipmap.apple);
                    txtJugador.setText("Jugador 2");
                }
            }
        });
        vista1();
    }



    private void vista1(){
        for (int i = 1; i <= 9; i++) {
            int resourceId = getResources().getIdentifier("img" + i, "id", getPackageName());
            ImageView img = findViewById(resourceId);
            img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(img.getTag().equals("null")) {
                        if (turno == 1) {
                            // cambiar imagen a android
                            img.setImageResource(R.mipmap.android);
                            imgTurno.setImageResource(R.mipmap.apple);
                            txtJugador.setText("Jugador 2");
                            turno = 2;
                            img.setTag("android");
                        } else {
                            // cambiar imagen a apple
                            img.setImageResource(R.mipmap.apple);
                            imgTurno.setImageResource(R.mipmap.android);
                            txtJugador.setText("Jugador 1");
                            turno = 1;
                            img.setTag("apple");
                        }
                    }
                }
            });

        }
    }

    private void vista2(){
        img1 = (LottieAnimationView)findViewById(R.id.img1);
        img2 = (LottieAnimationView)findViewById(R.id.img2);
        img3 = (LottieAnimationView)findViewById(R.id.img3);
        img4 = (LottieAnimationView)findViewById(R.id.img4);
        img5 = (LottieAnimationView)findViewById(R.id.img5);
        img6 = (LottieAnimationView)findViewById(R.id.img6);
        img7 = (LottieAnimationView)findViewById(R.id.img7);
        img8 = (LottieAnimationView)findViewById(R.id.img8);
        img9 = (LottieAnimationView)findViewById(R.id.img9);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img1.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img1.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img1.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img1.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img1.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });


        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img2.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img2.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img2.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img2.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img2.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img3.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img3.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img3.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img3.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img3.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img4.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img4.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img4.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img4.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img4.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img5.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img5.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img5.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img5.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img5.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img6.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img6.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img6.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img6.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img6.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img7.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img7.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img7.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img7.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img7.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img8.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img8.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img8.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img8.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img8.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img9.getTag().equals("null")){
                    if(turno == 1){
                        // cambiar imagen a android
                        img9.setImageResource(R.mipmap.android);
                        imgTurno.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        turno = 2;
                        img9.setTag("android");
                    }else{
                        // cambiar imagen a apple
                        img9.setImageResource(R.mipmap.apple);
                        imgTurno.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        turno = 1;
                        img9.setTag("apple");
                    }
                    if((img1.getTag().equals(img2.getTag()) && img1.getTag().equals(img3.getTag()) && !img1.getTag().equals("null")) ||
                            (img4.getTag().equals(img5.getTag()) && img4.getTag().equals(img6.getTag()) && !img4.getTag().equals("null")) ||
                            (img7.getTag().equals(img8.getTag()) && img7.getTag().equals(img9.getTag()) && !img7.getTag().equals("null")) ||
                            (img1.getTag().equals(img4.getTag()) && img1.getTag().equals(img7.getTag()) && !img1.getTag().equals("null")) ||
                            (img2.getTag().equals(img5.getTag()) && img2.getTag().equals(img8.getTag()) && !img2.getTag().equals("null")) ||
                            (img3.getTag().equals(img6.getTag()) && img3.getTag().equals(img9.getTag()) && !img3.getTag().equals("null")) ||
                            (img1.getTag().equals(img5.getTag()) && img1.getTag().equals(img9.getTag()) && !img1.getTag().equals("null")) ||
                            (img3.getTag().equals(img5.getTag()) && img3.getTag().equals(img7.getTag())) && !img3.getTag().equals("null")){
                        if(turno == 2){
                            txtGanador.setText("GANADOR\nJugador 1");
                        }else{
                            txtGanador.setText("GANADOR\nJugador 2");
                        }
                    }
                }
            }
        });
    }
}


