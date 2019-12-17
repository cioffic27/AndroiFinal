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

    static final ObjectHelper.Booking objBooking[] = new ObjectHelper.Booking[150];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        final ImageView mapImgView = findViewById(R.id.mapImgView);
        mapImgView.setVisibility(View.GONE);

        final RadioButton radioBtn1 = findViewById(R.id.radioBtn1);
        final int[] radio1IsClicked = {1};
        final RadioButton radioBtn2 = findViewById(R.id.radioBtn2);
        final int[] radio2IsClicked = {1};
        final RadioButton radioBtn3 = findViewById(R.id.radioBtn3);
        final int[] radio3IsClicked = {1};
        final RadioButton radioBtn4 = findViewById(R.id.radioBtn4);
        final int[] radio4IsClicked = {1};

        final CheckBox chkBox1 = findViewById(R.id.chkBox1);
        final int[] chk1IsClicked = {1};
        final CheckBox chkBox2 = findViewById(R.id.chkBox2);
        final int[] chk2IsClicked = {1};
        final CheckBox chkBox3 = findViewById(R.id.chkBox3);
        final int[] chk3IsClicked = {1};
        final CheckBox chkBox4 = findViewById(R.id.chkBox4);
        final int[] chk4IsClicked = {1};
        final CheckBox chkBox5 = findViewById(R.id.chkBox5);
        final int[] chk5IsClicked = {1};
        final CheckBox chkBox6 = findViewById(R.id.chkBox6);
        final int[] chk6IsClicked = {1};

        //final Button busiCompMathBtn = findViewById(R.id.busiCompMathBtn);
        //final Button writingLangBtn = findViewById(R.id.writingLangBtn);
        //final Button bioSciBtn = findViewById(R.id.bioSciBtn);
        final Button mapBtn = findViewById(R.id.mapBtn);
        final Button closeMapBtn = findViewById(R.id.closeMapBtn);
        closeMapBtn.setVisibility(View.GONE);

        // Booking Variables
        //final String email = ""; //should use email from current student
        final EditText emailEditTxt = findViewById(R.id.emailEditTxt);

        //final String date = "";
        final TextView dateTxtView = findViewById(R.id.dateTxtView);

        //final String tutorType = "";

        final Button busiCompMathBtn = findViewById(R.id.busiCompMathBtn);
        final int[] busiCompMathIsClicked = {1};
        final Button writingLangBtn = findViewById(R.id.writingLangBtn);
        final int[] writingLangBtnIsClicked = {1};
        final Button bioSciBtn = findViewById(R.id.bioSciBtn);
        final int[] bioSciBtnIsClicked = {1};
        //final String typeOfClass = "";
        //final String time = "";
        //final String mapLocation = "";
        //final String description = "";
        final EditText descEditTxt = findViewById(R.id.descEditTxt);

        final int[] count = {0};
        //boolean clicked = false;







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

                count[0] = objBooking.length;
                objBooking[count[0]].emailBook = String.valueOf(emailEditTxt.getText());
                objBooking[count[0]].date = String.valueOf(dateTxtView.getText());
                // business Computer Maths and Map Location
                if ((busiCompMathIsClicked[0] % 2) == 0) {// number is even
                    objBooking[count[0]].tutorType = String.valueOf(busiCompMathBtn.getText());

                    if((radio1IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn1.getText());
                        objBooking[count[0]].mapLocation = "ZEN Building";
                        mapImgView.setImageResource(R.drawable.fdu_zenbuilding);
                        mapImgView.setBackgroundResource(R.drawable.fdu_zenbuilding);

                    }
                    else if((radio2IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn2.getText());
                        objBooking[count[0]].mapLocation = "ZEN Building";
                        mapImgView.setImageResource(R.drawable.fdu_zenbuilding);
                        mapImgView.setBackgroundResource(R.drawable.fdu_zenbuilding);
                    }
                    else if((radio3IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn3.getText());
                        objBooking[count[0]].mapLocation = "Monninger Center";
                        mapImgView.setImageResource(R.drawable.fdu_monninger);
                        mapImgView.setBackgroundResource(R.drawable.fdu_monninger);

                    }
                    else if((radio4IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn4.getText());
                        objBooking[count[0]].mapLocation = "Dreyfus Building";
                        mapImgView.setImageResource(R.drawable.fdu_dreyfus);
                        mapImgView.setBackgroundResource(R.drawable.fdu_dreyfus);

                    }
                }
                // Writing Language and Map Location
                else if ((writingLangBtnIsClicked[0] % 2) == 0){ // number is odd
                    objBooking[count[0]].tutorType = String.valueOf(writingLangBtn.getText());

                    if((radio1IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn1.getText());
                        objBooking[count[0]].mapLocation = "Student Center";
                        mapImgView.setImageResource(R.drawable.fdu_studentcenter);
                        mapImgView.setBackgroundResource(R.drawable.fdu_studentcenter);

                    }
                    else if((radio2IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn2.getText());
                        objBooking[count[0]].mapLocation = "Dreyfus Building";
                        mapImgView.setImageResource(R.drawable.fdu_dreyfus);
                        mapImgView.setBackgroundResource(R.drawable.fdu_dreyfus);

                    }
                    else if((radio3IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn3.getText());
                        objBooking[count[0]].mapLocation = "The Mansion";
                        mapImgView.setImageResource(R.drawable.fdu_mansion);
                        mapImgView.setBackgroundResource(R.drawable.fdu_mansion);

                    }
                    else if((radio4IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn4.getText());
                        objBooking[count[0]].mapLocation = "Monninger Center";
                        mapImgView.setImageResource(R.drawable.fdu_monninger);
                        mapImgView.setBackgroundResource(R.drawable.fdu_monninger);

                    }
                }
                // Biology Science and Map Location
                else if ((bioSciBtnIsClicked[0] % 2) == 0){ // number is odd
                    objBooking[count[0]].tutorType = String.valueOf(bioSciBtn.getText());

                    if((radio1IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn1.getText());
                        objBooking[count[0]].mapLocation = "Science Building";
                        mapImgView.setImageResource(R.drawable.fdu_sciencebuilding);
                        mapImgView.setBackgroundResource(R.drawable.fdu_sciencebuilding);
                    }
                    else if((radio2IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn2.getText());
                        objBooking[count[0]].mapLocation = "Science Building";
                        mapImgView.setImageResource(R.drawable.fdu_sciencebuilding);
                        mapImgView.setBackgroundResource(R.drawable.fdu_sciencebuilding);
                    }
                    else if((radio3IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn3.getText());
                        objBooking[count[0]].mapLocation = "Science Building";
                        mapImgView.setImageResource(R.drawable.fdu_sciencebuilding);
                        mapImgView.setBackgroundResource(R.drawable.fdu_sciencebuilding);
                    }
                    else if((radio4IsClicked[0] % 2) == 0){
                        objBooking[count[0]].typeOfClass = String.valueOf(radioBtn4.getText());
                        objBooking[count[0]].mapLocation = "Monninger Buidling";
                        mapImgView.setImageResource(R.drawable.fdu_monninger);
                        mapImgView.setBackgroundResource(R.drawable.fdu_monninger);
                    }
                }
                // time
                if ((chk1IsClicked[0] % 2) == 0){
                    objBooking[count[0]].time = String.valueOf(chkBox1.getText());
                }
                else if ((chk2IsClicked[0] % 2) == 0){
                    objBooking[count[0]].time = String.valueOf(chkBox2.getText());
                }
                else if ((chk3IsClicked[0] % 2) == 0){
                    objBooking[count[0]].time = String.valueOf(chkBox3.getText());
                }
                else if ((chk4IsClicked[0] % 2) == 0){
                    objBooking[count[0]].time = String.valueOf(chkBox4.getText());
                }
                else if ((chk5IsClicked[0] % 2) == 0){
                    objBooking[count[0]].time = String.valueOf(chkBox5.getText());
                }
                else if ((chk6IsClicked[0] % 2) == 0) {
                    objBooking[count[0]].time = String.valueOf(chkBox6.getText());
                }
                // description
                objBooking[count[0]].description = String.valueOf(descEditTxt.getText());

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

                writingLangBtnIsClicked[0] = 2;
                busiCompMathIsClicked[0] = 3;
                bioSciBtnIsClicked[0] = 3;
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

                writingLangBtnIsClicked[0] = 3;
                busiCompMathIsClicked[0] = 2;
                bioSciBtnIsClicked[0] = 3;
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

                writingLangBtnIsClicked[0] = 3;
                busiCompMathIsClicked[0] = 3;
                bioSciBtnIsClicked[0] = 2;
            }
        });

        // When selected others are deselected
        radioBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);

                radio1IsClicked[0] = 2;
                radio2IsClicked[0] = 3;
                radio3IsClicked[0] = 3;
                radio4IsClicked[0] = 3;
            }
        });
        radioBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
                radioBtn3.setChecked(false);
                radioBtn4.setChecked(false);

                radio1IsClicked[0] = 3;
                radio2IsClicked[0] = 2;
                radio3IsClicked[0] = 3;
                radio4IsClicked[0] = 3;
            }
        });
        radioBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn4.setChecked(false);

                radio1IsClicked[0] = 3;
                radio2IsClicked[0] = 3;
                radio3IsClicked[0] = 2;
                radio4IsClicked[0] = 3;
            }
        });
        radioBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioBtn1.setChecked(false);
                radioBtn2.setChecked(false);
                radioBtn3.setChecked(false);

                radio1IsClicked[0] = 3;
                radio2IsClicked[0] = 3;
                radio3IsClicked[0] = 3;
                radio4IsClicked[0] = 2;
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

                chk1IsClicked[0] = 2;
                chk2IsClicked[0] = 3;
                chk3IsClicked[0] = 3;
                chk4IsClicked[0] = 3;
                chk5IsClicked[0] = 3;
                chk6IsClicked[0] = 3;
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

                chk1IsClicked[0] = 3;
                chk2IsClicked[0] = 2;
                chk3IsClicked[0] = 3;
                chk4IsClicked[0] = 3;
                chk5IsClicked[0] = 3;
                chk6IsClicked[0] = 3;
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

                chk1IsClicked[0] = 3;
                chk2IsClicked[0] = 3;
                chk3IsClicked[0] = 2;
                chk4IsClicked[0] = 3;
                chk5IsClicked[0] = 3;
                chk6IsClicked[0] = 3;
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

                chk1IsClicked[0] = 3;
                chk2IsClicked[0] = 3;
                chk3IsClicked[0] = 3;
                chk4IsClicked[0] = 2;
                chk5IsClicked[0] = 3;
                chk6IsClicked[0] = 3;
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

                chk1IsClicked[0] = 3;
                chk2IsClicked[0] = 3;
                chk3IsClicked[0] = 3;
                chk4IsClicked[0] = 3;
                chk5IsClicked[0] = 2;
                chk6IsClicked[0] = 3;
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

                chk1IsClicked[0] = 3;
                chk2IsClicked[0] = 3;
                chk3IsClicked[0] = 3;
                chk4IsClicked[0] = 3;
                chk5IsClicked[0] = 3;
                chk6IsClicked[0] = 2;
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
