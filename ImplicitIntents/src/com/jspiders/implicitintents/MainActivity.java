package com.jspiders.implicitintents;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Button callbutton,camerbutton;
	ImageView capturedimageview;
	private static final int CAMERA_CODE = 1313;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		callbutton = (Button) findViewById(R.id.buttoncall);
		camerbutton = (Button) findViewById(R.id.buttoncamera);
		capturedimageview = (ImageView) findViewById(R.id.imageViewcaptured);
		
		
		
		
		callbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
				//To start Call ACTIVITY
				Intent intent = new Intent(Intent.ACTION_CALL);//ACTION_DIAL
				intent.setData(Uri.parse("tel:"+"9889877789"));
				startActivity(intent);
				
				//To start web browser
				/*Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("https://www.google.com"));
				startActivity(intent);*/
			}
		});
	
	  camerbutton.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) 
		{
			Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(intent,CAMERA_CODE);
			
		}
	});
	
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, 
			Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
	
		if(requestCode==CAMERA_CODE)
		{
			if(resultCode == RESULT_OK)
			{
				Bitmap bitmap = (Bitmap)data.getExtras().get("data");
				capturedimageview.setImageBitmap(bitmap);
			}
		}
	}
	

}
