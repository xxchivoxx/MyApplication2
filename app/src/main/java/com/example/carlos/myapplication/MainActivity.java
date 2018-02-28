package com.example.carlos.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConexionSQLiteHelper con = new ConexionSQLiteHelper(this,"bd_usuarios",null,1);
        try{
            SQLiteDatabase db = con.getWritableDatabase();

            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
            db.execSQL("INSERT INTO usuario VALUES('14401032','Jose Carlos GUerra Robles','TICs')");
        }catch (SQLiteException e){
            Toast.makeText(this, ""+e, Toast.LENGTH_SHORT).show();
        }

    }
}
