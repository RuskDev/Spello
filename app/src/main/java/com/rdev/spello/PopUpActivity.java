package com.rdev.spello;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.rdev.spello.Utils.WordResponse;

public class PopUpActivity extends AppCompatActivity implements View.OnClickListener {

    private Button exitButton;
    private WordResponse wordResponse;
    private TextView wordText;
    private TextView definitionText;
    private TextView titleText;
    private Button whatsappButton;
    private String shareMessage;


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

        whatsappButton = findViewById(R.id.whatsappButton);
        whatsappButton.setOnClickListener(this);

        wordText = findViewById(R.id.wordDetails);
        definitionText = findViewById(R.id.definitionText);
        titleText = findViewById(R.id.titleText);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            WordResponse response =  (WordResponse) extras.get("word");
            wordResponse = response;
            win = (boolean) extras.get("Win?");
            shareMessage = (String) extras.get("shareMessage");

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
        if (view == whatsappButton) {
            shareToWhatsapp();
        } else {
            startActivity(new Intent(PopUpActivity.this, MainActivity.class));

        }
    }

    public void shareToWhatsapp(){
        Intent whatsappIntent = new Intent(Intent.ACTION_SEND);
        whatsappIntent.setType("text/plain");
        whatsappIntent.setPackage("com.whatsapp");
        whatsappIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        try {
            this.startActivity(whatsappIntent);
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "Whatsapp not installed", Toast.LENGTH_SHORT).show();
        }
    }
}
