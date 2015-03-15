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

public class TigaActivity extends ActionBarActivity {
	
	Context context;
	EditText edt3;
	Button btn3;
	String nomor1, nomor2, nomor3, nomor31;
	Intent intent3;
	Bundle bun3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tiga);
		context = this;
		
		edt3 = (EditText) findViewById(R.id.editText3);
		btn3 = (Button) findViewById(R.id.button3);
		bun3 = getIntent().getExtras();
		
//		Mengambil masukan form dari activity dua
//		Nomor21 adalah bundle dari activity 1 yang didefinisikan di activity 2 menjadi Nomor21
//		Nomor2 adalah bundle dari activity 2, atau input dari form activity 2
		nomor1 = bun3.getString("Nomor21");
		nomor2 = bun3.getString("Nomor2");
		
		btn3.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String nomor3 = edt3.getText().toString();
				intent3 = new Intent(TigaActivity.this, EndActivity.class);
				Bundle bun3 = new Bundle();
				
//				Menyisipkan 3 bundle yakni Nomor 1, Nomor 2, dan Nomor 3 untuk dipanggil di activity terakhir
				bun3.putString("Nomor 1", nomor1);
				bun3.putString("Nomor 2", nomor2);
				bun3.putString("Nomor 3", nomor3);
				intent3.putExtras(bun3);
				startActivity(intent3);
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
