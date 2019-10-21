package com.example.layonel_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText correoL, contraseñaL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correoL =(EditText)findViewById(R.id.correoL);
        contraseñaL = (EditText)findViewById(R.id.contraseñaL);

    }
    public void Login (View view){
        String val1 = correoL.getText().toString();
        String val2 = contraseñaL.getText().toString();

        if (!val1.isEmpty() && !val2.isEmpty()){


        }else{
            if (val1.isEmpty()){
                correoL.setError("campo vacio");
            }
            if(val2.isEmpty()){
                contraseñaL.setError("campo vacio");
            }


            Toast.makeText(this,"ES NECESARIO INGRESAR TODOS LOS DATOS",Toast.LENGTH_SHORT).show();
        }

    }
}
