package com.example.athreads;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button startbutton,displaybutton;
	TextView messagetextview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		startbutton = (Button) findViewById(R.id.button1);
		displaybutton = (Button) findViewById(R.id.button2);
		messagetextview = (TextView) findViewById(R.id.textView1);
		
		startbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
		          networkjob();
			}
		});
		
		displaybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				Toast.makeText(MainActivity.this,"DISPLAY BUTTON...",Toast.LENGTH_SHORT).show();
				
			}
		});
		
	}

	public void networkjob()
	{
            new Thread(new Runnable() 
           {
			
			@Override
			public void run() 
			{
				int i;
				
				for(Log.d("[DEBUG]","Starting long running task"),i =0;i<1000000000;i++)
					{
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}		
				
						messagetextview.setText("COMPLETED...");
					}
						
				
			}
		}).start();
	}

}
