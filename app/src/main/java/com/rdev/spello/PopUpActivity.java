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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_up_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * 0.8), (int) (height * 0.8));

        exitButton = findViewById(R.id.popUpExitButton);
        exitButton.setOnClickListener(this);

        wordText = findViewById(R.id.wordDetails);
        definitionText = findViewById(R.id.definitionText);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            WordResponse response =  (WordResponse) extras.get("word");
            wordResponse = response;

            setWordText(wordResponse.getWord());
            setDefinitionText(wordResponse.getDefinition());

        }
    }

    //Todo Add definition of word

    public void setWordText(String word){
        String s = "You got the word ";
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
