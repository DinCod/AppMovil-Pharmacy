package com.uvc.projectappmovil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class activity_register extends AppCompatActivity implements View.OnClickListener {
    ImageView btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent viewRegister  = new Intent(activity_register.this,activity_login.class);
        startActivity(viewRegister);
    }
}