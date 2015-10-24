package com.example.webview_demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class MainActivity extends Activity {

	WebView googlewebView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		googlewebView = (WebView) findViewById(R.id.webView1);
		googlewebView.getSettings().getJavaScriptEnabled();
		googlewebView.loadUrl("http://www.google.com");
	}


}
