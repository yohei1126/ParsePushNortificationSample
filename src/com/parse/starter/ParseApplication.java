package com.parse.starter;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseInstallation;
import com.parse.ParseUser;
import com.parse.PushService;

import android.app.Application;

public class ParseApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();

		// Add your initialization code here
		Parse.initialize(this, "w9cEeBoEuDMvXf6zS6P2mT6lyGkRgGdmHiZS0WEh", "zqScDEpjQifyS7kLZt327aWtcBnV24WAPv38R5Zo");
		PushService.setDefaultPushCallback(this, ParseStarterProjectActivity.class);
		ParseInstallation.getCurrentInstallation().saveInBackground();
		PushService.subscribe(this, "Yohei", ParseStarterProjectActivity.class);

		ParseUser.enableAutomaticUser();
		ParseACL defaultACL = new ParseACL();
	    
		// If you would like all objects to be private by default, remove this line.
		defaultACL.setPublicReadAccess(true);
		
		ParseACL.setDefaultACL(defaultACL, true);
	}

}
