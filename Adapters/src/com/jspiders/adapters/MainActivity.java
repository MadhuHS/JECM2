package com.jspiders.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

   Spinner spinnerphones;
   TextView textviewselecteditem;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final String[] phones = {"HTC","MOTO","MI","LG","SONY","Google"};
        
        spinnerphones = (Spinner) findViewById(R.id.spinnerphones);
        textviewselecteditem = (TextView) findViewById(R.id.textViewselecteditem);
        
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,phones);
        spinnerphones.setAdapter(adapter);
        
        
        spinnerphones.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3) {
				textviewselecteditem.setText("You selected "+phones[arg2]);
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) 
			{
				// TODO Auto-generated method stub
				
			}
		});
        
        
        
	}
}
