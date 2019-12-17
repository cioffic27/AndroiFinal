package com.example.project_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CreateAccountActivity extends AppCompatActivity {
    AccountDatabaseHelper myAccDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        final TextView nameTxt = (TextView) findViewById(R.id.nameTxt);
        final TextView lastNameTxt = (TextView) findViewById(R.id.lastNameTxt);
        final TextView yearTxt = (TextView) findViewById(R.id.yearTxt);
        final TextView majorTxt = (TextView) findViewById(R.id.majorTxt);
        final TextView emailTxt = (TextView) findViewById(R.id.emailTxt);
        final TextView usernameTxt = (TextView) findViewById(R.id.usernameTxt);
        final TextView passwordTxt = (TextView) findViewById(R.id.passwordTxt);


        final ObjectHelper.Account objAccount[] = new ObjectHelper.Account[100];
        //default entry
        objAccount[0].emailAcc = "maxmat@student.fdu.edu";
        objAccount[0].password = "admin";
        objAccount[0].lastName = "Matuson";
        objAccount[0].name = "Max";
        objAccount[0].major = "Computer Science";
        objAccount[0].username = "admin";
        objAccount[0].year = "Senoir";

        final int accountCount = objAccount.length;


        Button cancelBtn = findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });

        Button createBtn = findViewById(R.id.createBtn);
        createBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //newAccount = new Account(emailTxt.getText(), usernameTxt.getText(), passwordTxt.getText(), yearTxt.getText(), majorTxt.getText(), nameTxt.getText(), lastNameTxt.getText());
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
