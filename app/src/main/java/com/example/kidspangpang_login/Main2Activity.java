package com.example.kidspangpang_login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText idText = (EditText) findViewById(R.id.idText);
        EditText passwoordText = (EditText) findViewById(R.id.passwordText);
        TextView welcomeMassage = (TextView) findViewById(R.id.welcomeMessage);
    }
}
