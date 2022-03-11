package com.rdev.spello;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class GameMaster {
    ArrayList<String> wordGuess = new ArrayList<>();
    ArrayList<String> answer;
    int row = 0;
    GameActivity gameActivity;
    int letter = 0;

    public GameMaster(GameActivity gameActivity) {
        this.gameActivity = gameActivity;
        for (int i = 0; i < 5; i++){
            wordGuess.add("");
        }
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

}
