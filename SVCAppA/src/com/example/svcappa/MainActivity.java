package com.example.svcappa;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void displayAbout(View view)
	{
		// Do something in response to button
		Intent intent = new Intent(this, DisplayAboutMessageActivity.class);
		startActivity(intent);
	}
	
	public void displayEvents(View view)
	{
		Intent intent = new Intent(this, DisplayEventsMessageActivity.class);
		startActivity(intent);
	}

}
