package com.kritikalerror.fbtextonly;

import com.kritikalerror.fbtextonly.adapter.TabsAdapter;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import com.kritikalerror.fbtextonly.R;
import android.app.Activity;

// Needed?
public class LoginActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		// Disable action bar extras
		ActionBar ab = getActionBar();
		ab.hide();

		// Login code, user must have an FB account. We need a shortcode

		// Walk user through the login

		// This should be the first activity
	}
}
