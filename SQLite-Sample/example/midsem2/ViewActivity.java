package com.example.midsem2;

import androidx.appcompat.app.AppCompatActivity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    private TextView textViewData;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        // Initialize the views
        textViewData = findViewById(R.id.textViewData);

        // Open the database
        db = openOrCreateDatabase("MyDatabase", MODE_PRIVATE, null);

        // Query the database for all data and display it in the text view
        Cursor cursor = db.rawQuery("SELECT * FROM MyTable", null);
        if (cursor.moveToFirst()) {
            StringBuilder stringBuilder = new StringBuilder();
            do {
                String name = cursor.getString(0);
                String phone = cursor.getString(1);
                stringBuilder.append("Name: ").append(name).append(", Phone: ").append(phone).append("\n");
            } while (cursor.moveToNext());
            textViewData.setText(stringBuilder.toString());
        } else {
            textViewData.setText("No data found");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Close the database connection
        db.close();
    }
}
