package com.jsp.weatherapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button refreshbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		refreshbutton = (Button) findViewById(R.id.button1);
		
		refreshbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				WeatherupdatesfromNW nw = new WeatherupdatesfromNW();
				nw.execute();
				
			}
		});
	}


}
