package com.mobmasterproductions.codigo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacExp extends AppCompatActivity {

    Button btnIniciar;
    ImageView imgJugador;
    TextView txtJugador;

    ImageView img1, img2, img3;
    ImageView img4, img5, img6;
    ImageView img7, img8, img9;

    LinearLayout llhistorial;

    boolean estado = false;
    int jugador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_exp);
        btnIniciar = (Button)findViewById(R.id.btnIniciar);
        imgJugador = (ImageView)findViewById(R.id.imgJugador);
        txtJugador = (TextView)findViewById(R.id.txtJugador);
        img1 = (ImageView)findViewById(R.id.img1);
        img2 = (ImageView)findViewById(R.id.img2);
        img3 = (ImageView)findViewById(R.id.img3);
        img4 = (ImageView)findViewById(R.id.img4);
        img5 = (ImageView)findViewById(R.id.img5);
        img6 = (ImageView)findViewById(R.id.img6);
        img7 = (ImageView)findViewById(R.id.img7);
        img8 = (ImageView)findViewById(R.id.img8);
        img9 = (ImageView)findViewById(R.id.img9);
        llhistorial = (LinearLayout)findViewById(R.id.llhistorial);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                estado = true;
                imgJugador.setImageResource(R.mipmap.android);
                txtJugador.setText("Jugador 1");
                jugador = 1;
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img1.getTag().toString().equals("null")){
                    if(jugador == 1){
                        img1.setImageResource(R.mipmap.android);
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        jugador = 2;
                        img1.setTag("Android");
                    }else if(jugador == 2){
                        img1.setImageResource(R.mipmap.apple);
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        jugador = 1;
                        img1.setTag("Apple");
                    }
                    verificar();
                }
            }
        });
    }

    private void verificar(){
        // Evaluar las condiciones de verificacion de ganador o empate
        Toast.makeText(this, "Metodo verificar", Toast.LENGTH_SHORT).show();
        dialogo_ganador(2);
    }

    private void dialogo_ganador(int jg){
        Dialog dialogo = new Dialog(TicTacExp.this);
        dialogo.setContentView(R.layout.dialogo_win);
        ImageView imgGanador = (ImageView)dialogo.findViewById(R.id.imgGanador);
        TextView txtGanador = (TextView)dialogo.findViewById(R.id.txtGanador);
        if(jg == 1){
            imgGanador.setImageResource(R.mipmap.android);
        }else if(jg == 2){
            imgGanador.setImageResource(R.mipmap.apple);
        }
        txtGanador.setText("Jugador " + jg);
        dialogo.show();
    }
}