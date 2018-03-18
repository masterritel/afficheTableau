package com.example.a.affichetableau;

import java.util.Date;


public class outbox {
   private int id;
   private int numTel;
    private String msg;
    private String date;

    public int getId() {
        return id;
    }

 int getNumTel() {
        return numTel;
    }

   String getMsg() {
        return msg;
    }

   String getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    outbox() {
        super();
    }

    public outbox(int num, String m, String d) {
        numTel = num;
        msg = m;
        date = d;
    }

    public outbox(int i, int n, String m, String d) {
        id = i;
        numTel = n;
        msg = m;
        date = d;
    }
}

