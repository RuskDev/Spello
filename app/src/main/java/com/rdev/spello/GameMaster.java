package com.rdev.spello;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class GameMaster {
    TextView textView;
    ArrayList<String> wordGuess;

    public GameMaster(TextView textView) {
        this.textView = textView;
        wordGuess = new ArrayList<>();
    }

    public void keyPressed(String let){
        wordGuess.add(let);
    }

    public void updateView(){
        String word = "";
        for (String s : wordGuess){
        word += s;
        }
        textView.setText(word);
    }

}
