package com.example.gho5t.diotrial;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class OperationsActivity extends AppCompatActivity {

    private static final String TAG = "OperationsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations);

        ViewPager operationsPager = (ViewPager) findViewById(R.id.view_pager_2);
        OperationsPagerAdapter operationsAdapter = new OperationsPagerAdapter(OperationsActivity.this, getSupportFragmentManager());
        operationsPager.setAdapter(operationsAdapter);
        Log.v(TAG, " OperationsActivity Adapter working fine");


        // Give the TabLayout the ViewPager2
        TabLayout operationsLayout = (TabLayout)findViewById(R.id.sliding_tabs_2);
        operationsLayout.setupWithViewPager(operationsPager);
        Log.v(TAG, " OperationsActivity Tabs working fine");

        ActionBar operationsActionBar = getSupportActionBar();
        operationsActionBar.setElevation(0);
}
}
