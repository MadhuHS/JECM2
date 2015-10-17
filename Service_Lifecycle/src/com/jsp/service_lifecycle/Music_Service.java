package com.jsp.service_lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class Music_Service extends Service {

	@Override
	public void onCreate() {
		super.onCreate();
		Toast.makeText(Music_Service.this,"Inside onCreate()",Toast.LENGTH_SHORT).show();
		
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Toast.makeText(Music_Service.this,"Inside onStartcommand()",Toast.LENGTH_SHORT).show();
		return super.onStartCommand(intent, flags, startId);
	}
	
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		Toast.makeText(Music_Service.this,"Inside onDestroy()",Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
