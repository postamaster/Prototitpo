package com.example.layonel_1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText nombre,correo,contraseña, contraseña2;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = (EditText)findViewById(R.id.nombre);
        correo = (EditText)findViewById(R.id.correo);
        contraseña = (EditText)findViewById(R.id.contraseña);
        contraseña2 = (EditText)findViewById(R.id.contraseña2);
    }
    public void Login(View view){

    }
    public void registro(View view){

        String val =  nombre.getText().toString();
        String val2 = correo.getText().toString();
        String val3 = contraseña.getText().toString();
        String val4 = contraseña2.getText().toString();

         if(!val.isEmpty() && !val2.isEmpty()&& !val3.isEmpty() && !val4.isEmpty()){

             if(val3.equals(val4)){

             }else{
                 Toast.makeText(this,"LAS CONTRASEÑAS NO COINCIDEN",Toast.LENGTH_SHORT).show();
             }

         }else{

             if (val.isEmpty()){
                 nombre.setError("campo vacio");
             }
             if(val2.isEmpty()){
                 correo.setError("campo vacio");
             }
             if(val3.isEmpty()){
                 contraseña.setError("campo vacio");
             }
             if (val4.isEmpty()){
                 contraseña2.setError("campo vacio");
             }

             Toast.makeText(this,"ES NECESARIO LLENAR TODOS LOS CAMPOS",Toast.LENGTH_SHORT).show();
         }


//        AdminBD admin = new AdminBD(this, "administracion", null);
    }
}
