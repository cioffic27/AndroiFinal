package com.example.project_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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

    Button registerBtn,loginBtn,cancelBtn2;
    EditText usernameEditTxt,passwordEditTxt;

    TextView tx1;
    int counter = 3;
    String u1="",u2="",u3="";
    String p1="",p2="",p3="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        myAccDB = new AccountDatabaseHelper(this);

        registerBtn = (Button)findViewById(R.id.btnRegister);
        loginBtn = (Button)findViewById(R.id.loginBtn);
        usernameEditTxt = (EditText)findViewById(R.id.usernameEditTxt);
        passwordEditTxt = (EditText)findViewById(R.id.passwordEditTxt);


        final String dbString = myAccDB.toString();
        cancelBtn2 = (Button)findViewById(R.id.cancelBtn2);
        tx1 = (TextView)findViewById(R.id.attemptCountTxt);
        tx1.setVisibility(View.GONE);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted = myAccDB.insertData(usernameEditTxt.getText().toString(),passwordEditTxt.getText().toString());

                if(isInserted==true){
                    Toast.makeText(LoginActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                    if(u1==""){
                        u1=usernameEditTxt.getText().toString();
                        p1=passwordEditTxt.getText().toString();
                    }else if(u1!=""&&u2==""){
                        u2=usernameEditTxt.getText().toString();
                        p2=passwordEditTxt.getText().toString();
                    }else if(u1!=""&&u2!=""&&u3==""){
                        u3=usernameEditTxt.getText().toString();
                        p3=passwordEditTxt.getText().toString();
                    }
                }else{
                    Toast.makeText(LoginActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                }
            }

        });


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(usernameEditTxt.getText().toString().equals("admin") &&
                        passwordEditTxt.getText().toString().equals("admin") ||usernameEditTxt.getText().toString().equals(u1) && passwordEditTxt.getText().toString().equals(p1)||usernameEditTxt.getText().toString().equals(u2) && passwordEditTxt.getText().toString().equals(p2)||usernameEditTxt.getText().toString().equals(u3) && passwordEditTxt.getText().toString().equals(p3) ) {
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
        register();

    }
    public void register(){
        registerBtn.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        boolean isInserted = myAccDB.insertData(usernameEditTxt.getText().toString(),passwordEditTxt.getText().toString());

                        if(isInserted==true){
                            Toast.makeText(LoginActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
                            if(u1==""){
                                u1=usernameEditTxt.getText().toString();
                                p1=passwordEditTxt.getText().toString();
                            }else if(u1!=""&&u2==""){
                                u2=usernameEditTxt.getText().toString();
                                p2=passwordEditTxt.getText().toString();
                            }else if(u1!=""&&u2!=""&&u3==""){
                                u3=usernameEditTxt.getText().toString();
                                p3=passwordEditTxt.getText().toString();
                            }


                        }else{
                            Toast.makeText(LoginActivity.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}
