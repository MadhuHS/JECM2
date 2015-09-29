package com.jspiders.intents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_Activity extends Activity {

	TextView displaytextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_);
		
		displaytextview = (TextView) findViewById(R.id.textViewMessage);
		Intent i1 = getIntent();
		Bundle b1 = i1.getExtras();
		String recmessage = b1.get("Key1").toString();
		displaytextview.setText(recmessage);
		//i1.getStringExtra("key1");
		
		
		
	}


}
