package com.rdev.spello;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private GameMaster gameMaster;

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

    private ArrayList<TextView> letters = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        gameMaster = new GameMaster(this);

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
    }

    @Override
    public void onClick(View view) {
        Button buttonPressed = (Button) view;
        gameMaster.keyPressed((String) buttonPressed.getText());
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

    public void showEnd(){
         startActivity(new Intent(GameActivity.this, PopUpActivity.class));
    }
}
