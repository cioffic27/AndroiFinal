package com.example.project_help;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class BookingDatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE1_NAME = "Booking.db";
    public static final String DB1TABLE_NAME = "Booking_table";
    public static final String DB1COL_1 = "EMAIL";
    public static final String DB1COL_2 = "DATE";
    public static final String DB1COL_3 = "TUTORTYPE";
    public static final String DB1COL_4 = "TYPEOFTUTOR";
    public static final String DB1COL_5 = "TIME";
    public static final String DB1COL_6 = "MAPLOCATION";
    public static final String DB1COL_7 = "DESCRIPTION";


    public BookingDatabaseHelper(Context context) {
        super(context, DATABASE1_NAME, null, 1);
        //SQLiteDatabase db this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DB1TABLE_NAME +" (EMAIL TEXT PRIMARY KEY,DATE TEXT,TUTORTYPE TEXT,TYPEOFTUTOR TEXT, TIME TEXT, MAPLOCATION TEXT, DESCRIPTION TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+DB1TABLE_NAME);
        onCreate(db);
    }
}
