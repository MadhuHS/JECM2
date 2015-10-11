package com.example.notify_1;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button notifybutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		notifybutton = (Button) findViewById(R.id.button1);
		
		notifybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this);	
				builder.setSmallIcon(R.drawable.ic_launcher);
				builder.setContentTitle("My Notify");
			    builder.setContentText("1 new message");
			    
			   Notification notification =  builder.build();
			   NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
			   
			   Intent intent = new Intent(Intent.ACTION_DIAL);
			   intent.setData(Uri.parse("tel:"+"9868644555"));
			   
			   PendingIntent pending = PendingIntent.getActivity(MainActivity.this,1,intent,1);
			   builder.addAction(R.drawable.ic_launcher, "Call",null);
			   
			   nm.notify(1,notification);
				
			}
		});
	}
}
