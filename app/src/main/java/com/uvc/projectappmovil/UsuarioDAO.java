package com.uvc.projectappmovil;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class UsuarioDAO {
    public SQLiteDatabase getConn(Context context){
            ConexionSQLite conn = new ConexionSQLite(context,"dbFarmacia",null,1);
            SQLiteDatabase db=conn.getWritableDatabase(); //permisos de escritura;
            return  db;
    }

    public int registerUser(Context context,UsuarioDTO user){
        int register = 0;
        String sql="INSERT INTO usuario(id,nombre,apellido,dni,correo,contraseña) VALUES('"+user.getId()+"','"+user.getNombre()+"','"+user.getApellido()+"','"+user.getDni()+"','"+user.getCorreo()+"','"+user.getContraseña()+"')";
        SQLiteDatabase db= this.getConn(context);
            try{
                db.execSQL(sql);
                register=1;
            }catch (Exception e){
                Toast.makeText(context.getApplicationContext(), "Error", Toast.LENGTH_LONG).show();
            }
        return  register;
    }
}
