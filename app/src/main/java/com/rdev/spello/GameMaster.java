package com.rdev.spello;

import android.content.Context;

import com.rdev.spello.Utils.WordLibrary;
import com.rdev.spello.Utils.WordResponse;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Locale;

public class GameMaster {
    private Context context;
    private ArrayList<String> wordGuess = new ArrayList<>();
    private ArrayList<String> answer = new ArrayList<>();
    private WordLibrary wordLibrary;
    private GameActivity gameActivity;
    private WordResponse wordResponse;

    private int row = 0;
    private int letter = 0;
    private int correct = 0;
    private boolean gameOver = false;

    public GameMaster(GameActivity gameActivity, Context context) {
        this.context = context;
        wordLibrary = new WordLibrary(context);
        this.gameActivity = gameActivity;
        for (int i = 0; i < 5; i++){
            wordGuess.add("");
            answer.add("");
        }
        wordResponse = wordLibrary.getRandomWord();
        setAnswer(wordResponse.getWord());
        gameActivity.showMe(wordResponse.getWord());
    }

    public void keyPressed(String let){
        if (!gameOver) {
            if (let.length() == 1) {
                if (letter < 5) {
                    wordGuess.set(letter, let);
                    letter++;
                    updateView();
                }
            } else if (let.equals("<-")) {
                if (letter > 0) {
                    letter--;
                    wordGuess.set(letter, " ");
                    updateView();
                }
            } else {
                enterPressed();
            }
        }
    }

    public void enterPressed(){
        gameActivity.hideError();
        if (letter == 5 & row < 4){
            String w = "";
            for (String s : wordGuess){
                w += s;
            }
            if (wordLibrary.isWord(w)) {
                for (int i = 0; i < 5; i++) {
                    if (answer.get(i).equals(wordGuess.get(i))) {
                        gameActivity.colorLetter((row * 5) + i, 2);
                        gameActivity.colorKeyButton(wordGuess.get(i), 2);
                        correct++;
                    } else if (answer.contains(wordGuess.get(i))) {
                        gameActivity.colorLetter((row * 5) + i, 1);
                        gameActivity.colorKeyButton(wordGuess.get(i), 1);
                    } else {
                        gameActivity.colorLetter((row * 5) + i, 0);
                        gameActivity.colorKeyButton(wordGuess.get(i), 0);
                    }
                }
                if (correct == 5) {
                    gameOver = true;
                    endGame(true);
                }
                row++;
                correct = 0;
                letter = 0;
                for (int i = 0; i < 5; i++) {
                    wordGuess.set(i, " ");
                }
            } else {
                gameActivity.showError(w);
            }
        } else if (row == 4){
            gameOver = true;
            endGame(false);
        }
    }

    public void updateView(){
        String word = "";
        int count = 0;
        for (String s : wordGuess){
        word += s;
        gameActivity.setLetter((row * 5) + count, s);
        count++;
        }
    }

    public void setAnswer(String word){
        if (word.length() == 5){
            String[] splitWord = word.toUpperCase(Locale.ROOT).split("");
            for (int i = 0; i < 5; i++){
                //Dont understand why but it adds an extra empty entry to start of splitWord
                answer.set(i, splitWord[i + 1]);
            }
        }
    }

    public void endGame(Boolean win){
        gameActivity.showEnd(wordResponse, win);
    }

    public String getWord(){
        return wordResponse.getWord();
    }

    public String getDef(){
        return wordResponse.getDefinition();
    }
}
