package com.evta.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;


public class HelloActivity extends Activity {
	
	//Deklarasi Class terhadap Objek
	Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        
        //instantsiasi Objek
        btn1 = (Button)findViewById(R.id.button1);
        btn2 = (Button)findViewById(R.id.button2);
        
        //btn.setText(R.string.evta);
        btn1.setText("Serly");
        
        btn2.setText(R.string.hello_world);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hello, menu);
        return true;
    }
    
}
