package com.jspiders.facebook;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Configuration;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   @Override
public void onConfigurationChanged(Configuration newConfig) {
	   
	super.onConfigurationChanged(newConfig);
	
	if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE )
	{
        Toast.makeText(MainActivity.this, "Chnaged to Landscape mode",Toast.LENGTH_SHORT).show();
		setContentView(R.layout.landscape_mode);

	}
	
	else if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT)
	{
		Toast.makeText(MainActivity.this, "Chnaged to PORTRAIT mode",Toast.LENGTH_SHORT).show();
		setContentView(R.layout.activity_main);

	}
	
	
}
    
}
