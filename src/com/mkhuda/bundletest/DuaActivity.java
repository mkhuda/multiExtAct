package com.mkhuda.bundletest;

import android.support.v7.app.ActionBarActivity;
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

public class DuaActivity extends ActionBarActivity {
	
	String nomor1, nomor2, stringId, getText2;
	EditText edt2;
	Button btn2;
	Context context;
	Bundle bun1, bun2;
	Intent intent2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dua);
		context = this;
		
		edt2 = (EditText) findViewById(R.id.editText2);
		btn2 = (Button) findViewById(R.id.button2);
		
//		Mengambil (get) bundle Nomor1 dari Activity Pertama
		bun1 = getIntent().getExtras();
		nomor1 = bun1.getString("Nomor1");
		
		btn2.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				String nomor2 = edt2.getText().toString();
				intent2 = new Intent(DuaActivity.this, TigaActivity.class);
				Bundle bun2 = new Bundle();
				
//				Menambahkan masukan form ke 2 ke bundle Nomor2
				bun2.putString("Nomor2", nomor2);
				
//				Menambahkan bundle Nomor1 dari Activity Pertama ke Bundle Nomor21 yang akan dipanggil di Activity ketiga
				bun2.putString("Nomor21", nomor1);
				intent2.putExtras(bun2);
				
//				Memulai activity ketiga
				startActivity(intent2);
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
