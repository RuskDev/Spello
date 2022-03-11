package com.rdev.spello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
//        gameMaster = new GameMaster(findViewById(R.id.textTemp));

        qKey = findViewById(R.id.qKey);
        wKey = findViewById(R.id.wKey);
        eKey = findViewById(R.id.eKey);
        rKey = findViewById(R.id.rKey);
        tKey = findViewById(R.id.tKey);
        yKey = findViewById(R.id.yKey);
        uKey = findViewById(R.id.uKey);
        iKey = findViewById(R.id.iKey);
        oKey = findViewById(R.id.oKey);
        pKey = findViewById(R.id.pKey);
        aKey = findViewById(R.id.aKey);
        sKey = findViewById(R.id.sKey);
        dKey = findViewById(R.id.dKey);
        fKey = findViewById(R.id.fKey);
        gKey = findViewById(R.id.gKey);
        hKey = findViewById(R.id.hKey);
        jKey = findViewById(R.id.jKey);
        kKey = findViewById(R.id.kKey);
        lKey = findViewById(R.id.lKey);
        zKey = findViewById(R.id.zKey);
        xKey = findViewById(R.id.xKey);
        cKey = findViewById(R.id.cKey);
        vKey = findViewById(R.id.vKey);
        bKey = findViewById(R.id.bKey);
        nKey = findViewById(R.id.nKey);
        mKey = findViewById(R.id.mKey);


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
    }

    @Override
    public void onClick(View view) {
        Button buttonPressed = (Button) view;
        gameMaster.keyPressed((String) buttonPressed.getText());
    }
}
