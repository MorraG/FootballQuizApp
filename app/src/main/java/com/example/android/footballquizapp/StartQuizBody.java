package com.example.android.footballquizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class StartQuizBody extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {

    // Total number of questions
    int totalNumberOfQuestions = 10;
    // Correct answers counter
    int correct_score = 0;
    // Incorrect answers counter
    int incorrect_score = 0;
    // Here we declare variables for correct answer variants

    CheckBox answer2_1, answer2_2, answer2_3, answer2_4;

    RadioButton answer1_2, answer3_2, answer4_3, answer5_4,
            answer6_3, answer8_4, answer9_1, answer10_3;

    //variable to store answer to the question 7
    final String Q7_ANSWER = "Juventus";

    // Here we declare RadioGroups
    RadioGroup rg1, rg3, rg4, rg5, rg6, rg8, rg9, rg10;
    // Here we declare Buttons
    Button buttonToMain, submitButton, shareButton;
    // Here we declare a variable to store player's name
    String name;
    // Here we declare a variable for the quiz results toast
    String resultMessage;
    // Here we declare a variable to store a string "Question (current question number) out of (total number of questions)"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_football_quiz);
        //Method for intialization
        initViews();
    }

    //Method for intialization
    public void initViews() {
        // Initialization of RadioGroups
        rg1 = findViewById(R.id.radio_group1);
        rg3 = findViewById(R.id.radio_group3);
        rg4 = findViewById(R.id.radio_group4);
        rg5 = findViewById(R.id.radio_group5);
        rg6 = findViewById(R.id.radio_group6);
        rg8 = findViewById(R.id.radio_group8);
        rg9 = findViewById(R.id.radio_group9);
        rg10 = findViewById(R.id.radio_group10);
        // setting listener to the RadioGroups
        rg1.setOnCheckedChangeListener(this);
        rg3.setOnCheckedChangeListener(this);
        rg4.setOnCheckedChangeListener(this);
        rg5.setOnCheckedChangeListener(this);
        rg6.setOnCheckedChangeListener(this);
        rg8.setOnCheckedChangeListener(this);
        rg9.setOnCheckedChangeListener(this);
        rg10.setOnCheckedChangeListener(this);
        // initialize correct answers
        answer1_2 = (RadioButton) findViewById(R.id.answer1_2);
        answer3_2 = (RadioButton) findViewById(R.id.answer3_2);
        answer4_3 = (RadioButton) findViewById(R.id.answer4_3);
        answer5_4 = (RadioButton) findViewById(R.id.answer5_4);
        answer6_3 = (RadioButton) findViewById(R.id.answer6_3);
        answer8_4 = (RadioButton) findViewById(R.id.answer8_4);
        answer9_1 = (RadioButton) findViewById(R.id.answer9_1);
        answer10_3 = (RadioButton) findViewById(R.id.answer10_3);

        // initialize checkboxes
        answer2_1 = (CheckBox) findViewById(R.id.answer2_1);
        answer2_2 = (CheckBox) findViewById(R.id.answer2_2);
        answer2_3 = (CheckBox) findViewById(R.id.answer2_3);
        answer2_4 = (CheckBox) findViewById(R.id.answer2_4);

        // initialization Buttons
        buttonToMain = (Button) findViewById(R.id.backtomain_button);
        submitButton = (Button) findViewById(R.id.submit_button);
        shareButton = (Button) findViewById(R.id.share_button);

        // setting the listener to the Buttons
        buttonToMain.setOnClickListener(this);
        submitButton.setOnClickListener(this);
        shareButton.setOnClickListener(this);
    }


    public void onCheckedChanged(RadioGroup radioGroup, int CheckedRadioButtonId) {
        // Checking RadioGroup 1
        if (radioGroup == rg1) {
            ;
            if (answer1_2.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg1.getChildCount(); i++) {
                (rg1.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 3
        if (radioGroup == rg3) {
            ;
            if (answer3_2.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg3.getChildCount(); i++) {
                (rg3.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 4
        if (radioGroup == rg4) {
            ;
            if (answer4_3.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg4.getChildCount(); i++) {
                (rg4.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 5
        if (radioGroup == rg5) {
            ;
            if (answer5_4.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg5.getChildCount(); i++) {
                (rg5.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 6
        if (radioGroup == rg6) {
            ;
            if (answer6_3.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg6.getChildCount(); i++) {
                (rg6.getChildAt(i)).setEnabled(false);
            }
        }

        // Checking RadioGroup 8
        if (radioGroup == rg8) {
            ;
            if (answer8_4.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg8.getChildCount(); i++) {
                (rg8.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 9
        if (radioGroup == rg9) {
            ;
            if (answer9_1.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg9.getChildCount(); i++) {
                (rg9.getChildAt(i)).setEnabled(false);
            }
        }
        // Checking RadioGroup 10
        if (radioGroup == rg10) {
            ;
            if (answer10_3.isChecked()) {
                correct_score++;
            } else {
                incorrect_score++;
            }
            // Disable RadioButtons of rg1
            for (int i = 0; i < rg10.getChildCount(); i++) {
                (rg10.getChildAt(i)).setEnabled(false);
            }
        }
    }

    /**
     * This method is called by clicking on Submit button. It checks if at least one answer
     * has been selected in the quiz, and if not, asks to choose, and if so, creates and displays
     * a toast with the results of the game.
     */
    public void submit() {
        if ((rg1.getCheckedRadioButtonId() == -1) && (rg3.getCheckedRadioButtonId() == -1) &&
                (rg4.getCheckedRadioButtonId() == -1) && (rg5.getCheckedRadioButtonId() == -1) &&
                (rg6.getCheckedRadioButtonId() == -1) && (rg8.getCheckedRadioButtonId() == -1) &&
                (rg9.getCheckedRadioButtonId() == -1) && (rg10.getCheckedRadioButtonId() == -1) &&
                (noCheckBoxMarked(answer2_1, answer2_2, answer2_3, answer2_4) && (isEmpty()) )) {
            Toast.makeText(this, R.string.not_chosen1, Toast.LENGTH_SHORT).show();
            return;
        } else {


            // Check if the questions with CheckBoxes was all marked correctly
            if (!noCheckBoxMarked(answer2_1, answer2_2, answer2_3, answer2_4)){
                validateCorrectCheckBoxAnswers(answer2_1, answer2_2, answer2_4);
            }
            disableCheckBoxOptions(answer2_1, answer2_2, answer2_3, answer2_4);
            CheckQuiz7();



            String resultMessage = createQuizSummary(name, correct_score, incorrect_score, totalNumberOfQuestions);
            Toast.makeText(getApplicationContext(), resultMessage, Toast.LENGTH_LONG).show();

        }
    }

    private void validateCorrectCheckBoxAnswers(CheckBox... correctCheckBoxes) {
        boolean isAllCorrectAnswersMarked = true;
        for (CheckBox checkBox : correctCheckBoxes) {
            if (!checkBox.isChecked()) {
                isAllCorrectAnswersMarked = false;
            }
        }
        if (isAllCorrectAnswersMarked) {
            correct_score++;
        } else {
            incorrect_score++;
        }
    }

    private void disableCheckBoxOptions(CheckBox... checkBoxes) {
        for (CheckBox checkBox : checkBoxes) {
            checkBox.setEnabled(false);
        }
    }

    private boolean noCheckBoxMarked(CheckBox... checkBoxes) {
        int numberOfCheckBoxesNotChecked = 0;
        for (CheckBox checkBox : checkBoxes) {
            if (!checkBox.isChecked()) {
                numberOfCheckBoxesNotChecked++;
            }
        }
        return numberOfCheckBoxesNotChecked == checkBoxes.length;
    }
    // this method to check quiz7, be sure space is filled before the count and add correct or incorrect answer
    private void CheckQuiz7() {
        EditText et = (EditText) findViewById(R.id.q_fut_7edit_text);
        if (TextUtils.isEmpty(et.getText().toString())) {
            return;
        }
        if( checkQuestion7() ){
            correct_score++;
        } else {
            incorrect_score++;
        }
    }
    public boolean checkQuestion7() {
        EditText et = (EditText)findViewById(R.id.q_fut_7edit_text);
        et.setFocusable(false);

        return et.getText().toString().equals(Q7_ANSWER);

    }

    private boolean isEmpty() {
        EditText et = (EditText)findViewById(R.id.q_fut_7edit_text);
        return et.getText().toString().trim().length() == 0;
    }

    // This method creates Quiz summary.
    private String createQuizSummary(String name, int correct_score, int incorrect_score, int totalNumberOfQuestions) {
        resultMessage = getString(R.string.nameSummary, name);
        resultMessage += "\n" + getString(R.string.well_done);
        resultMessage += "\n" + getString(R.string.results);
        resultMessage += "\n" + getString(R.string.total_correct, correct_score, totalNumberOfQuestions);
        resultMessage += "\n" + getString(R.string.total_incorrect, incorrect_score, totalNumberOfQuestions);
        return resultMessage;
    }

    // This method is called by clicking on home screen button. It returns the user to the Main screen.
    public void mainActivity() {
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
        this.finish();
    }

    // This method is called by clicking on Share button. It allows to share your game results
    public void share() {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, resultMessage);
        intent.putExtra(Intent.EXTRA_SUBJECT, "Quiz results");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backtomain_button:
                mainActivity();
                this.finish();
                break;
            case R.id.submit_button:
                submit();
                submitButton.setEnabled(false);
                break;
            case R.id.share_button:
                share();
                break;
            default:
                //do nothing
        }
    }

    // This method is called by clicking on Back button. It returns the user to the Main screen.
    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }
}