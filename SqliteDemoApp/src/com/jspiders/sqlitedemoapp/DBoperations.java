package com.jspiders.sqlitedemoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.jspiders.sqlitedemoapp.Database_Info.Table_Info;

public class DBoperations extends SQLiteOpenHelper {

	
	String qryCreatetable = "CREATE table "+Table_Info.Table_Name+"("+Table_Info.clUsername+" TEXT, "+Table_Info.clPassword+" TEXT"+");";
	
	public DBoperations(Context context) 
	{
		super(context,Table_Info.DB_Name,null,1);
		Log.d("DB Creation", "Done.....");

	}

	@Override
	public void onCreate(SQLiteDatabase sqldb)
	{
		sqldb.execSQL(qryCreatetable);
		Log.d("Table Creation", "Done.....");

	}

	public void insetdata(DBoperations db,String entUsername,String entPassword)
	{
		SQLiteDatabase sqldb = getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put("username", entUsername);
		values.put("Password",entPassword);
		sqldb.insert(Table_Info.Table_Name, null, values);
		Log.d("Row inserted", "Done.....");

	}
	
	
	
	
	
	
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}

}
