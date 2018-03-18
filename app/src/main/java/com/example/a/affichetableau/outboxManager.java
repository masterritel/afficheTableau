package com.example.a.affichetableau;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;



public class outboxManager {
    private DatabaseHandler dbh;
    private SQLiteDatabase db;

    public outboxManager(Context context) {
        dbh = new DatabaseHandler(context, "Manager", null, 1);
    }

    public void open() {
        db = dbh.getWritableDatabase();
    }

    public void close() {
        db.close();
    }

    public void AddOutbox(outbox o) {
        ContentValues cv = new ContentValues();
        cv.put("numTel", o.getNumTel());
        cv.put("msg", o.getMsg());
        cv.put("date", o.getDate());
        db.insert("outbox", null, cv);
        db.close();
    }
    public Cursor getAllOutbox()
    {db=dbh.getReadableDatabase();
        return db.rawQuery("SELECT * FROM outbox",null);}
    public outbox getOutbox(int id) {
        outbox o = new outbox();
        db = dbh.getReadableDatabase();
        @SuppressLint("Recycle") Cursor c = db.query("outbox", new String[]{"_id", "numTel", "msg", "date"}, "_id=?", new String[]{String.valueOf(id)}, null, null, null, null);
        if (c != null && c.moveToFirst()) {
            o.setId(c.getInt(0));
            o.setNumTel(c.getInt(1));
            o.setMsg(c.getString(2));
            String date = o.getDate();
        }
        return o;
    }
    public void setOutbox(outbox o)
    {
        db=dbh.getWritableDatabase();
        db.execSQL("UPDATE outbox set numTel="+o.getNumTel()+"msg="+o.getMsg()+"date="+o.getDate()+"where _id="+o.getId());
        db.close();
    }
    public void deleteOutbox(outbox o)
    {db=dbh.getWritableDatabase();
    db.delete("outbox","_id=?",new String[]{String.valueOf(o.getId())});
    db.close();}
}


