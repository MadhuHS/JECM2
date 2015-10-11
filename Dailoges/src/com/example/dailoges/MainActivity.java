package com.example.dailoges;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	Button dialogbutton,loginbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		dialogbutton = (Button) findViewById(R.id.buttondialog);
		loginbutton = (Button) findViewById(R.id.buttonlogin);
	}

	public void createdialoge(View v1)
	{
		String[] colors = {"Red","Green","Blue"};
		final ArrayList al = new ArrayList();
		
		AlertDialog.Builder builder = new Builder(MainActivity.this);
		builder.setTitle("Choose the color");
		
		builder.setMultiChoiceItems(colors,null, new OnMultiChoiceClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which, boolean isChecked) 
			{
				if(which==1)
				{
					if(isChecked==true)
					{
						al.add(which);
					}
					
					else if(al.contains(which))
					{
						al.remove(which);
					}
				}
				
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
	
	
	public void login(View v)
	{
		View view;
		AlertDialog.Builder builder = new Builder(MainActivity.this);
		builder.setTitle("Login To app");
		
		LayoutInflater inflater = getLayoutInflater();
		view = inflater.inflate(R.layout.dialog,null);
		
		builder.setView(view);
		builder.setPositiveButton("Login",new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				
				

			
			}
		});
		
		builder.setNegativeButton("Cancel", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		AlertDialog dialog = builder.create();
		dialog.show();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
