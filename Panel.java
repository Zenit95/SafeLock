package com.arduino.zenit.safelock;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.arduino.zenit.safelock.R.layout.panel;

/**
 * Created by PORTATIL on 04/01/2017.
 */

public class Panel extends AppCompatActivity {

    EditText editText;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ast,has;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.panel);
        Intent intent = getIntent();;
        editText = (EditText) findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.n1);
        b2 = (Button) findViewById(R.id.n2);
        b3 = (Button) findViewById(R.id.n3);
        b4 = (Button) findViewById(R.id.n4);
        b5 = (Button) findViewById(R.id.n5);
        b6 = (Button) findViewById(R.id.n6);
        b7 = (Button) findViewById(R.id.n7);
        b8 = (Button) findViewById(R.id.n8);
        b9 = (Button) findViewById(R.id.n9);
        b0 = (Button) findViewById(R.id.n0);
        ast = (Button) findViewById(R.id.ast);
        has = (Button) findViewById(R.id.has);

        b0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "0"));
            }
        });

        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "1"));
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "2"));
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "3"));
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "4"));
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "5"));
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "6"));
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "7"));
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "8"));
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "9"));
            }
        });

        ast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().delete(editText.getText().length()-1, editText.getText().length()));
            }
        });

        has.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });
    }
}
