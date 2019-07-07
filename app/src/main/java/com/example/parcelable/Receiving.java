package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Receiving extends AppCompatActivity {

    TextView mViewfirst, mViewsecond, mViewThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiving);

        mViewfirst = findViewById(R.id.first);

        mViewsecond = findViewById(R.id.second);
        mViewThird = findViewById(R.id.third);


        ModelClass modelClass = getIntent().getParcelableExtra("message");

        mViewfirst.setText(modelClass.getName());
        mViewsecond.setText(modelClass.getEmail());
        mViewThird.setText(String.valueOf(modelClass.getPhoneno()));
    }
}
