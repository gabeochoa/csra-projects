package com.example.buscience;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class FacebookActivity extends Activity 
{
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
		boolean requestPassed = requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		setContentView(R.layout.activity_facebook);
		if (requestPassed) {
			getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title_bar_layout);
			((TextView)findViewById(R.id.titleHeading1)).setText("Facebook");
		}
		
		WebView browser = (WebView)findViewById(R.id.webView1);
		browser.setWebViewClient(new WebViewClient() {
	        public boolean shouldOverrideUrlLoading(WebView view, String url) {
	            return false;
	        }
	    });
		browser.getSettings().setJavaScriptEnabled(true);
		browser.loadUrl("https://www.facebook.com/bu.scyence");
	}
}