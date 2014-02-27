package com.example.UnitTestPlayground;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyActivity extends Activity {
	private TextView message;
	private ImageView droid;
	private View.OnClickListener droidTapListener;
	private int counter = 0;

	/**
	 * Called when the activity is first created.
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		InitializeApp();
	}

	private void InitializeApp() {
		message = (TextView) findViewById(R.id.message);
		droid = (ImageView) findViewById(R.id.imageView);

		// Define and attach listeners
		droidTapListener = new View.OnClickListener()  {
			public void onClick(View v) {
				TapDroid();
			}
		};
		droid.setOnClickListener(droidTapListener);
	}

	private void TapDroid() {
		counter++;
		String temp = getStringForDisplay(counter);
		message.setText(String.format("You touched the droid %s", temp));
	}

	public String getStringForDisplay(int count) {
		String temp;
		switch(count)
		{
			case 1:
				temp = "once";
				break;
			case 2:
				temp = "twice";
				break;
			default:
				temp = String.format("%d times", count);
		}
		return temp;
	}
}
