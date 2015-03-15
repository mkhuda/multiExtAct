package com.mkhuda.bundletest;

import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	Context context;
	String angkaPertama;
	float a, angkaGet;
	EditText angka1; 
	Button btn1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		context = this;
		
		angka1 = (EditText) findViewById(R.id.editText1);
			
		btn1 = (Button) findViewById(R.id.button1);
		
		btn1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
//				mengubah angkaPertama menjadi string
				angkaPertama = angka1.getText().toString();
				
				Intent intentKu = new Intent(MainActivity.this,
						DuaActivity.class);
				Bundle bun = new Bundle();
				
//				Menambahkan string angkaPertama ke bundle Nomor1
				bun.putString("Nomor1", angkaPertama);
				intentKu.putExtras(bun);
				startActivity(intentKu);
			}
			
		});

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
