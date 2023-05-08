package com.example.rakshit.l2viva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
	EditText amt;
	Button btn_convert;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		amt = findViewById(R.id.amt);
		btn_convert = findViewById(R.id.btn_convert);

		btn_convert.setOnClickListener(new View.OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				String s = amt.getText().toString();
				if(s.isEmpty())
					amt.setError("Please enter a value");
				else
				{
					double con =  Double.parseDouble(amt.getText().toString()) * 64;
					Toast.makeText(MainActivity.this, "\u20B9 " + String.format("%.2f", con), Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}
