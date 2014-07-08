package org.cmautotether;

import java.lang.reflect.*;

import com.eaglebyte.autousbtethering.R;

import android.app.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.util.*;
import android.view.*;

public class MainActivity extends Activity {

	private static final String TAG = "AUT-MainActivity.java";

	TetheringManager tm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tm = new TetheringManager();
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
	
	public void btnEnableOnClick(View v) {
		tm.setUsbTethering(true);
	}
	
	public void btnDisableOnClick(View v) {
		tm.setUsbTethering(false);
	}
}
