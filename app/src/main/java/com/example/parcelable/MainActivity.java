package com.example.parcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText mTextName, mTextEmail,mTextPhoneno;
    Button btnSend;
    private ModelClass mModelClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextName = findViewById(R.id.editTextName);
        mTextEmail = findViewById(R.id.editTextEmail);
        mTextPhoneno = findViewById(R.id.editTextPhoneNo);

        btnSend = findViewById(R.id.btnSend);






        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = mTextName.getText().toString().trim();
                String email = mTextEmail.getText().toString().trim();
                int phoneNo = Integer.parseInt(mTextPhoneno.getText().toString().trim());


//initialize the model class
                mModelClass = new ModelClass();
//use the model class to set the variables


                mModelClass.setName(name);
                mModelClass.setEmail(email);
                mModelClass.setPhoneno(phoneNo);
//
                Intent intent = new Intent(MainActivity.this,Receiving.class);
                intent.putExtra("message", mModelClass);
                startActivity(intent);
            }
        });



    }

}
