package com.bignerdranch.android.criminalintent;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class CrimeActivity extends SingleFragmentActivity {

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_fragment);
//
//        FragmentManager fm = getSupportFragmentManager();
//        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
//
//        if(fragment == null){                       //动态使用Fragment的关键；
//            fragment = new CrimeFragment();
//            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
//        }
//    }
    @Override
    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}
