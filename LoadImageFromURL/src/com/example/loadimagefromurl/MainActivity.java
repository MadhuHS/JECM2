package com.example.loadimagefromurl;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends Activity {

	ImageView imagefromnet;
	String[] imgurl ={"http://hdwidescreenwallpapers.com/wp-content/uploads/2013/10/wallpapers-for-mobile.jpg"};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imagefromnet  =(ImageView) findViewById(R.id.imageView1);
		
		
		ConnectivityManager cmManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
		NetworkInfo ninfo =  cmManager.getActiveNetworkInfo();
		if(ninfo.isConnected())
		{
			NetworkImageloader imageloader = new NetworkImageloader(imagefromnet);
			imageloader.execute(imgurl);
		}
		else
		{
			
		}
		
		
		
		
		
		
	}


}
