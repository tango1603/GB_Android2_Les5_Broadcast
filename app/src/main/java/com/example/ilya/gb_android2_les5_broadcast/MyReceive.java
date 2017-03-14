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
    }
}
