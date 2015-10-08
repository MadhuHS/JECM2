package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView listviewphones;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final String[] phones = {"HTC","LENOVO","SONY","MOTO","MI","SAMSUNG","MICROMAX","KARBON"};
		
		listviewphones = (ListView) findViewById(R.id.listViewphones);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,phones);
		listviewphones.setAdapter(adapter);
		
		
		listviewphones.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) 
			{
				
				Toast.makeText(MainActivity.this,"You selected "+phones[position],Toast.LENGTH_SHORT).show();
				
				
			}
		});
		
	}


}
