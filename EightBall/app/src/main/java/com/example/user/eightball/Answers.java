package com.example.user.eightball;
import java.util.ArrayList;
import java.util.Random;


/**
 * Created by user on 07/11/2016.
 */

public class Answers implements Answerable {

    protected ArrayList<String> mAnswers;

    public Answers() {
        mAnswers = new ArrayList<String>();
        setUpAnswers();
    }

    public Answers(ArrayList<String> existingAnswers) {
        mAnswers = new ArrayList<String>(existingAnswers);
    }

    private void setUpAnswers(){
        String[] answers = {
                "Yes",
                "No",
                "Maybe",
                "I don't know",
                "Can you repeat the question?"
        };
        for (String answer : answers) {
            add(answer);
        }
    }

    public ArrayList<String> getAnswers(){
        return new ArrayList<String>(mAnswers);
    }

    public void add(String newAnswer) {
        mAnswers.add(newAnswer);
    }

    public int getLength() {
        return mAnswers.size();
    }

    public String getAnswerAtIndex(int index) {
        return mAnswers.get(index);
    }

    public String getAnswer() {
        Random rand = new Random();
        int listSize = getLength();
        int randomIndex = rand.nextInt(listSize);
        String answer = getAnswerAtIndex(randomIndex);
        return answer;
    }
}
