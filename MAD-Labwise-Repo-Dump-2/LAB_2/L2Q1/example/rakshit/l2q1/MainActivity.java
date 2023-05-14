package com.example.rakshit.l2q1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
	TextView logger;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		logger = findViewById(R.id.logger);
		logger.append("\nonCreate");
	}

	@Override
	protected void onStart()
	{
		super.onStart();
		logger.append("\nonStop");
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		logger.append("\nonResume");
	}

	@Override
	protected void onPause()
	{
		super.onPause();
		logger.append("\nonPause");
	}

	@Override
	protected void onStop()
	{
		super.onStop();
		logger.append("\nonStop");
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		logger.append("\nonDestroy");
	}

	@Override
	protected void onRestart()
	{
		super.onRestart();
		logger.append("\nonRestart");
	}
}
