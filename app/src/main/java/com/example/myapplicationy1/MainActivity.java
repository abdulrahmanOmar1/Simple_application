package com.example.myapplicationy1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtname;
    private EditText edtpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtname=findViewById(R.id.edtname);
        edtpass=findViewById(R.id.edtpass);

    }

    public void btnOnclick(View view) {
    String name = edtname.getText().toString();
    String pass = edtpass.getText().toString();

    String s="Name : " + name + " " +"Pass :"+  pass;

        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }
}