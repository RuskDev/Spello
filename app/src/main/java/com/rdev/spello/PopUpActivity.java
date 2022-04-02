package com.rdev.spello;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rdev.spello.Utils.WordResponse;

public class PopUpActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitButton;
    private WordResponse wordResponse;
    private TextView wordText;
    private TextView definitionText;
    private TextView titleText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        boolean win;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));

        exitButton = findViewById(R.id.popUpExitButton);
        exitButton.setOnClickListener(this);

        wordText = findViewById(R.id.wordDetails);
        definitionText = findViewById(R.id.definitionText);
        titleText = findViewById(R.id.titleText);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            WordResponse response =  (WordResponse) extras.get("word");
            wordResponse = response;
            win = (boolean) extras.get("Win?");

            setDefinitionText(wordResponse.getDefinition());

            if (win){
                setTitle("Congratulations");
                setWordText(wordResponse.getWord(), true);
            } else {
                setTitle("Unlucky");
                setWordText(wordResponse.getWord(), false);
            }

        }
    }

    public void setTitle(String word){
        titleText.setText(word);
    }

    public void setWordText(String word, boolean win){
        String s;
        if (win){
            s = "You got the word ";
        } else {
            s = "The word was ";
        }
        s += word;
        wordText.setText(s);
    }

    public void setDefinitionText(String definition) {
        String s = "Definition : ";
        s += definition;
        definitionText.setText(s);
    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(PopUpActivity.this, MainActivity.class));
    }
}
