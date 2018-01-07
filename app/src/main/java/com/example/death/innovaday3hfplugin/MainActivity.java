package com.example.death.innovaday3hfplugin;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button activate,deactivate;
    handfree obj;
    IntentFilter filter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activate=(Button)findViewById(R.id.button);
        deactivate=(Button)findViewById(R.id.button2);
        obj=new handfree();
        filter=new IntentFilter();
        filter.addAction(Intent.ACTION_HEADSET_PLUG);
        activate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerReceiver(obj,filter);
                Toast.makeText(MainActivity.this, "Activated", Toast.LENGTH_SHORT).show();
            }
        });
        deactivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unregisterReceiver(obj);
                Toast.makeText(MainActivity.this, "Deactivated", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
