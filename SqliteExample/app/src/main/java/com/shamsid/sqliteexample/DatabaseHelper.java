package com.shamsid.sqliteexample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {

  public static DatabaseHelper instance = null;

  public DatabaseHelper (Context context, String name, SQLiteDatabase.CursorFactory factory,
      int version) {
    super (context, name, factory, version);
  }

  synchronized   static DatabaseHelper getInstance(Context context){
    if(instance==null){
      instance = new DatabaseHelper (context,Constants.DATABASE_NAME,null,Constants.DATABASE_VERSION);
    }
    return instance;
  }



  @Override public void onCreate (SQLiteDatabase db) {
    db.execSQL ("CREATE TABLE " +
        Constants.TABLE_NAME + " ( " +
        Constants.EMPLOYEE_ID + " INTEGER PRIMARY KEY "+
        Constants.EMPLOYEE_NAME+" TEXT " +
        Constants.EMPLOYEE_MOBILE_NO +" INTEGER "+" )");
  }

  @Override public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {
      throw new RuntimeException ("Upgrage method not implemented");
  }
}
