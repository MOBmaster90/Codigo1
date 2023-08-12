package com.mobmasterproductions.codigo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText eTname = (EditText)findViewById(R.id.eTname);
        EditText eTlastname = (EditText)findViewById(R.id.eTlastName);
        RadioButton rB1 = (RadioButton)findViewById(R.id.rB1);
        RadioButton rB2 = (RadioButton)findViewById(R.id.rB2);
        RadioButton rb3 = (RadioButton)findViewById(R.id.rB3);
        EditText eTemail = (EditText)findViewById(R.id.eTemail);
        EditText eTphone = (EditText)findViewById(R.id.eTphone);
        EditText eTaddress = (EditText)findViewById(R.id.eTaddress);
        CheckBox chB1 = (CheckBox)findViewById(R.id.chB1);
        Button btn1 = (Button)findViewById(R.id.btn1);
        TextView txtOut = (TextView)findViewById(R.id.txtOut);
        Spinner sp1 = (Spinner)findViewById(R.id.sp1);
        Spinner sp2 = (Spinner)findViewById(R.id.sp2);
        String[] RH = {"A+", "A-", "AB+", "O-", "O+", "AB-"};

        sp2.setAdapter(new ArrayAdapter<>(MainActivity.this,
                android.R.layout.simple_list_item_1, RH));

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chB1.isChecked()){
                    String name = eTname.getText().toString();
                    String lastname = eTlastname.getText().toString();
                    String email = eTemail.getText().toString();
                    String phone = eTphone.getText().toString();
                    String address = eTaddress.getText().toString();
                    String sexo = "";

                    if(rB1.isChecked()){
                        sexo = "Masculino";
                    }

                    if(rB2.isChecked()){
                        sexo = "Femenino";
                    }

                    if(rb3.isChecked()){
                        sexo = "Otro";
                    }
                    txtOut.setText("Nombre: " + name + "\nApellido: " + lastname +
                            "\nCorreo: " + email + "\nTelefono: " + phone +
                            "\nDireccion: " + address + "\nSexo: " + sexo + "\nTipo Documento: " +
                            sp1.getSelectedItem().toString() + "\nTipo Sanguineo: " +
                            sp2.getSelectedItem().toString());
                }else{
                    Toast.makeText(MainActivity.this, "Debe Aceptar el tratamiento de informacion", Toast.LENGTH_SHORT).show();
                }
            }
        });


        chB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "" + isChecked, Toast.LENGTH_SHORT).show();
            }
        });


        Bundle bundle = getIntent().getExtras();

        Log.i("INFO", bundle.getString("Dato1"));



    }
}
















