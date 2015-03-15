package com.mkhuda.bundletest;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class EndActivity extends ActionBarActivity {
	
	Bundle bunEnd;
	Context context;
	String nomor1, nomor2, nomor3, tampilhasil;
	Float nomor1float, nomor2float, nomor3float, hasil;
	TextView hasil1, hasil2, hasil3, hasiltambah;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_end);
		context = this;
		hasil1 = (TextView) findViewById(R.id.textViewHasil1);
		hasil2 = (TextView) findViewById(R.id.textViewHasil2);
		hasil3 = (TextView) findViewById(R.id.textViewHasil3);
		hasiltambah = (TextView) findViewById(R.id.textViewHasilTambah);
	
		bunEnd = getIntent().getExtras();
		
//		Mengambil bundle string dari activity ketiga
		nomor1 = bunEnd.getString("Nomor 1");
		nomor2 = bunEnd.getString("Nomor 2");
		nomor3 = bunEnd.getString("Nomor 3");
		
//		Membuat Toast 
		Toast.makeText(context, nomor1+"-"+nomor2+"-"+nomor3, Toast.LENGTH_SHORT).show();
		
//		Mengubah String Bundle ke dalam bentuk Float
		nomor1float = Float.valueOf(nomor1.toString());
		nomor2float = Float.valueOf(nomor2.toString());
		nomor3float = Float.valueOf(nomor3.toString());
		
//		Menambahkan masing-masing hasil
		hasil = nomor1float+nomor2float+nomor3float;
		tampilhasil = hasil.toString();
		
//		Menampilkan kedalam TextView
		hasil1.setText(nomor1);
		hasil2.setText(nomor2);
		hasil3.setText(nomor3);
		hasiltambah.setText(tampilhasil);
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
