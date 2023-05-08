package com.example.tablelayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TableLayout tableLayout;
    private EditText idEditText, nameEditText, ageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the TableLayout and EditText elements
        tableLayout = findViewById(R.id.table_layout);
        idEditText = findViewById(R.id.id_edit_text);
        nameEditText = findViewById(R.id.name_edit_text);
        ageEditText = findViewById(R.id.age_edit_text);

        // Get a reference to the Submit button and set a click listener on it
        Button submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the values entered in the text boxes
                String id = idEditText.getText().toString();
                String name = nameEditText.getText().toString();
                String age = ageEditText.getText().toString();

                // Create a new row in the table and add the values as TextView elements
                TableRow newRow = new TableRow(MainActivity.this);
                TextView idTextView = new TextView(MainActivity.this);
                idTextView.setText(id);
                idTextView.setPadding(5, 5, 5, 5);
                newRow.addView(idTextView);
                TextView nameTextView = new TextView(MainActivity.this);
                nameTextView.setText(name);
                nameTextView.setPadding(5, 5, 5, 5);
                newRow.addView(nameTextView);
                TextView ageTextView = new TextView(MainActivity.this);
                ageTextView.setText(age);
                ageTextView.setPadding(5, 5, 5, 5);
                newRow.addView(ageTextView);

                // Add the new row to the table
                tableLayout.addView(newRow);
            }
        });
    }
}
