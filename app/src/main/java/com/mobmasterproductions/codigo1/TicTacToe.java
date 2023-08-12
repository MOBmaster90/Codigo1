package com.mobmasterproductions.codigo1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {

    Button btnIniciar;
    ImageView imgJugador;
    TextView txtJugador;

    ImageView img1, img2, img3;
    ImageView img4, img5, img6;
    ImageView img7, img8, img9;

    LinearLayout llhistorial;

    int jugadorP = 0;
    int casillas[][] = {{0, 0, 0},
                        {0, 0, 0},
                        {0, 0, 0}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
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
                if(btnIniciar.getText().toString().equals("INICIAR")){
                    jugadorP = 1;
                    btnIniciar.setText("DETENER");
                    imgJugador.setImageResource(R.mipmap.android);
                    txtJugador.setText("Jugador 1");
                }else if(btnIniciar.getText().toString().equals("DETENER")){
                    jugadorP = 0;
                    btnIniciar.setText("INICIAR");
                }else if(btnIniciar.getText().toString().equals("REINICIAR")){
                    btnIniciar.setText("INICIAR");
                    img1.setImageResource(0);
                    img2.setImageResource(0);
                    img3.setImageResource(0);
                    img4.setImageResource(0);
                    img5.setImageResource(0);
                    img6.setImageResource(0);
                    img7.setImageResource(0);
                    img8.setImageResource(0);
                    img9.setImageResource(0);
                    for(int i=0; i<3; i++){
                        for(int j=0; j<3; j++){
                            casillas[i][j] = 0;
                        }
                    }
                }

            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img1.getDrawable() == null){
                    if(jugadorP == 1){
                        img1.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[0][0] = 1;
                    }else if(jugadorP == 2){
                        img1.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[0][0] = 2;
                    }
                    verificar();
                }
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img2.getDrawable() == null){
                    if(jugadorP == 1){
                        img2.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[0][1] = 1;
                    }else if(jugadorP == 2){
                        img2.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[0][1] = 2;
                    }
                    verificar();
                }
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img3.getDrawable() == null){
                    if(jugadorP == 1){
                        img3.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[0][2] = 1;
                    }else if(jugadorP == 2){
                        img3.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[0][2] = 2;
                    }
                    verificar();
                }
            }
        });

        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img4.getDrawable() == null){
                    if(jugadorP == 1){
                        img4.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[1][0] = 1;
                    }else if(jugadorP == 2){
                        img4.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[1][0] = 2;
                    }
                    verificar();
                }
            }
        });

        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img5.getDrawable() == null){
                    if(jugadorP == 1){
                        img5.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[1][1] = 1;
                    }else if(jugadorP == 2){
                        img5.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[1][1] = 2;
                    }
                    verificar();
                }
            }
        });

        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img6.getDrawable() == null){
                    if(jugadorP == 1){
                        img6.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[1][2] = 1;
                    }else if(jugadorP == 2){
                        img6.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[1][2] = 2;
                    }
                    verificar();
                }
            }
        });

        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img7.getDrawable() == null){
                    if(jugadorP == 1){
                        img7.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[2][0] = 1;
                    }else if(jugadorP == 2){
                        img7.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[2][0] = 2;
                    }
                    verificar();
                }
            }
        });

        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img8.getDrawable() == null){
                    if(jugadorP == 1){
                        img8.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[2][1] = 1;
                    }else if(jugadorP == 2){
                        img8.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[2][1] = 2;
                    }
                    verificar();
                }
            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(img9.getDrawable() == null){
                    if(jugadorP == 1){
                        img9.setImageResource(R.mipmap.android);
                        jugadorP = 2;
                        imgJugador.setImageResource(R.mipmap.apple);
                        txtJugador.setText("Jugador 2");
                        casillas[2][2] = 1;
                    }else if(jugadorP == 2){
                        img9.setImageResource(R.mipmap.apple);
                        jugadorP = 1;
                        imgJugador.setImageResource(R.mipmap.android);
                        txtJugador.setText("Jugador 1");
                        casillas[2][2] = 2;
                    }
                    verificar();
                }
            }
        });
    }

    private void verificar(){
        if((casillas[0][0] == 1 && casillas[0][1] == 1 && casillas[0][2] == 1) ||
                (casillas[1][0] == 1 && casillas[1][1] == 1 && casillas[1][2] == 1) ||
                (casillas[2][0] == 1 && casillas[2][1] == 1 && casillas[2][2] == 1) ||
                (casillas[0][0] == 1 && casillas[1][0] == 1 && casillas[2][0] == 1) ||
                (casillas[0][1] == 1 && casillas[1][1] == 1 && casillas[2][1] == 1) ||
                (casillas[0][2] == 1 && casillas[1][2] == 1 && casillas[2][2] == 1) ||
                (casillas[0][0] == 1 && casillas[1][1] == 1 && casillas[2][2] == 1) ||
                (casillas[2][0] == 1 && casillas[1][1] == 1 && casillas[0][2] == 1)){
            dialogo_ganador(1);
            agregar_historial(1);
            Toast.makeText(this, "Ganador Jugador 1", Toast.LENGTH_SHORT).show();
            jugadorP = 0;
            imgJugador.setImageResource(R.mipmap.ic_launcher);
            btnIniciar.setText("REINICIAR");
        }else if((casillas[0][0] == 2 && casillas[0][1] == 2 && casillas[0][2] == 2) ||
                (casillas[1][0] == 2 && casillas[1][1] == 2 && casillas[1][2] == 2) ||
                (casillas[2][0] == 2 && casillas[2][1] == 2 && casillas[2][2] == 2) ||
                (casillas[0][0] == 2 && casillas[1][0] == 2 && casillas[2][0] == 2) ||
                (casillas[0][1] == 2 && casillas[1][1] == 2 && casillas[2][1] == 2) ||
                (casillas[0][2] == 2 && casillas[1][2] == 2 && casillas[2][2] == 2) ||
                (casillas[0][0] == 2 && casillas[1][1] == 2 && casillas[2][2] == 2) ||
                (casillas[2][0] == 2 && casillas[1][1] == 2 && casillas[0][2] == 2)){
            dialogo_ganador(2);
            agregar_historial(2);
            Toast.makeText(this, "Ganador Jugador 2", Toast.LENGTH_SHORT).show();
            jugadorP = 0;
            imgJugador.setImageResource(R.mipmap.ic_launcher);
            btnIniciar.setText("REINICIAR");
        }else{
            if(img1.getDrawable() != null && img2.getDrawable() != null && img3.getDrawable() != null
                    && img4.getDrawable() != null  && img5.getDrawable() != null  && img6.getDrawable() != null
                    && img7.getDrawable() != null  && img8.getDrawable() != null  && img9.getDrawable() != null ){
                Toast.makeText(this, "Empate", Toast.LENGTH_SHORT).show();
                jugadorP = 0;
                imgJugador.setImageResource(R.mipmap.ic_launcher);
                btnIniciar.setText("REINICIAR");
            }
        }
    }

    private void dialogo_ganador(int jg){
        Dialog dialog = new Dialog(TicTacToe.this);
        dialog.setContentView(R.layout.dialogo_ganador);
        TextView txtGanador = (TextView)dialog.findViewById(R.id.txtGanador);
        txtGanador.setText(txtGanador.getText().toString() + " " + jg);
        dialog.show();
    }

    private void agregar_historial(int jg){
        TextView txt = new TextView(TicTacToe.this);
        txt.setText("Ganador: Jugador " + jg);
        llhistorial.addView(txt);
    }
}