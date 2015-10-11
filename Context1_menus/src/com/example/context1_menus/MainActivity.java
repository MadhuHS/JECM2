package com.example.context1_menus;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	ListView contactslistview;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		contactslistview = (ListView) findViewById(R.id.listViewcontacts);
		final String[] contacts = {"AAA","BBB","CCC","DDD","EEE","FFF"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,contacts);
		contactslistview.setAdapter(adapter);
		
		registerForContextMenu(contactslistview);
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		super.onCreateContextMenu(menu, v, menuInfo);
		
		menu.setHeaderTitle("Choose your option");
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.context,menu);
		
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		
		if(item.getItemId()==R.id.Item1)
		{
			Toast.makeText(MainActivity.this,"Calling.....",Toast.LENGTH_SHORT).show();
		}
		return super.onContextItemSelected(item);
	}
	
	
	
	
	
}
