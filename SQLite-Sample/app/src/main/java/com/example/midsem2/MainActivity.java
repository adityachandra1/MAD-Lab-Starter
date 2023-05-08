package com.example.midsem2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextPhone;
    private Button buttonSubmit, buttonView;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the views
        editTextName = findViewById(R.id.editTextName);
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonView = findViewById(R.id.buttonView);

        // Create or open the database
        db = openOrCreateDatabase("MyDatabase", MODE_PRIVATE, null);

        // Create the table if it doesn't exist
        db.execSQL("CREATE TABLE IF NOT EXISTS MyTable (name TEXT, phone TEXT)");

        // Set the click listener for the submit button
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input values
                String name = editTextName.getText().toString().trim();
                String phone = editTextPhone.getText().toString().trim();

                // Insert the data into the database
                ContentValues values = new ContentValues();
                values.put("name", name);
                values.put("phone", phone);
                db.insert("MyTable", null, values);

                // Clear the input fields
                editTextName.setText("");
                editTextPhone.setText("");

                // Show a toast message
                Toast.makeText(MainActivity.this, "Data inserted successfully", Toast.LENGTH_SHORT).show();
            }
        });

        // Set the click listener for the view button
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the new activity to // display the data
                Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(intent);
                }
                });
                }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close the database connection
        db.close();
    }

}
