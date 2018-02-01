package com.example.android.footballquizapp;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.android.footballquizapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    /** This method Calls QuizBodyActivity     */

    public void StartQuizBody (View view) {
        Intent StartQuizBody = new Intent (this, StartQuizBody.class);
        EditText nameField = findViewById(R.id.name);
        String message = nameField.getText().toString().trim();
        if (message.equals("")) {
            Toast.makeText(this, R.string.no_name, Toast.LENGTH_SHORT).show();
            return;
        } else {
            StartQuizBody.putExtra(EXTRA_MESSAGE, message);
            startActivity(StartQuizBody);
            this.finish();
        }
    }
}