package com.jspiders.sqlitedemoapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

	EditText usernameEditText,passwordEditText;
	Button loginbutton;
	
	String entUsername,entPassword;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		usernameEditText = (EditText) findViewById(R.id.editTextloginpgusername);
		passwordEditText = (EditText) findViewById(R.id.editTextregisterpassword);
		loginbutton = (Button) findViewById(R.id.buttonloginpglogin);
	}
	
	public void loginToHomeActivity(View v)
	{
		
	}
	

	

}
