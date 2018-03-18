package com.example.a.affichetableau;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class DatabaseHandler extends SQLiteOpenHelper{
    DatabaseHandler(Context context1, String manager, Context context, int i) {
        super(context,"Manager",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("Create table outbox (_id INTEGER PRIMARY KEY AUTOINCREMENT,numTel INTEGER,msg TEXT,date DATE);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
sqLiteDatabase.execSQL("DROP TABLE IF EXISTS outbox");
onCreate(sqLiteDatabase);
    }
}

