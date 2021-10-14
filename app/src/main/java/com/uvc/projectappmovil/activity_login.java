package com.uvc.projectappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class activity_login extends AppCompatActivity implements View.OnClickListener {
    TextView btnCrearCuenta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnCrearCuenta = findViewById(R.id.btnCrearCuenta);
        btnCrearCuenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent viewLogin  = new Intent(activity_login.this,activity_register.class);
        startActivity(viewLogin);
        Toast.makeText(getApplicationContext(),"click crear cuenta",Toast.LENGTH_LONG).show();
    }
}