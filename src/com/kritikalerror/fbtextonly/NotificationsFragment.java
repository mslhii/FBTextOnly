package com.kritikalerror.fbtextonly;

import com.kritikalerror.fbtextonly.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class NotificationsFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		//Display the view
		View rootView = inflater.inflate(R.layout.fragment_notifications, container, false);
		
		return rootView;
	}

}
