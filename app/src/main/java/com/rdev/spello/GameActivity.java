package com.rdev.spello;

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

        letters.add(a1);
        letters.add(a2);
        letters.add(a3);
        letters.add(a4);
        letters.add(a5);


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
}
