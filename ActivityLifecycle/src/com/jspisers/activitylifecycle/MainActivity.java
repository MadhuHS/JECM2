package com.jspisers.activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
   
	TextView statetextview;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        statetextview = (TextView) findViewById(R.id.textViewstate);
        
        statetextview.setText("Inside oncreate() method");
        Toast.makeText(MainActivity.this,"Inside oncreate() method",Toast.LENGTH_SHORT).show();
        
    }
    
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		statetextview.setText("Inside onstart() method");
        Toast.makeText(MainActivity.this,"Inside onstart() method",Toast.LENGTH_SHORT).show();
		
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		statetextview.setText("Inside onresume() method");
        Toast.makeText(MainActivity.this,"Inside onresume() method",Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		statetextview.setText("Inside onpause() method");
        Toast.makeText(MainActivity.this,"Inside onpause() method",Toast.LENGTH_SHORT).show();
	}
	
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		statetextview.setText("Inside onstop() method");
        Toast.makeText(MainActivity.this,"Inside onstop() method",Toast.LENGTH_SHORT).show();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		
		statetextview.setText("Inside ondestroy() method");
        Toast.makeText(MainActivity.this,"Inside ondestroy() method",Toast.LENGTH_SHORT).show();
	}
    
}
