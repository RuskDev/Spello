package com.rdev.spello;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.rdev.spello.Utils.WordResponse;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private GameMaster gameMaster;

    private HashMap<String, Button> buttons = new HashMap<>();


    private RewardedAd mRewardedAd;
    private final String TAG = "GameActivity";

    private TextView showWordView;

    private Button qKey;
    private Button wKey;
    private Button eKey;
    private Button rKey;
    private Button tKey;
    private Button yKey;
    private Button uKey;
    private Button iKey;
    private Button oKey;
    private Button pKey;
    private Button aKey;
    private Button dKey;
    private Button sKey;
    private Button fKey;
    private Button gKey;
    private Button hKey;
    private Button jKey;
    private Button kKey;
    private Button lKey;
    private Button zKey;
    private Button xKey;
    private Button cKey;
    private Button bKey;
    private Button vKey;
    private Button nKey;
    private Button mKey;
    private Button backKey;
    private Button enterKey;
    private Button backButton;

    private ImageButton hintButton;

    private TextView a1;
    private TextView a2;
    private TextView a3;
    private TextView a4;
    private TextView a5;
    private TextView b1;
    private TextView b2;
    private TextView b3;
    private TextView b4;
    private TextView b5;
    private TextView c1;
    private TextView c2;
    private TextView c3;
    private TextView c4;
    private TextView c5;
    private TextView d1;
    private TextView d2;
    private TextView d3;
    private TextView d4;
    private TextView d5;
    private TextView e1;
    private TextView e2;
    private TextView e3;
    private TextView e4;
    private TextView e5;

    private TextView error;

    private ArrayList<TextView> letters = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        showWordView = (TextView) findViewById(R.id.showWord);
        gameMaster = new GameMaster(this, getApplicationContext());

        qKey = (Button) findViewById(R.id.qKey);
        wKey = (Button) findViewById(R.id.wKey);
        eKey = (Button) findViewById(R.id.eKey);
        rKey = (Button) findViewById(R.id.rKey);
        tKey = (Button) findViewById(R.id.tKey);
        yKey = (Button) findViewById(R.id.yKey);
        uKey = (Button) findViewById(R.id.uKey);
        iKey = (Button) findViewById(R.id.iKey);
        oKey = (Button) findViewById(R.id.oKey);
        pKey = (Button) findViewById(R.id.pKey);
        aKey = (Button) findViewById(R.id.aKey);
        sKey = (Button) findViewById(R.id.sKey);
        dKey = (Button) findViewById(R.id.dKey);
        fKey = (Button) findViewById(R.id.fKey);
        gKey = (Button) findViewById(R.id.gKey);
        hKey = (Button) findViewById(R.id.hKey);
        jKey = (Button) findViewById(R.id.jKey);
        kKey = (Button) findViewById(R.id.kKey);
        lKey = (Button) findViewById(R.id.lKey);
        zKey = (Button) findViewById(R.id.zKey);
        xKey = (Button) findViewById(R.id.xKey);
        cKey = (Button) findViewById(R.id.cKey);
        vKey = (Button) findViewById(R.id.vKey);
        bKey = (Button) findViewById(R.id.bKey);
        nKey = (Button) findViewById(R.id.nKey);
        mKey = (Button) findViewById(R.id.mKey);
        backKey = (Button) findViewById(R.id.bacKKey);
        enterKey = (Button) findViewById(R.id.enterKey);
        backButton = (Button) findViewById(R.id.gameBackButton);
        hintButton = (ImageButton) findViewById(R.id.hintButton);

        buttons.put("Q", qKey);
        buttons.put("W", wKey);
        buttons.put("E", eKey);
        buttons.put("R", rKey);
        buttons.put("T", tKey);
        buttons.put("Y", yKey);
        buttons.put("U", uKey);
        buttons.put("I", iKey);
        buttons.put("O", oKey);
        buttons.put("P", pKey);
        buttons.put("A", aKey);
        buttons.put("S", sKey);
        buttons.put("D", dKey);
        buttons.put("F", fKey);
        buttons.put("G", gKey);
        buttons.put("H", hKey);
        buttons.put("J", jKey);
        buttons.put("K", kKey);
        buttons.put("L", lKey);
        buttons.put("Z", zKey);
        buttons.put("X", xKey);
        buttons.put("C", cKey);
        buttons.put("V", vKey);
        buttons.put("B", bKey);
        buttons.put("N", nKey);
        buttons.put("M", mKey);


        a1 = findViewById(R.id.letterA1);
        a2 = findViewById(R.id.letterA2);
        a3 = findViewById(R.id.letterA3);
        a4 = findViewById(R.id.letterA4);
        a5 = findViewById(R.id.letterA5);
        b1 = findViewById(R.id.letterB1);
        b2 = findViewById(R.id.letterB2);
        b3 = findViewById(R.id.letterB3);
        b4 = findViewById(R.id.letterB4);
        b5 = findViewById(R.id.letterB5);
        c1 = findViewById(R.id.letterC1);
        c2 = findViewById(R.id.letterC2);
        c3 = findViewById(R.id.letterC3);
        c4 = findViewById(R.id.letterC4);
        c5 = findViewById(R.id.letterC5);
        d1 = findViewById(R.id.letterD1);
        d2 = findViewById(R.id.letterD2);
        d3 = findViewById(R.id.letterD3);
        d4 = findViewById(R.id.letterD4);
        d5 = findViewById(R.id.letterD5);
        e1 = findViewById(R.id.letterE1);
        e2 = findViewById(R.id.letterE2);
        e3 = findViewById(R.id.letterE3);
        e4 = findViewById(R.id.letterE4);
        e5 = findViewById(R.id.letterE5);

        error = findViewById(R.id.errorView);


        letters.add(a1);
        letters.add(a2);
        letters.add(a3);
        letters.add(a4);
        letters.add(a5);
        letters.add(b1);
        letters.add(b2);
        letters.add(b3);
        letters.add(b4);
        letters.add(b5);
        letters.add(c1);
        letters.add(c2);
        letters.add(c3);
        letters.add(c4);
        letters.add(c5);
        letters.add(d1);
        letters.add(d2);
        letters.add(d3);
        letters.add(d4);
        letters.add(d5);
        letters.add(e1);
        letters.add(e2);
        letters.add(e3);
        letters.add(e4);
        letters.add(e5);


        setClickListeners();

        loadAd();
    }

    private void setClickListeners(){
        qKey.setOnClickListener(this);
        wKey.setOnClickListener(this);
        eKey.setOnClickListener(this);
        rKey.setOnClickListener(this);
        tKey.setOnClickListener(this);
        yKey.setOnClickListener(this);
        uKey.setOnClickListener(this);
        iKey.setOnClickListener(this);
        oKey.setOnClickListener(this);
        pKey.setOnClickListener(this);
        aKey.setOnClickListener(this);
        sKey.setOnClickListener(this);
        dKey.setOnClickListener(this);
        fKey.setOnClickListener(this);
        gKey.setOnClickListener(this);
        hKey.setOnClickListener(this);
        jKey.setOnClickListener(this);
        kKey.setOnClickListener(this);
        lKey.setOnClickListener(this);
        zKey.setOnClickListener(this);
        xKey.setOnClickListener(this);
        cKey.setOnClickListener(this);
        vKey.setOnClickListener(this);
        bKey.setOnClickListener(this);
        nKey.setOnClickListener(this);
        mKey.setOnClickListener(this);
        backKey.setOnClickListener(this);
        enterKey.setOnClickListener(this);
        backButton.setOnClickListener(this);
        hintButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view != backButton) {
            if (view == hintButton){
                setFullScreenAdContent();
                showAd();
            } else {
                Button buttonPressed = (Button) view;
                gameMaster.keyPressed((String) buttonPressed.getText());
            }
        } else {
            Intent homeScreen = new Intent(this, MainActivity.class);
            startActivity(homeScreen);
        }
    }


    @SuppressLint("UseCompatLoadingForColorStateLists")
    public void colorKeyButton(String letter, int type){
        Button button = buttons.get(letter.toUpperCase(Locale.ROOT));
        if (type == 0){
            button.setBackgroundTintList(this.getResources().getColorStateList(R.color.wrongLetter));
        } else if (type == 1){
            button.setBackgroundTintList(this.getResources().getColorStateList(R.color.wrongPlace));
        } else if (type == 2){
            button.setBackgroundTintList(this.getResources().getColorStateList(R.color.rightLetter));
        }
    }

    public void setLetter(int pos, String l){
        letters.get(pos).setText(l);
    }

    public void colorLetter(int pos, int type){
        if (type == 0){
            letters.get(pos).setBackgroundColor(getResources().getColor(R.color.wrongLetter));
        } else if (type == 1){
            letters.get(pos).setBackgroundColor(getResources().getColor(R.color.wrongPlace));
        } else if (type == 2){
            letters.get(pos).setBackgroundColor(getResources().getColor(R.color.rightLetter));
        }
    }

    public void showMe(String word){
        showWordView.setText(word);
    }

    public void showEnd(WordResponse wordResponse, boolean win){
        SharedPreferences prefs = getSharedPreferences("Share", Context.MODE_PRIVATE );
        SharedPreferences.Editor editor = prefs.edit();
        if (win){
            editor.putInt("Correct", prefs.getInt("Correct",0) + 1 );
            editor.putInt("Streak", prefs.getInt("Streak",0) + 1 );
        } else {
            editor.putInt("Streak", 0 );
        }
        editor.putInt("Total", prefs.getInt("Total",0) + 1 );
        editor.commit();
        Intent i = new Intent(GameActivity.this, PopUpActivity.class);
        i.putExtra("word", (Serializable) wordResponse);
        i.putExtra("Win?", win);
        i.putExtra("shareMessage",  shareMessage());
         startActivity(i);
    }

    public void showError(String word){
        String s = word;
        s += " isn't a valid word";
        error.setText(s);

    }
    public void hideError(){
        error.setText("");
    }

    public void loadAd(){
        AdRequest adRequest = new AdRequest.Builder().build();

        RewardedAd.load(this, "ca-app-pub-3940256099942544/5224354917", //ca-app-pub-3940256099942544/5224354917 //ca-app-pub-5629324601829511/5092184584 (Mine)
                adRequest, new RewardedAdLoadCallback() {
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d(TAG, loadAdError.getMessage());
                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d(TAG, "Ad was loaded.");
                    }
                });

    }

    public void setFullScreenAdContent(){
        mRewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
            @Override
            public void onAdShowedFullScreenContent() {
                // Called when ad is shown.
                Log.d(TAG, "Ad was shown.");
            }

            @Override
            public void onAdFailedToShowFullScreenContent(AdError adError) {
                // Called when ad fails to show.
                Log.d(TAG, "Ad failed to show.");
            }

            @Override
            public void onAdDismissedFullScreenContent() {
                // Called when ad is dismissed.
                // Set the ad reference to null so you don't show the ad a second time.
                Log.d(TAG, "Ad was dismissed.");
//                mRewardedAd = null;
            }
        });

    }

    public void showAd(){
        if (mRewardedAd != null) {
            Activity activityContext = GameActivity.this;
            mRewardedAd.show(activityContext, rewardItem -> {
                // Handle the reward.
                Log.d(TAG, "The user earned the reward.");
                int rewardAmount = rewardItem.getAmount();
                String rewardType = rewardItem.getType();
                adReward();
            });
        } else {
            Log.d(TAG, "The rewarded ad wasn't ready yet.");
        }

    }

    public void adReward(){
        int row = gameMaster.getRow();
        for (int i = 0; i < 20; i++){
            int ran = (int) (Math.random() * 5 + 1);
            if (letters.get((5 * row) + ran).getText().equals("")){
                String[] word = gameMaster.getWord().split("");
                String letter = word[ran];
                String s = "Pssst....I heard " + letter + " is letter " + ran;
                error.setText(s);

            }
        }
    }

    private final String orangeSquare = "\uD83D\uDFE7";
    private final String greenSquare = "\uD83D\uDFE9";
    private final String blackSquare = "⬛";

    public String shareMessage(){
        String word = gameMaster.getWord();
        String[] letter = word.split("");
        String s = "I got the word. Can you do it better?\n";
        int i = 0;
        while (i < 5) {
            for (int j = 0; j < 5; j++) {
                String l = (String) letters.get((i*5) + j).getText();
                if (letter[j].equals(l)){
                    s += greenSquare;
                } else if (word.contains(l)){
                    s += orangeSquare;
                } else {
                    s += blackSquare;
                }
            }
            i++;
            s += "\n";
        }
        return  s;
    }

}
