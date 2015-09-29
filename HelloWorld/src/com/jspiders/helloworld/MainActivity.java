package com.jspiders.helloworld;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

    String stUsername = "User1";
    String stPassword = "1234";
    
    String entUsername;
    String entPassword;
    
    Button loginbutton,cancelbutton,signupbutton;
	EditText usernameedittext,passwordedittext;
	CheckBox checkboxrmbrpwd;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        //Getting the id or reference for the Views from R.java class
        loginbutton = (Button) findViewById(R.id.buttonlogin);
        cancelbutton = (Button) findViewById(R.id.cancelbutton);
        signupbutton = (Button) findViewById(R.id.buttonsignup);
        usernameedittext = (EditText) findViewById(R.id.editTextusername);
        passwordedittext = (EditText) findViewById(R.id.editTextpassword);  
        checkboxrmbrpwd = (CheckBox) findViewById(R.id.checkBoxremeberpwd);
       
        loginbutton.setOnClickListener(this);
        cancelbutton.setOnClickListener(this);
        
        checkboxrmbrpwd.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View view) {
    			
    			if(((CheckBox)view).isChecked())
    			{
    				Toast.makeText(MainActivity.this, "state changed to checked", Toast.LENGTH_SHORT).show();
    			
    			}
    			
    		}
    	});
        
    }

	//providing 
	@Override
	public void onClick(View v) 
	{
		switch (v.getId()) {
		
		case R.id.buttonlogin:
			
			entUsername = usernameedittext.getText().toString();
		     entPassword = passwordedittext.getText().toString();

			 
			 if (stUsername.equalsIgnoreCase(entUsername)&& stPassword.equals(entPassword))
	     	{
	     		Log.d("[DEBUG]","Login Successfull");
	     		Toast.makeText(this,"Login Successfull",Toast.LENGTH_SHORT).show();
	     	}
	     	
	     	else
	     	{
	     		Log.d("[DEBUG]","Inavlid username or password");
	     		
	     	}
			
			break;

		case R.id.cancelbutton: 
			
			usernameedittext.setText("");
			passwordedittext.setText("");
			
			
			break;
		
		
		default:
			break;
		}
	
		signupbutton.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v) 
			{
				Log.d("[DEBUG]","Clicked on Signup Button");
				
			}
		});	
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) 
	{
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
		
		if (newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
		{
			Toast.makeText(MainActivity.this, " changed to landscape", Toast.LENGTH_SHORT).show();
			setContentView(R.layout.landscape_mode);
		}
		
		else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
		{
			
			Toast.makeText(MainActivity.this, " changed to portrate", Toast.LENGTH_SHORT).show();
			setContentView(R.layout.activity_main);
		}
	}

    
}
