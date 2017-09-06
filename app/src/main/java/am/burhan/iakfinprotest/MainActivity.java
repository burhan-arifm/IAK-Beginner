package am.burhan.iakfinprotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    EditText answer1;
    EditText answer4;
    RadioButton answer2_1;
    RadioButton answer2_2;
    RadioButton answer2_3;
    RadioButton answer5_1;
    RadioButton answer5_2;
    CheckBox answer3_1;
    CheckBox answer3_2;
    CheckBox answer3_3;
    Button submit_button;
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String[] jawaban1 = {""};
        final String[] jawaban2 = {""};
        final String[] jawaban3 = {""};
        final String[] jawaban4 = {""};
        final String[] jawaban5 = {""};
        final String ans1 = "Ya";
        final String ans2 = "Pagi";
        final String ans3 = "Mendaratnya pas hujan ih";
        final String ans4 = "Hetty Koesendang";
        final String ans5 = "Fakta";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        answer1 = (EditText) findViewById(R.id.answer1);
        answer4 = (EditText) findViewById(R.id.answer4);
        answer2_1 = (RadioButton) findViewById(R.id.answer2_1);
        answer2_2 = (RadioButton) findViewById(R.id.answer2_2);
        answer2_3 = (RadioButton) findViewById(R.id.answer2_3);
        answer5_1 = (RadioButton) findViewById(R.id.answer5_1);
        answer5_2 = (RadioButton) findViewById(R.id.answer5_2);
        answer3_1 = (CheckBox) findViewById(R.id.answer3_1);
        answer3_2 = (CheckBox) findViewById(R.id.answer3_2);
        answer3_3 = (CheckBox) findViewById(R.id.answer3_3);
        submit_button = (Button) findViewById(R.id.submit_btn);

        getWindow().setSoftInputMode(
                WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN
        );
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                jawaban1[0] = answer1.getText().toString();
                if (answer2_1.isChecked()) {
                    jawaban2[0] = answer2_1.getText().toString();
                } else if (answer2_2.isChecked()) {
                    jawaban2[0] = answer2_2.getText().toString();
                } else if (answer2_3.isChecked()) {
                    jawaban2[0] = answer2_3.getText().toString();
                }
                if (answer3_1.isChecked()) {
                    jawaban3[0] = answer3_1.getText().toString();
                }
                if (answer3_2.isChecked()) {
                    if (jawaban3[0].equals("")) {
                        jawaban3[0] = answer3_2.getText().toString();
                    } else {
                        jawaban3[0] += ", " + answer3_2.getText().toString();
                    }
                }
                if (answer3_3.isChecked()) {
                    if (jawaban3[0].equals("")) {
                        jawaban3[0] = answer3_3.getText().toString();
                    } else {
                        jawaban3[0] += ", " + answer3_3.getText().toString();
                    }
                }
                jawaban4[0] = answer4.getText().toString();
                if (answer5_1.isChecked()) {
                    jawaban5[0] = answer5_1.getText().toString();
                } else if (answer2_2.isChecked()) {
                    jawaban5[0] = answer5_2.getText().toString();
                }
                if (jawaban1[0].equalsIgnoreCase(ans1)) {
                    score += 20;
                }
                if (jawaban2[0].equalsIgnoreCase(ans2)) {
                    score += 20;
                }
                if (jawaban3[0].equalsIgnoreCase(ans3)) {
                    score += 20;
                }
                if (jawaban4[0].equalsIgnoreCase(ans4)) {
                    score += 20;
                }
                if (jawaban5[0].equalsIgnoreCase(ans5)) {
                    score += 20;
                }
                Toast toast = Toast.makeText(getApplicationContext(), "Score = " + score, Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
