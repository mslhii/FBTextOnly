package com.kritikalerror.fbtextonly;

import com.kritikalerror.fbtextonly.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SubscriptionsFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		// Display the vi
		View rootView = inflater.inflate(R.layout.fragment_subscriptions, container, false);
		
		return rootView;
	}
}
