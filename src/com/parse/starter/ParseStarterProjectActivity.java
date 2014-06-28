package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.parse.ParseAnalytics;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		ParseAnalytics.trackAppOpened(getIntent());
	    Log.d("ParseStarterProjectActivity", "got action");
	}
}
