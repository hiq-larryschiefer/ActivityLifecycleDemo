package com.example.activitylifecycledemo;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
	private static final String TAG = "LifecycleDemo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Log.d(TAG, "onCreate");

    	super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final TextView statusText = (TextView)findViewById(R.id.text_status);
        Button btn = (Button)findViewById(R.id.btn_update_status);
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Log.d(TAG, "onClick");
				statusText.setText(Long.toString(SystemClock.uptimeMillis()));
			}
		});
    }

    @Override
    protected void onStart() {
    	super.onStart();
    	Log.d(TAG, "onStart");
    }
    
    @Override
    protected void onRestart() {
    	super.onRestart();
    	Log.d(TAG, "onRestart");
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	Log.d(TAG, "onResume");
    }
    
    @Override
    protected void onPause() {
    	Log.d(TAG, "onPause");
    	super.onPause();
    }
    
    @Override
    protected void onStop() {
    	Log.d(TAG, "onStop");
    	super.onStop();
    }
    
    @Override
    protected void onDestroy() {
    	Log.d(TAG, "onDestroy");
    	super.onDestroy();
    }
}
