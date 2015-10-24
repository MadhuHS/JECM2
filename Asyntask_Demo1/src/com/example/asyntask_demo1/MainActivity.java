package com.example.asyntask_demo1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button downloadbutton;
	TextView statustextview;
	Context context = MainActivity.this;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		downloadbutton = (Button) findViewById(R.id.button1);
		statustextview = (TextView) findViewById(R.id.textView1);
		
		downloadbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
			
				NetworkJob nj = new NetworkJob(downloadbutton,statustextview,context);
				nj.execute();
			}
		});
		
		
		
	}


}
