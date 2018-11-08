package com.hackathonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hackathonapp..Page2Fragment;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, Page2Fragment.newInstance())
                    .commitNow();
        }
    }
}
