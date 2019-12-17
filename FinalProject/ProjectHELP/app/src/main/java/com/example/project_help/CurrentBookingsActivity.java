package com.example.project_help;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class CurrentBookingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_bookings);

        Button BackBtn = findViewById(R.id.BackBtn);
        BackBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        Button MapBtn = findViewById(R.id.MapBtn);
        MapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });

        ListView BookingListView = (ListView) findViewById(R.id.BookingListView);

    }


    // MUST EDIT: getCount to number of bookings made
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.custom_layout, null);
            TextView dateTime = (TextView) findViewById(R.id.dateTimeLabel);
            TextView tutor = (TextView) findViewById(R.id.tutorLabel);
            TextView maptxt = (TextView) findViewById(R.id.mapLabel);
            TextView descrip = (TextView) findViewById(R.id.descripLabel);

            dateTime.setText(BookActivity.objBooking[position].date.toString() + ", " + BookActivity.objBooking[position].time.toString());

            return null;
        }
    }
}
