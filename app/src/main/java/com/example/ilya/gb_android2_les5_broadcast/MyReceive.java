package com.example.ilya.gb_android2_les5_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.Toast;

/**
 * Created by Ilya on 14.03.2017.
 */

public class MyReceive extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
        String temp = intent.getStringExtra(BatteryManager.EXTRA_TEMPERATURE);

        Toast.makeText(context, temp, Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(context, HelloActivity.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_CLEAR_TASK
                | Intent.FLAG_ACTIVITY_NEW_TASK);
        intent1.putExtra("level", level);
        context.startActivity(intent1);
    }
}
