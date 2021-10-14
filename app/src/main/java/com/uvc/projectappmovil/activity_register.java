package com.uvc.projectappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_register extends AppCompatActivity implements View.OnClickListener {
    ImageView btnRegresar;
    Button btnRegistrar;
    UsuarioDAO userDao;
    UsuarioDTO userDto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(this);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnRegistrar.setOnClickListener(this);

    }

    @Override
    public void onClick(View e) {
        if(btnRegresar==e){
            Intent viewRegister  = new Intent(activity_register.this,activity_login.class);
            startActivity(viewRegister);
        }
        if(btnRegistrar==e){
            userDao = new UsuarioDAO();
            userDto = new UsuarioDTO();
            userDto.setId(1);
            userDto.setNombre("Jhon");
            userDto.setApellido("Araujo");
            userDto.setDni("75656447");
            userDto.setCorreo("jhon0003.alexander@gmail.com");
            userDto.setContraseña("123");
            int registerUser = userDao.registerUser(activity_register.this,userDto);
            if(registerUser==1){
                Toast.makeText(getApplicationContext(), "Usuario Registrado", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        }
    }
}