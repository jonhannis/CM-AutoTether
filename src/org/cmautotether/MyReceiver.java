package org.cmautotether;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
	
	private static TetheringManager tm = null;
	
	public MyReceiver() {
	}

	@Override
	public void onReceive(Context context, Intent intent) {
		if (tm == null) {
			tm = new TetheringManager();
		}
	    /*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	    tm.setUsbTethering(true);

	}
}
