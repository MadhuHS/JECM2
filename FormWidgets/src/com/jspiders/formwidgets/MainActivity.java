package com.jspiders.formwidgets;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity {

   
	RadioButton option1radiobutton,option2radiobutton;
	RadioGroup  selectionradiogroup;
	ToggleButton togglebutton;
	Spinner spinnerphones;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        String[] phones = {"HTC","MOTO","LG","ONE Plus","MI","Lenovo"};
        
        option1radiobutton = (RadioButton) findViewById(R.id.radioButtonoption1);
        option2radiobutton = (RadioButton) findViewById(R.id.radioButtonoption2);
        selectionradiogroup = (RadioGroup) findViewById(R.id.radioGroup1);
        spinnerphones = (Spinner) findViewById(R.id.phonesspinner);
        
        togglebutton = (ToggleButton) findViewById(R.id.toggleButton);
 
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,phones);
       
        spinnerphones.setAdapter(adapter);
        
   
        /*togglebutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v1) 
			{
				if((boolean)v1.isEnabled())
				{
					Toast.makeText(MainActivity.this,"Toggle button is on",Toast.LENGTH_SHORT).show();
					
				}
			}
		});*/
        
        selectionradiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup arg0, int selection) 
			{
				switch (selection) {
				
				case R.id.radiodelection1: Toast.makeText(MainActivity.this,"Clicked on selection 1",Toast.LENGTH_SHORT).show();
					
					break;
				
				case R.id.radioselection2: Toast.makeText(MainActivity.this,"Clicked on selection 2",Toast.LENGTH_SHORT).show();
				
				break;
				
				case R.id.radioselection3: Toast.makeText(MainActivity.this,"Clicked on selection 3",Toast.LENGTH_SHORT).show();
				
				break;
				case R.id.radioselection4: Toast.makeText(MainActivity.this,"Clicked on selection 4",Toast.LENGTH_SHORT).show();
				
				break;
				default:
					break;
				}
				
			}
		});        
    }
    
	
	 
}
