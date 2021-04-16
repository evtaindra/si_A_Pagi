package com.evta.lifecycleapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "App OnCreate",Toast.LENGTH_SHORT).show();	
    }


    // kesalahan coding ada pada ...../
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		 Toast.makeText(this, "App OnDestroy",Toast.LENGTH_SHORT).show();	
	}


	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		 Toast.makeText(this, "App OnPause",Toast.LENGTH_SHORT).show();	
	}


	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		 Toast.makeText(this, "App OnRestart",Toast.LENGTH_SHORT).show();	
	}


	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		 Toast.makeText(this, "App OnResume",Toast.LENGTH_SHORT).show();	
	}


	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		 Toast.makeText(this, "App OnStart",Toast.LENGTH_SHORT).show();	
	}


	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		 Toast.makeText(this, "App OnStop",Toast.LENGTH_SHORT).show();	
	}
    
}
