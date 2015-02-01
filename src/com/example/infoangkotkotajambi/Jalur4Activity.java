package com.example.infoangkotkotajambi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Jalur4Activity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jalur4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jalur4, menu);
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
	public void openKenali(View v){
		Intent Kenali = new Intent (getApplicationContext(),KenaliActivity.class);
		startActivity(Kenali);
	}
	public void openHandil(View v){
		Intent Handil = new Intent (getApplicationContext(),HandilActivity.class);
		startActivity(Handil);
	}
	public void openPerumnas(View v){
		Intent Perumnas = new Intent (getApplicationContext(),PerumnasActivity.class);
		startActivity(Perumnas);
	}
}
