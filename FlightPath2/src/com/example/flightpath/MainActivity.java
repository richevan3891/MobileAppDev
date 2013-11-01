package com.example.flightpath;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuInflater;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		MapFragment mf = (MapFragment) getFragmentManager().findFragmentById(R.id.map_fragment);
		GoogleMap map = mf.getMap();

		LatLng pos = new LatLng(29.18857,-81.0487);
		map.addMarker(new MarkerOptions().position(pos));
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(pos,15));
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main, menu);
		return super.onCreateOptionsMenu(menu);
	}


}
