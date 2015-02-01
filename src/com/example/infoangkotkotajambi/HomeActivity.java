package com.example.infoangkotkotajambi;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class HomeActivity extends ActionBarActivity {
	
	private static int waktuMuncul = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        
        new Handler().postDelayed(new Runnable() {
        	 
            @Override
            public void run() {
                // Metode Ini akan dijalankan setelah timer selesai menghitung
                // Program akan masuk ke MainActivity
                Intent muncul = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(muncul);
                // Menutup aktivitas
                finish();
            }
        }, waktuMuncul);
         
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
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
