package com.jsp.service_lifecycle;

import android.app.IntentService;
import android.content.Intent;

public class InService extends IntentService {

	public InService(String name) {
		super(name="WORKER THREAD");
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onHandleIntent(Intent arg0) 
	{

	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	
	

}
