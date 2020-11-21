package com.example.root.myapplication;

/**
 * Created by root on 10/10/17.
 */

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Home on 12/30/2015.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    final static String DATABASE_NAME = "profile.db";
    final static int DATABASE_VERSION = 2;

    String tablecreate = "create table profile(id integer primary key autoincrement,fname text not null,lname text not null,email text not null,phone text not null,pass text not null);";
    String tablecreate1 = "create table bill(id integer primary key autoincrement,name text not null,price integer not null);";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(tablecreate);
        db.execSQL(tablecreate1);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS profile");
        db.execSQL("DROP TABLE IF EXISTS bill");
        onCreate(db);
    }

    void insertInfoProfile(Profile profile) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("fname", profile.getFname());
        values.put("lname", profile.getLname());
        values.put("email", profile.getEmail());
        values.put("phone", profile.getPhone());
        values.put("pass", profile.getPass());

        db.insert("profile", null, values);
        db.close();
    }
    void insertInfoBill(Bill bill) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put("name", bill.getname());
        values.put("price", bill.getPrice());


        db.insert("bill", null, values);
        db.close();
    }
    public void deleteTitle()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from bill");
    }

    public int searchpass(String fname, String pass) {

        int b = 0;

        String sname, spass;
        SQLiteDatabase db = this.getWritableDatabase();
        String selectQuery = "select fname,pass from profile";
        Cursor cursor = db.rawQuery(selectQuery, null);
        int c = cursor.getCount();
        if (c > 0) {
            if (cursor.moveToFirst()) {
                do {
                    sname = cursor.getString(0);
                    spass = cursor.getString(1);

                    if (fname.equals(sname)) {
                        if (spass.equals(pass)) {
                            b = 1;
                            break;
                        } else {
                            b = 2;
                            break;
                        }
                    }
                }
                while (cursor.moveToNext());
            }
        } else {
            b = 3;
        }

        return b;
    }

}


