package com.example.infoangkotkotajambi;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	final Context context = this;
	private ImageView button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		button = (ImageView) findViewById(R.id.keluar);
		
		// add button listener
		  button.setOnClickListener(new OnClickListener() {
		 
		  @Override
		  public void onClick(View arg0) {
		 
		   AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
		    context);
		 
		   // set title
		   alertDialogBuilder.setTitle("Yakin Ingin Keluar");
		 
		   // set dialog message
		   alertDialogBuilder
		   .setCancelable(false)
		   .setPositiveButton("Ya",new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog,int id) {
		   // if this button is clicked, close
		      // current activity
		   MainActivity.this.finish();
		   }
		   })
		   
		   .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
		   public void onClick(DialogInterface dialog,int id) {
		      // if this button is clicked, just close
		      // the dialog box and do nothing
		      dialog.cancel();
		     }
		    });
		 
		    // create alert dialog
		    AlertDialog alertDialog = alertDialogBuilder.create();
		 
		    // show it
		    alertDialog.show();
		   }
		  });
		 }
	public void openCari (View v){
		Toast.makeText(getApplicationContext(), "Fitur ini Belum Diaktifkan", Toast.LENGTH_LONG).show();
	}
	public void openTentang (View v){
		Intent Tentang = new Intent (getApplicationContext(),TentangActivity.class);
		startActivity(Tentang);
	}
	public void openTips (View v){
		Intent Tips = new Intent (getApplicationContext(),TipsActivity.class);
		startActivity(Tips);
	}
	public void openJam (View v){
		Intent Jam = new Intent (getApplicationContext(),JamActivity.class);
		startActivity(Jam);
	}
	public void openOngkos (View v){
		Intent Ongkos = new Intent (getApplicationContext(),OngkosActivity.class);
		startActivity(Ongkos);
	}
	public void openRute (View v){
		Intent Rute = new Intent (getApplicationContext(),RuteActivity.class);
		startActivity(Rute);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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
	
}

