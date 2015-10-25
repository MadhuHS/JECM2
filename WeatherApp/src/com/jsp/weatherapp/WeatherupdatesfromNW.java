package com.jsp.weatherapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.os.AsyncTask;
import android.util.Log;

public class WeatherupdatesfromNW extends AsyncTask<Void, Void, Void> {

	HttpURLConnection connection;
	URL weatherupdateurl;
	InputStream ins;
	InputStreamReader inputStreamReader;
	String stringURL = "http://api.openweathermap.org/data/2.5/weather?q=Bangalore,India&appid=bd82977b86bf27fb59a04b61b657fb6f";
	
	
	@Override
	protected Void doInBackground(Void... arg0) 
	{
		try 
		{
			weatherupdateurl = new URL(stringURL);
			connection = (HttpURLConnection) weatherupdateurl.openConnection();
			ins = connection.getInputStream();
			inputStreamReader = new InputStreamReader(ins);
			BufferedReader bufReader = new BufferedReader(inputStreamReader);
			StringBuffer buffer = new StringBuffer();
			String line = "";
			
			while((line = bufReader.readLine())!=null )
			{
				buffer.append(line+"\r\n");
			}
			
			String jsondata = buffer.toString();
			Log.d("JSON DATA FROM NET", jsondata);
			Weatherjsonparser.gettemprature(jsondata);
			
			
		} 
		 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
