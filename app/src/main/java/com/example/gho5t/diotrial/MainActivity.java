package com.example.gho5t.diotrial;

import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        LogInPagerAdapter adapter = new LogInPagerAdapter(MainActivity.this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        Log.v(TAG, "MainActivity Adapter working fine");

        // Give the TabLayout the ViewPager
        TabLayout logInLayout = (TabLayout)findViewById(R.id.sliding_tabs);
        logInLayout.setupWithViewPager(viewPager);
        Log.v(TAG, "MainActivity Tabs working fine");


    }

}
