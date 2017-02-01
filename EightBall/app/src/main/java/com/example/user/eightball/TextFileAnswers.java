package com.example.user.eightball;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by user on 09/11/2016.
 */

public class TextFileAnswers implements Answerable {

    private ArrayList<String> mAnswers;
    private Scanner mFileReader;

    public TextFileAnswers(InputStream file) {
        mAnswers = new ArrayList<String>();
        mFileReader = new Scanner(file);
        setUpAnswers();
    }

    private void setUpAnswers() {
        boolean moreLinesToRead = mFileReader.hasNextLine();

        while (moreLinesToRead) {
            String lineOfText = mFileReader.nextLine();
            mAnswers.add(lineOfText);

            moreLinesToRead = mFileReader.hasNextLine();
        }

    }

    public String getAnswer() {
        Random random = new Random();
        int arrayLength = mAnswers.size();
        int randomIndex = random.nextInt(arrayLength);
        String randomAnswer = mAnswers.get(randomIndex);
        return randomAnswer;
    }
}
