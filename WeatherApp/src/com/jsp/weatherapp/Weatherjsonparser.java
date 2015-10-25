package com.jsp.weatherapp;

import org.json.JSONException;
import org.json.JSONObject;

import android.util.Log;

public class Weatherjsonparser 

{
   public static void gettemprature(String jsondata)
   {
	  try 
	  {
		JSONObject rootobject = new JSONObject(jsondata);
		JSONObject mainobject = rootobject.getJSONObject("main");
		Double temp = mainobject.getDouble("temp");
		Log.d("This is current temp", temp.toString());
		
		
		
	} catch (JSONException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
