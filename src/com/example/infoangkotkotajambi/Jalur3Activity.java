package com.example.infoangkotkotajambi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Jalur3Activity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jalur3);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jalur3, menu);
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
	public void openSipin (View v){
		Intent Sipin = new Intent (getApplicationContext(),SipinActivity.class);
		startActivity(Sipin);
	}
	public void openBroni (View v){
		Intent Broni = new Intent (getApplicationContext(),BroniActivity.class);
		startActivity(Broni);
	}
	public void openSeberang (View v){
		Intent Seberang = new Intent (getApplicationContext(),SeberangActivity.class);
		startActivity(Seberang);
	}
}
