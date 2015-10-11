package com.example.menus1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText messageedittext;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		messageedittext = (EditText) findViewById(R.id.editText1);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		
		
		if(item.getItemId()==R.id.share)
		{
		
			String inptmsg = messageedittext.getText().toString();
			
			Intent shareintent = new Intent(Intent.ACTION_SEND);
			shareintent.setType("text/plain");
			shareintent.putExtra(Intent.EXTRA_TEXT,inptmsg);
			startActivity(Intent.createChooser(shareintent,"Share Via"));
			//Toast.makeText(MainActivity.this,"U clicked on share",Toast.LENGTH_SHORT).show();
		}
		
		
		return super.onOptionsItemSelected(item);
		
		
		
		
		
		
		
	}
}
