package com.jspiders.intents1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView messagetextview;
	Button startbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		messagetextview = (TextView) findViewById(R.id.textViewmsg);
		startbutton = (Button) findViewById(R.id.buttonstart);
		
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("Key1",2);
				startActivityForResult(intent,1);
			}
		});
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode==RESULT_OK)
		{
			 Bundle b1= data.getExtras();
			String result =  b1.getString("Key1");
			messagetextview.setText(result);
		}
		else if (resultCode==RESULT_CANCELED)
		{
			messagetextview.setText("ERROR");
		}
		
	}


}
