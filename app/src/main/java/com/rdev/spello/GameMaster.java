package com.rdev.spello;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class GameMaster {
    ArrayList<String> wordGuess = new ArrayList<>();
    ArrayList<String> answer = new ArrayList<>();
    int row = 0;
    GameActivity gameActivity;
    int letter = 0;

    public GameMaster(GameActivity gameActivity) {
        this.gameActivity = gameActivity;
        for (int i = 0; i < 5; i++){
            wordGuess.add("");
            answer.add("");
        }
        setAnswer("teams");
    }

    public void keyPressed(String let){
        if (let.length() == 1) {
            if (letter < 5) {
                wordGuess.set(letter, let);
                letter++;
                updateView();
            }
        } else if (let.equals("<-")){
            if (letter > 0){
                letter--;
                wordGuess.set(letter, " ");
                updateView();
            }
        } else {
            enterPressed();
        }
    }

    public void enterPressed(){
        if (letter == 5){
            for (int i = 0; i < 5; i++){
                if (answer.get(i).equals(wordGuess.get(i))){
                    gameActivity.colorLetter((row * 5) + i, 2);
                } else if (answer.contains(wordGuess.get(i))){
                    gameActivity.colorLetter((row * 5) + i, 1);
                } else {
                    gameActivity.colorLetter((row * 5) + i, 0);
                }
            }
        }
    }

    public void updateView(){
        String word = "";
        int count = 0;
        for (String s : wordGuess){
        word += s;
        gameActivity.setLetter(count, s);
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

}
