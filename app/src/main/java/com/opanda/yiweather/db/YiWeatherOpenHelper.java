package com.opanda.yiweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by barry on 17/3/4.
 */

public class YiWeatherOpenHelper extends SQLiteOpenHelper {
    public YiWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * create table: Province
     */
    private static final String CREATE_PROVINCE = "create table rovince(" +
            "id int primary key autoincrement," +
            "province_name text," +
            "province_code text)";

    /**
     * create table: City
     */
    private static final String CREATE_CITY = "create table ity(" +
            "id int primary key autoincrement," +
            "city_name text," +
            "city_code text，" +
            "province_id integer)";

    /**
     * create table: County
     */
    private static final String CREATE_COUNTY = "create table ountry(" +
            "id int primary key autoincrement," +
            "county_name text," +
            "county_code text" +
            "city_id integer)";


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
