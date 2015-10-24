package com.example.asyntask_demo1;

import android.app.NotificationManager;
import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.app.NotificationCompat;
import android.widget.Button;
import android.widget.TextView;

public class NetworkJob extends AsyncTask<Void,Integer,Void> 
{

	Button downloadbutton;
	TextView statustextview;
	Context context;
	NotificationCompat.Builder builder;
	NotificationManager nm;
	
	NetworkJob(Button downloadbutton,TextView statustextview,Context context)
	{
		this.downloadbutton = downloadbutton;
		this.statustextview = statustextview;
		this.context = context;
	}
	
	
	@Override
	protected void onPreExecute() 
	{super.onPreExecute();
	
	 builder = new NotificationCompat.Builder(context);
	 builder.setContentTitle("Downloading file");
	 builder.setSmallIcon(R.drawable.ic_launcher);
	 builder.setProgress(100,0,false);
	 nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
	 nm.notify(1,builder.build());
	 downloadbutton.setEnabled(false);
	 		
	}
	
	
	@Override
	protected Void doInBackground(Void... arg0) 
	{
		for(int i = 0 ; i<=100;i++)
		{
			try {
				Thread.sleep(200);
				publishProgress(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	protected void onProgressUpdate(Integer... values) {
		super.onProgressUpdate(values);
		builder.setProgress(100,values[0],false);
		builder.setContentText(values[0].toString()+"%");
		nm.notify(1,builder.build());
		//statustextview.setText(values[0].toString());
	}
	
	
	@Override
	protected void onPostExecute(Void result) {
		// TODO Auto-generated method stub
		super.onPostExecute(result);
		downloadbutton.setEnabled(true);
		statustextview.setText("Download completed...");
		builder.setProgress(100,0,false);
		builder.setContentText("Download completed..");
		nm.notify(1,builder.build());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
