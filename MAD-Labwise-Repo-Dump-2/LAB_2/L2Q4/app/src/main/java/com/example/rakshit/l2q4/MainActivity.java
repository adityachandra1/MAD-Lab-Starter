package com.example.rakshit.l2q4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		findViewById(R.id.btn_open).setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				try
				{
					Uri uri = Uri.parse(((EditText)findViewById(R.id.url)).getText().toString());
					Intent intent = new Intent(Intent.ACTION_VIEW, uri);
					startActivity(intent);
				}
				catch(Exception e)
				{
					Toast.makeText(MainActivity.this, Log.getStackTraceString(e), Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
