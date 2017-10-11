package com.gtechnofy.sample.activitytypesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gtechnofy.sample.activitytypesdemo.basic.BasicActivity;
import com.gtechnofy.sample.activitytypesdemo.bottom_navigation.BottomNavigationActivity;
import com.gtechnofy.sample.activitytypesdemo.empty.EmptyActivity;
import com.gtechnofy.sample.activitytypesdemo.full_screen.FullscreenActivity;
import com.gtechnofy.sample.activitytypesdemo.googlead.GoogleAdActivity;
import com.gtechnofy.sample.activitytypesdemo.googlemap.MapsActivity;
import com.gtechnofy.sample.activitytypesdemo.login.LoginActivity;
import com.gtechnofy.sample.activitytypesdemo.master_details.MasterDetailActivityDetailActivity;
import com.gtechnofy.sample.activitytypesdemo.master_details.MasterDetailActivityListActivity;
import com.gtechnofy.sample.activitytypesdemo.navigation_drawer.NavigationDrawerActivity;
import com.gtechnofy.sample.activitytypesdemo.scrolling.ScrollingActivity;
import com.gtechnofy.sample.activitytypesdemo.settings.SettingsActivity;
import com.gtechnofy.sample.activitytypesdemo.tabbed.TabbedActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button button1, button2, button3, button4, button5, button6,button7,button8, button9, button10, button11,
    button12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.button1:
                intent = new Intent(this, EmptyActivity.class);
                break;
            case R.id.button2:
                intent = new Intent(this, BasicActivity.class);
                break;
            case R.id.button3:
                intent = new Intent(this, BottomNavigationActivity.class);
                break;
            case R.id.button4:
                intent = new Intent(this, FullscreenActivity.class);
                break;
            case R.id.button5:
                intent = new Intent(this, LoginActivity.class);
                break;
            case R.id.button6:
                intent = new Intent(this, ScrollingActivity.class);
                break;
            case R.id.button7:
                intent = new Intent(this, MasterDetailActivityDetailActivity.class);
                break;
            case R.id.button8:
                intent = new Intent(this, NavigationDrawerActivity.class);
                break;
            case R.id.button9:
                intent = new Intent(this, TabbedActivity.class);
                break;
            case R.id.button10:
                intent = new Intent(this, MapsActivity.class);
                break;
            case R.id.button11:
                intent = new Intent(this, GoogleAdActivity.class);
                break;
            case R.id.button12:
                intent = new Intent(this, SettingsActivity.class);
                break;
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
