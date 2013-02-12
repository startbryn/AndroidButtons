package edu.Drake.androidactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity {
	
	private static final String TAG = "SecondActivity";
	Button button;
	Button button2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	
		button = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				//code put here will be executed when button is pressed
				Log.v(TAG, "Page #2 - button 1 pressed");
				finish();
				
			}

		});
		
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.v(TAG, "Page #2 - button 2 pressed");
				Intent intent = new Intent(v.getContext(), ThirdActivity.class);
				startActivity(intent);
			}
		});
		
	}
}
