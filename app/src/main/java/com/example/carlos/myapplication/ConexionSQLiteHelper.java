package com.example.carlos.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by carlos on 26/02/18.
 */

public class ConexionSQLiteHelper extends SQLiteOpenHelper {
    final String CREAR_TABLA_USUARIO =  "CREATE TABLE usuario (no_control TEXT, nombre TEXT, carrera TEXT)";
    public ConexionSQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREAR_TABLA_USUARIO);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int version_antigua, int version_nueva) {
        db.execSQL("DROP TABLE IF EXISTS usuario");
        onCreate(db);
    }
}
