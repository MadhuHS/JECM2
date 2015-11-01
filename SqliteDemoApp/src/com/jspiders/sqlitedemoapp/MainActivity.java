package com.jspiders.sqlitedemoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button registerbutton,loginbutton,updateprofilebutton,deleteprofilebutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		registerbutton = (Button) findViewById(R.id.buttonregister);
		loginbutton = (Button) findViewById(R.id.buttonlogin);
		updateprofilebutton = (Button) findViewById(R.id.buttonupdateprofile);
		deleteprofilebutton = (Button) findViewById(R.id.buttondeleteprofile);
	}

	
	public void registerActivity(View v)
	{
		Intent registerintent = new Intent(MainActivity.this,RegisterActivity.class);
		startActivity(registerintent);
	}
	
	public void loginActivity(View v)
	{
		Intent loginintent = new Intent(MainActivity.this,LoginActivity.class);
		startActivity(loginintent);
	}
	
	public void updateprofileActivity(View v)
	{
		
	}
	
	
	public void deleteprofileActivity(View v)
	{
		
	}
	
	
	
	
}
