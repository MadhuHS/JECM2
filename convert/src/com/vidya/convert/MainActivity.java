package com.vidya.convert;

import com.vidya.convert.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

	Spinner spinner;
	RadioGroup radiogroup;
	RadioButton radio0,radio1;
	EditText edittext;
	Button click;
	TextView result;
	
	String[] type={"weight","lenght","currency"};
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		spinner=(Spinner) findViewById(R.id.spinner1);
		radiogroup=(RadioGroup) findViewById(R.id.radioGroup1);
		radio0=(RadioButton) findViewById(R.id.radio0);
		radio1=(RadioButton) findViewById(R.id.radio1);
		edittext=(EditText) findViewById(R.id.editText1);
		click=(Button) findViewById(R.id.buttonclick);
		result=(TextView) findViewById(R.id.textView1);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_dropdown_item_1line,type);;
		spinner.setAdapter(adapter);
	
		spinner.setOnItemSelectedListener(new OnItemSelectedListener()
		{

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int postion, long arg3)
			{
				switch(postion)
				{
				case 0:
					radio0.setText("kg 2 p");
					radio1.setText("p 2 kg");
					click.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
	
					radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
						
						@Override
						public void onCheckedChanged(RadioGroup arg0, int select) {
							if(edittext.length()!=0)
							{
							switch(select)
							{
							case 0:
								String value1=edittext.getText().toString();
								double temp1=parseDouble(value1);
								temp1 = temp1*1.52;
								String s1 = Double.toString(temp1);
								
		
							break;
							case 1:
								String value2=edittext.getText().toString();
								double temp2=parseDouble(value2);
								result.setText(temp2/1.52).toString();
							break;
							default:
								break;
							}
							}
							else
							{
								result.setText("enter the value");
							}
						}

						private double parseDouble(String value) {
							// TODO Auto-generated method stub
							return 0;
						}
							

					});
					
				}
			});
	
					
					break;
				case 1:
					radio0.setText("m 2 km");
					radio1.setText("km 2 m");
					click.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
	
					radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
						
						@Override
						public void onCheckedChanged(RadioGroup arg0, int select) {
							if(edittext.length()!=0)
							{
							switch(select)
							{
							case 0:
								String value1=edittext.getText().toString();
								double temp1=parseDouble(value1);
								result.settext(temp1*1000).toString();
		
							break;
							case 1:
								String value2=edittext.getText().toString();
								double temp2=parseDouble(value2);
								result.setText(temp2/1000).toString();
							break;
							default:
								break;
							}
							}
							else
							{
								result.setText("enter the value");
							}
						}

						private double parseDouble(String value) {
							// TODO Auto-generated method stub
							return 0;
						}
							

					});
					
				}
			});
	
					break;
				case 2:
					radio0.setText("r 2 d");
					radio1.setText("d 2 r");
click.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
	
					radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
						
						@Override
						public void onCheckedChanged(RadioGroup arg0, int select) {
							if(edittext.length()!=0)
							{
							switch(select)
							{
							case 0:
								String value1=edittext.getText().toString();
								double temp1=parseDouble(value1);
								result.settext(temp1*61).toString();
		
							break;
							case 1:
								String value2=edittext.getText().toString();
								double temp2=parseDouble(value2);
								result.setText(temp2/61).toString();
							break;
							default:
								break;
							}
							}
							else
							{
								result.setText("enter the value");
							}
						}

						private double parseDouble(String value) {
							// TODO Auto-generated method stub
							return 0;
						}
							

					});
					
				}
			});
	
					break;
				default:
				break;
					
				
				}
				
				
			}

			
			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}


	}

