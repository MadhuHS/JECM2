package com.jsp.externalstoragedemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button savebutton,readbutton;
	EditText messageedittext;
	TextView outputtextview;
	private FileWriter filewriter;
	private FileOutputStream fos;
	private FileInputStream fis;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		savebutton = (Button) findViewById(R.id.button1);
		readbutton = (Button) findViewById(R.id.button2);
		messageedittext = (EditText) findViewById(R.id.editText1);
		outputtextview = (TextView) findViewById(R.id.textView1);
		
		
		savebutton.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0) 
			{
				String state = Environment.getExternalStorageState();
				
				if(state.equalsIgnoreCase(Environment.MEDIA_MOUNTED))
				{
					File root = Environment.getExternalStorageDirectory();
					
					File dir = new File(root.getAbsolutePath()+"/MyDir");
					
					if(!dir.exists())
					{
						dir.mkdir();
					}
					
					File file = new File(dir,"Demofile1.txt");
					
					String inputmessage = messageedittext.getText().toString();
					
					try 
					{
						fos = new FileOutputStream(file);
						fos.write(inputmessage.getBytes());
						
						/*filewriter = new FileWriter(file);
						filewriter.write(inputmessage);
						filewriter.flush();*/
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					finally
					{
						try 
						{
							fos.close();
							//filewriter.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}

				}
				
				else
				{
					Toast.makeText(MainActivity.this,"No SDcard found",Toast.LENGTH_SHORT).show();
				}
				
			}
		});
	
	readbutton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) 
		{
			File root = Environment.getExternalStorageDirectory();
			File dir = new File(root.getAbsoluteFile(),"/MyDir");
			
			File file = new File(dir,"Demofile1.txt");
			
			try 
			{
				fis = new FileInputStream(file);
				InputStreamReader inputStreamReader = new InputStreamReader(fis);
				BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
				
				StringBuffer buffer = new StringBuffer();
				String line = "";
				
				while((line=bufferedReader.readLine())!=null)
				{
					buffer.append(line+"\r\n");
				}
				
				outputtextview.setText(buffer.toString());
				
				
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			finally
			{
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	});
	
	
	
	
	
	
	
	
	
	
	
	
	
	}



}
