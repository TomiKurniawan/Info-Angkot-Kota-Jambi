package com.example.infoangkotkotajambi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Jalur5Activity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jalur5);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jalur5, menu);
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
	public void openBanjar (View v){
		Intent Banjar = new Intent (getApplicationContext(),BanjarActivity.class);
		startActivity(Banjar);
	}
	public void openThehok (View v){
		Intent Thehok = new Intent (getApplicationContext(),ThehokActivity.class);
		startActivity(Thehok);
	}
	public void openBakung (View v){
		Intent Bakung = new Intent (getApplicationContext(),BakungActivity.class);
		startActivity(Bakung);
	}
	public void openChandra (View v){
		Intent Chandra = new Intent (getApplicationContext(),ChandraActivity.class);
		startActivity(Chandra);
	}
}
