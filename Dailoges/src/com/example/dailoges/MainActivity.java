package com.example.dailoges;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button dialogbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dialogbutton = (Button) findViewById(R.id.buttondialog);
	}

	public void createdialoge(View v1)
	{
		AlertDialog.Builder builder = new Builder(MainActivity.this);
		builder.setTitle("This is Alert!!");
		builder.setMessage("Do you want to exit ?");
		
		builder.setPositiveButton("Yes",new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) 
			{
				finish();
				
			}
		});
		
		builder.setNegativeButton("No",new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) 
			{
				arg0.dismiss();
				
			}
		});
		AlertDialog dialog = builder.create();
		dialog.show();
		
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) 
	{
		if(keyCode == KeyEvent.KEYCODE_BACK)
		{
			AlertDialog.Builder builder = new Builder(MainActivity.this);
			builder.setTitle("This is Alert!!");
			builder.setMessage("Do you want to exit ?");
			
			builder.setPositiveButton("Yes",new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) 
				{
					finish();
					
				}
			});
			
			builder.setNegativeButton("No",new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface arg0, int arg1) 
				{
					arg0.dismiss();
					
				}
			});
			
			AlertDialog dialog = builder.create();
			dialog.show();
		
		}
		
		return true;
		
	}
	
	
	
	
	
	
	
}
