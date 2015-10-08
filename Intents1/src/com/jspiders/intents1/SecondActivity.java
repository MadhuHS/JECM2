package com.jspiders.intents1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {

	EditText inputedittext;
	Button sendbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		
		inputedittext = (EditText) findViewById(R.id.editTextinput);
		sendbutton  = (Button) findViewById(R.id.buttonsend);
		
		sendbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String input = inputedittext.getText().toString();
				//Intent recint = getIntent();
				Intent i1 = new Intent();
				i1.putExtra("Key1", input);
				setResult(RESULT_CANCELED,i1);
				finish();
				
								
			}
		});
		
		
	}


}
