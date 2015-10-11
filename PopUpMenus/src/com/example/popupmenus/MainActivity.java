package com.example.popupmenus;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.PopupMenu.OnMenuItemClickListener;

public class MainActivity extends Activity {

	Button popupbutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		popupbutton = (Button) findViewById(R.id.button1);
		
		popupbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				PopupMenu popmenu = new PopupMenu(MainActivity.this,popupbutton);
				MenuInflater inflater = getMenuInflater();
				inflater.inflate(R.menu.popup,popmenu.getMenu());
				popmenu.setOnMenuItemClickListener(new OnMenuItemClickListener() {
					
					@Override
					public boolean onMenuItemClick(MenuItem item) {
				
						if(item.getItemId()==R.id.item1)
						{
							Toast.makeText(MainActivity.this,"Reply....",Toast.LENGTH_SHORT).show();
						}
						
						return false;
					}
				});
				
				popmenu.show();
				
			}
		});
	}


}
