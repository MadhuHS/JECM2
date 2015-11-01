package com.example.loadimagefromurl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

public class NetworkImageloader extends AsyncTask<String,Void,Void> {

	ImageView imgfromnet;
	URL loadingurl;
	InputStream ins;
	Bitmap newimage;
	HttpURLConnection connection;
	
	NetworkImageloader(ImageView imgfromnet)
	{
		this.imgfromnet = imgfromnet;
	}
	
	@Override
	protected void onPreExecute() 
	{

		super.onPreExecute();
	}
	
	@Override
	protected Void doInBackground(String... imgurl) 
	{
		
		try 
		{
		    loadingurl = new URL(imgurl[0]);
		} 
		
		catch (MalformedURLException e) 
		
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection = (HttpURLConnection) loadingurl.openConnection();
			ins = connection.getInputStream();
			newimage = BitmapFactory.decodeStream(ins);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	@Override
	protected void onPostExecute(Void result) 
	{
		super.onPostExecute(result);
		imgfromnet.setImageBitmap(newimage);
		connection.disconnect();
	}

}
