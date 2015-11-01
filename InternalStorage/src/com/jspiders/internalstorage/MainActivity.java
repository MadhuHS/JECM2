package com.jspiders.internalstorage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button savebButton,readButton;
	EditText inputEditText;
	TextView outputTextView;
	private FileOutputStream fileOutputStream;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		savebButton = (Button) findViewById(R.id.buttonsave);
		readButton = (Button) findViewById(R.id.buttonread);
		inputEditText = (EditText) findViewById(R.id.editTextinput);
		outputTextView = (TextView) findViewById(R.id.textViewoutput);
		
		savebButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				String inputdata = inputEditText.getText().toString();
				
				try 
				{
				 
					fileOutputStream = openFileOutput("Demo2", Context.MODE_PRIVATE);
					fileOutputStream.write(inputdata.getBytes());
				
				} 
				
				catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				finally
				{
					try 
					{
						fileOutputStream.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		
	
	readButton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) 
		{
			try 
			{
				FileInputStream fis = openFileInput("Demo2");
				InputStreamReader inputStreamReader = new InputStreamReader(fis);
				BufferedReader buReader = new BufferedReader(inputStreamReader);
				
				String line = "";
				StringBuffer stBuffer = new StringBuffer();
				
				while((line = buReader.readLine())!= null)
				{
					stBuffer.append(line+"\r\n");
				}
				
				outputTextView.setText(stBuffer.toString());
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	});
	
	
	}
	

	

}
