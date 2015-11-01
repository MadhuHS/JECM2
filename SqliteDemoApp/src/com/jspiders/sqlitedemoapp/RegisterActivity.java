package com.jspiders.sqlitedemoapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends Activity {

	EditText usernameedittext,passwordedittext;
	Button registerbutton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
		usernameedittext = (EditText) findViewById(R.id.editTextregisterusername);
		passwordedittext = (EditText) findViewById(R.id.editTextregisterpassword);
		
		registerbutton = (Button) findViewById(R.id.buttonregister);
	}

	 public void InsertusertoDb(View v)
	 {
		String entUsername = usernameedittext.getText().toString();
		String entPassword = passwordedittext.getText().toString();
		
		DBoperations dbo = new DBoperations(RegisterActivity.this);
		dbo.insetdata(dbo,entUsername,entPassword);
		
		
		
	 }
	

}
