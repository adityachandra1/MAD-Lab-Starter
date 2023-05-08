package com.example.lab_2_calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.lab_2_calculator.R;

import androidx.appcompat.app.AppCompatActivity;
import com.example.lab_2_calculator.ResultActivity;

public class MainActivity extends AppCompatActivity {

    private TextView expressionTextView;
    private StringBuilder expressionBuilder = new StringBuilder();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expressionTextView = findViewById(R.id.expression_text_view);

        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("0");
                updateExpression();
            }
        });

        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("1");
                updateExpression();
            }
        });

        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("2");
                updateExpression();
            }
        });

        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("3");
                updateExpression();
            }
        });

        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("4");
                updateExpression();
            }
        });

        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("5");
                updateExpression();
            }
        });

        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("6");
                updateExpression();
            }
        });

        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("7");
                updateExpression();
            }
        });

        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("8");
                updateExpression();
            }
        });

        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append("9");
                updateExpression();
            }
        });

        Button buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append(" + ");
                updateExpression();
            }
        });

        Button buttonSubtract = findViewById(R.id.button_subtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append(" - ");
                updateExpression();
            }
        });

        Button buttonMultiply = findViewById(R.id.button_multiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append(" * ");
                updateExpression();
            }
        });

        Button buttonDivide = findViewById(R.id.button_divide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                expressionBuilder.append(" / ");
                updateExpression();
            }
        });

        Button buttonEqual = findViewById(R.id.button_equal);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String expression = expressionBuilder.toString();
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("expression", expression);
                startActivity(intent);
            }
        });
    }

    private void updateExpression() {
        expressionTextView.setText(expressionBuilder.toString());
    }
}


