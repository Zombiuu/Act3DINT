package com.example.ramsesdiezgalvan.act3dint;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;


import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {
    MainActivityEvents events;
    MainActivityFragment mainActivityFragment;
    MainActivityFragment_2 mainActivityFragment_2;
    MainActivityFragment_3 mainActivityFragment_3;
    HelloWorldFragment helloWorldFragment;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldFragment = (HelloWorldFragment) getSupportFragmentManager().findFragmentById(R.id.fragment4);

        fab = this.findViewById(R.id.fab);

        events = new MainActivityEvents(this);
        fab.setOnClickListener(events);

          FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
          transaction.hide(helloWorldFragment);
          transaction.commit();
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
