package com.example.kelseyde.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    TextView result_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        result_text = (TextView) findViewById(R.id.result_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        result_text.setText(result);

    }
}
