package com.example.project_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    AccountDatabaseHelper myAccDB;

    Button loginBtn,cancelBtn2;
    EditText usernameEditTxt,passwordEditTxt;

    TextView tx1;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myAccDB = new AccountDatabaseHelper(this);

        loginBtn = (Button)findViewById(R.id.loginBtn);
        usernameEditTxt = (EditText)findViewById(R.id.usernameEditTxt);
        passwordEditTxt = (EditText)findViewById(R.id.passwordEditTxt);

        cancelBtn2 = (Button)findViewById(R.id.cancelBtn2);
        tx1 = (TextView)findViewById(R.id.attemptCountTxt);
        tx1.setVisibility(View.GONE);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(usernameEditTxt.getText().toString().equals("admin") &&
                        passwordEditTxt.getText().toString().equals("admin")) {
                    Toast.makeText(getApplicationContext(), "Redirecting...",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);
                    counter--;
                    tx1.setText(Integer.toString(counter));

                    if (counter == 0) {
                        loginBtn.setEnabled(false);
                    }
                }
            }
        });

        cancelBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}
