package com.example.a.affichetableau;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
ListView l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=(ListView)findViewById(R.id.lv) ;
        ArrayList<HashMap<String,String>> values=new ArrayList<HashMap<String, String>>();
        HashMap<String,String>map= new HashMap<String, String>();
        map.put("id","1");
        map.put("NumTel","123");
        map.put("Text","Hi");
        map.put("Date","12/03/2018");
        values.add(map);
        map=new HashMap<String, String>();
        map.put("id","2");
        map.put("NumTel","456");
        map.put("Text","Hello");
        map.put("Date","15/03/2018");
        values.add(map);
        SimpleAdapter adapter=new SimpleAdapter(MainActivity.this,values,R.layout.item,new String[]{"id","NumTel","Text","Date"},new int[]{R.id.textView1,R.id.textView2,R.id.textView3,R.id.textView4});
        l.setAdapter(adapter);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
