package com.mobmasterproductions.codigo1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    EditText eTusuario;
    EditText eTpass;
    Button btnLogin;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        eTusuario = (EditText)findViewById(R.id.eTusuario);
        eTpass = (EditText)findViewById(R.id.eTpass);
        btnLogin = (Button)findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = eTusuario.getText().toString();
                eTpass.setText(str);
                Toast.makeText(MainActivity2.this, str, Toast.LENGTH_SHORT).show();
            }
        });
    }
}