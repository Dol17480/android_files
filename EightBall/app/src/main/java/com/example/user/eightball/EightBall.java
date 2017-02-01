package com.example.user.eightball;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.InputStream;

/**
 * Created by user on 08/11/2016.
 */

public class EightBall extends AppCompatActivity {

    EditText mQuestionEditText;
    Button mShakeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("EightBall", "onCreate called");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestionEditText = (EditText)findViewById(R.id.question_text);
        mShakeButton = (Button)findViewById(R.id.shake_button);

        mShakeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Eightball", "Shake button clicked!");
                String question = mQuestionEditText.getText().toString();
                Log.d("Eightball", "The question asked was '" + question + "'");
//                mAnswerText.setText("Computer says 'No!'");
                InputStream input = getResources().openRawResource(R.raw.sandy_answers);
                Answerable answers = new TextFileAnswers(input);
                String randAnswer = answers.getAnswer();

                Intent intent = new Intent(EightBall.this, AnswerActivity.class);
                intent.putExtra("answer", randAnswer);
                startActivity(intent);
            }
        });
    }
}
