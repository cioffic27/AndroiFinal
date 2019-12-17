package com.example.project_help;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class BookActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    BookingDatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db=new BookingDatabaseHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        final ImageView mapImgView = findViewById(R.id.mapImgView);

        final RadioButton radioBtn1 = findViewById(R.id.radioBtn1);
        final RadioButton radioBtn2 = findViewById(R.id.radioBtn2);
        final RadioButton radioBtn3 = findViewById(R.id.radioBtn3);
        final RadioButton radioBtn4 = findViewById(R.id.radioBtn4);

        final CheckBox chkBox1 = findViewById(R.id.chkBox1);
        final CheckBox chkBox2 = findViewById(R.id.chkBox2);
        final CheckBox chkBox3 = findViewById(R.id.chkBox3);
        final CheckBox chkBox4 = findViewById(R.id.chkBox4);
        final CheckBox chkBox5 = findViewById(R.id.chkBox5);
        final CheckBox chkBox6 = findViewById(R.id.chkBox6);

        final Button busiCompMathBtn = findViewById(R.id.busiCompMathBtn);
        final Button writingLangBtn = findViewById(R.id.writingLangBtn);
        final Button bioSciBtn = findViewById(R.id.bioSciBtn);
        final Button mapBtn = findViewById(R.id.mapBtn);
        final Button closeMapBtn = findViewById(R.id.closeMapBtn);

        // Booking Variables
        final String email = "";
        final String date = "";
        final String tutorType = "";
        final String typeOfClass = "";
        final String time = "";
        final String mapLocation = "";
        final String description = "";

        EditText Email = (EditText) findViewById(R.id.emailEditTxt);
        TextView Date = (TextView) findViewById(R.id.dateTxtView);
        EditText classType = (EditText) findViewById(R.id.emailEditTxt);
        EditText TutorType = (EditText) findViewById(R.id.emailEditTxt);
        EditText MapLocation = (EditText) findViewById(R.id.emailEditTxt);
        EditText Time = (EditText) findViewById(R.id.emailEditTxt);
        EditText Description = (EditText) findViewById(R.id.emailEditTxt);
        Button btnBook= (Button) findViewById(R.id.bookBtn);

        // Back Button Takes you back to main menu
        Button backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button bookBtn = findViewById(R.id.bookBtn);
        bookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Date Picker Button opens the calender allowing user to select a date
        Button datePickBtn = (Button) findViewById(R.id.datePickBtn);
        datePickBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment datePicker = new DatePickerFragment();
                datePicker.show(getSupportFragmentManager(), "date picker");
            }
        });

        // Writing Language specifies the type of tutor the user is looking
        // for and help specify further by changing radio buttons
        writingLangBtn.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                writingLangBtn.setBackgroundColor(Color.parseColor("#FFF2CF41"));
                busiCompMathBtn.setBackgroundColor(Color.parseColor("#FFD8D9D9"));
                bioSciBtn.setBackgroundColor(Color.parseColor("#FFD8D9D9"));
                //change name
                radioBtn1.setText("Literature");
                radioBtn2.setText("Language");
                radioBtn3.setText("History");
                radioBtn4.setText("Essay Writing");
                //uncheck
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);
            }
        });
        // Business/Computer/Math specifies the type of tutor the user is looking
        // for and help specify further by changing radio buttons
        busiCompMathBtn.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                busiCompMathBtn.setBackgroundColor(Color.parseColor("#FFF2CF41"));
                writingLangBtn.setBackgroundColor(Color.parseColor("#FFD8D9D9"));
                bioSciBtn.setBackgroundColor(Color.parseColor("#FFD8D9D9"));
                //change name
                radioBtn1.setText("Computer Science");
                radioBtn2.setText("Maths");
                radioBtn3.setText("Finance/Accounting");
                radioBtn4.setText("MIS");
                //uncheck
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);
            }
        });
        // Biology/Science specifies the type of tutor the user is looking
        // for and help specify further by changing radio buttons
        bioSciBtn.setOnClickListener(new View.OnClickListener(){
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                bioSciBtn.setBackgroundColor(Color.parseColor("#FFF2CF41"));
                writingLangBtn.setBackgroundColor(Color.parseColor("#FFD8D9D9"));
                busiCompMathBtn.setBackgroundColor(Color.parseColor("#FFD8D9D9"));
                //change name
                radioBtn1.setText("Biology");
                radioBtn2.setText("Physics");
                radioBtn3.setText("Chemistry");
                radioBtn4.setText("LAB Report");
                //uncheck
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);
            }
        });

        // When selected others are deselected
        radioBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);
            }
        });
        radioBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);
            }
        });
        radioBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn4.setChecked(false);
            }
        });
        radioBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);
            }
        });

        // When selected others get unchecked
        chkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkBox2.setChecked(false);
                chkBox3.setChecked(false);
                chkBox4.setChecked(false);
                chkBox5.setChecked(false);
                chkBox6.setChecked(false);
            }
        });
        chkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkBox1.setChecked(false);
                chkBox3.setChecked(false);
                chkBox4.setChecked(false);
                chkBox5.setChecked(false);
                chkBox6.setChecked(false);
            }
        });
        chkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkBox1.setChecked(false);
                chkBox2.setChecked(false);
                chkBox4.setChecked(false);
                chkBox5.setChecked(false);
                chkBox6.setChecked(false);
            }
        });
        chkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkBox1.setChecked(false);
                chkBox2.setChecked(false);
                chkBox3.setChecked(false);
                chkBox5.setChecked(false);
                chkBox6.setChecked(false);
            }
        });
        chkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkBox1.setChecked(false);
                chkBox2.setChecked(false);
                chkBox3.setChecked(false);
                chkBox4.setChecked(false);
                chkBox6.setChecked(false);
            }
        });
        chkBox6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chkBox1.setChecked(false);
                chkBox2.setChecked(false);
                chkBox3.setChecked(false);
                chkBox4.setChecked(false);
                chkBox5.setChecked(false);
            }
        });

        //When Selected will show a picture of location of FDU map
        mapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if radio button has not been selected then show error message
                // another if statement for which map image to show
                mapImgView.setVisibility(View.VISIBLE);
                busiCompMathBtn.setVisibility(View.INVISIBLE);
                writingLangBtn.setVisibility(View.INVISIBLE);
                bioSciBtn.setVisibility(View.INVISIBLE);
                closeMapBtn.setVisibility(View.VISIBLE);
                mapBtn.setVisibility(View.GONE);
            }
        });

        closeMapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mapImgView.setVisibility(View.INVISIBLE);
                busiCompMathBtn.setVisibility(View.VISIBLE);
                writingLangBtn.setVisibility(View.VISIBLE);
                bioSciBtn.setVisibility(View.VISIBLE);
                mapBtn.setVisibility(View.VISIBLE);
                closeMapBtn.setVisibility(View.GONE);
            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month);
        c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        String currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.getTime());

        TextView dateTxtView = (TextView) findViewById(R.id.dateTxtView);
        dateTxtView.setText(currentDateString);
    }



}
