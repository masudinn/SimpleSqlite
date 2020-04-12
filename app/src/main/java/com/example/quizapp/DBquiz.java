package com.example.quizapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBquiz extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "quiz.db";
    private static final int DATABASE_VERSION =1;
    private SQLiteDatabase db;

    public DBquiz(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                soalContract.tabelSoal.Table_name+" ( "+
                soalContract.tabelSoal._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                soalContract.tabelSoal.Colum_soal+" TEXT, "+
                soalContract.tabelSoal.Colum_opsi1+" TEXT, "+
                soalContract.tabelSoal.Colum_opsi2+" TEXT, "+
                soalContract.tabelSoal.Colum_opsi3+" TEXT, "+
                soalContract.tabelSoal.Colum_jawaban+" INTEGER," + ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
