package com.example.ramsesdiezgalvan.act3dint;

import android.app.FragmentTransaction;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by ramsesdiezgalvan on 15/1/18.
 */

public class MainActivityEvents implements View.OnClickListener{

    MainActivity mainActivity;


    public MainActivityEvents(MainActivity mainActivity){
        this.mainActivity = mainActivity;
    }

    @Override
    public void onClick(View v) {

    if (mainActivity.helloWorldFragment.isHidden()){
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.show(mainActivity.helloWorldFragment);
        transaction.commit();

    }else{
        android.support.v4.app.FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
        transaction.hide(mainActivity.helloWorldFragment);
        transaction.commit();

    }








    }
}
