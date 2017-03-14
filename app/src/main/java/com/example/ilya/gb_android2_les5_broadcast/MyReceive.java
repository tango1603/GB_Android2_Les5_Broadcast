package com.example.ilya.gb_android2_les5_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Ilya on 14.03.2017.
 */

public class MyReceive extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Charge!", Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(context,HelloActivity.class);
        intent1.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                |Intent.FLAG_ACTIVITY_CLEAR_TASK
                |Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent1);
    }
}
