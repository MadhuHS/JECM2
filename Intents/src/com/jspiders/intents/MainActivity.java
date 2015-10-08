package com.jspiders.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts.Intents;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	EditText messageedittext;
	Button sendbutton;
	String message;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		messageedittext = (EditText) findViewById(R.id.editTextmessage);
		sendbutton = (Button) findViewById(R.id.buttonsend);
		
		sendbutton.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				message = messageedittext.getText().toString();
				//Intent intent = new Intent(packageContext, cls);
				Intent intent = new Intent(MainActivity.this,Second_Activity.class);
				intent.putExtra("Key1",message);
	
				startActivity(intent);
			}
		});
	}



}
