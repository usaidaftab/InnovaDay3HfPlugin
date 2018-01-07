package com.example.death.innovaday3hfplugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.widget.Toast;

public class handfree extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Toast.makeText(context, "Handfree mode changed", Toast.LENGTH_SHORT).show();

        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
