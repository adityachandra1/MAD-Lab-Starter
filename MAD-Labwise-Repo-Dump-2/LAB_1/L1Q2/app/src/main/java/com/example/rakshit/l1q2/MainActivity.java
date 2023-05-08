package com.example.rakshit.l1q2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	boolean b = false;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn_text).setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				if(!b)
				{
					((TextView) findViewById(R.id.text_view)).setText("Bye world");
					b = true;
				}
				else
				{
					((TextView) findViewById(R.id.text_view)).setText("Hello world");
					b = false;
				}
			}
		});
	}
}
