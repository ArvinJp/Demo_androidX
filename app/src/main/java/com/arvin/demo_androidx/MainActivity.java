package com.arvin.demo_androidx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String mName;
    private int mAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mName="arvin";
        mAge=27;
        User2 user2 = new User2();
        user2.getDes();
        init(mName,mAge);


    }

    public void init(String args,int code)
    {
        Log.i("","");
    }
}
