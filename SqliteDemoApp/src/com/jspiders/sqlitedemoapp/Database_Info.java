package com.jspiders.sqlitedemoapp;

import android.provider.BaseColumns;

public class Database_Info 
{

	Database_Info ()
	{
		
	}
	
	
	public static abstract class Table_Info implements BaseColumns
	{
		public static final String DB_Name = "Registered USers";
		public static final String Table_Name = "User_Info";
		public static final String clUsername = "Username";
		public static final String clPassword = "Password";
	}
}
