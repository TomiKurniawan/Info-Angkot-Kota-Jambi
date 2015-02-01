package com.example.infoangkotkotajambi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class RuteActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rute);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rute, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void openJalur1 (View v){
		Intent Jalur1 = new Intent (getApplicationContext(),Jalur1Activity.class);
		startActivity(Jalur1);
	}
	public void openJalur2 (View v){
		Intent Jalur2 = new Intent (getApplicationContext(),Jalur2Activity.class);
		startActivity(Jalur2);
	}
	public void openJalur3 (View v){
		Intent Jalur3 = new Intent (getApplicationContext(),Jalur3Activity.class);
		startActivity(Jalur3);
	}
	public void openJalur4 (View v){
		Intent Jalur4 = new Intent (getApplicationContext(),Jalur4Activity.class);
		startActivity(Jalur4);
	}
	public void openJalur5 (View v){
		Intent Jalur5 = new Intent (getApplicationContext(),Jalur5Activity.class);
		startActivity(Jalur5);
	}
}
