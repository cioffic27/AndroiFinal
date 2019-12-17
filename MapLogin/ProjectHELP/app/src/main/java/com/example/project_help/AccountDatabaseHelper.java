package com.example.project_help;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static com.example.project_help.BookingDatabaseHelper.DB1COL_1;
import static com.example.project_help.BookingDatabaseHelper.DB1COL_2;
import static com.example.project_help.BookingDatabaseHelper.DB1COL_3;
import static com.example.project_help.BookingDatabaseHelper.DB1COL_4;
import static com.example.project_help.BookingDatabaseHelper.DB1COL_5;
import static com.example.project_help.BookingDatabaseHelper.DB1COL_6;
import static com.example.project_help.BookingDatabaseHelper.DB1COL_7;

public class AccountDatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE2_NAME = "Account.db";
    public static final String DB2TABLE_NAME = "Account_table";
    public static final String DB2COL_1 = "EMAIL";
    public static final String DB2COL_2 = "USERNAME";
    public static final String DB2COL_3 = "PASSWORD";
    public static final String DB2COL_4 = "YEAR";
    public static final String DB2COL_5 = "MAJOR";
    public static final String DB2COL_6 = "NAME";
    public static final String DB2COL_7 = "LASTNAME";

    public AccountDatabaseHelper(Context context) {
        super(context, DATABASE2_NAME, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + DB2TABLE_NAME +" (EMAIL TEXT PRIMARY KEY,USERNAME TEXT,PASSWORD TEXT,YEAR TEXT, MAJOR TEXT, NAME TEXT, LASTNAME TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+DB2TABLE_NAME);
        onCreate(db);
    }
    public boolean insertData(String userName,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        //contentValues.put(DB1COL_1,email);
        contentValues.put(DB2COL_2,userName);
        contentValues.put(DB2COL_3,password);
       // contentValues.put(DB1COL_4,typeOfTutor);
        //contentValues.put(DB1COL_5,time);
       // contentValues.put(DB1COL_6,mapLocation);
        //contentValues.put(DB1COL_7,description);
        db.insert(DB2TABLE_NAME,null,contentValues);
        long result =db.insert(DB2TABLE_NAME,null,contentValues);
        if(result==-1){
            return false;
        }else{
            return true;
        }
    }

    public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+DB2TABLE_NAME,null);
return res;
    }
}
