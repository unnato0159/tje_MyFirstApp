package com.tje.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView  textView;
    EditText userId;
    EditText password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        userId = findViewById(R.id.usrId);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String  content = "ID:"+userId.getText().toString()+"PW:"+password.getText().toString();

                Toast.makeText(MainActivity.this,content, Toast.LENGTH_SHORT).show();

             //  textView.setText(content);
            }
        });
    }
}
