package com.example.minhnguyen.fragment_example;

import android.app.Fragment;
import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment fragment = new LM_Fragment();
        fragmentTransaction.add(R.id.FrameContent,fragment);
        fragmentTransaction.commit();


    }

}