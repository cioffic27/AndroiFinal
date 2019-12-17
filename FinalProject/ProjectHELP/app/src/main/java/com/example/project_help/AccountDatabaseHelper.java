package com.example.project_help;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

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
}
