package com.rdev.spello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private GameMaster gameMaster;

    private Button qKey;
    Button wKey;
    Button eKey;
    Button rKey;
    Button tKey;
    Button yKey;
    Button uKey;
    Button iKey;
    Button oKey;
    Button pKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        gameMaster = new GameMaster(findViewById(R.id.textTemp));

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
    }

    @Override
    public void onClick(View view) {
        if (qKey.equals(view)) {
            gameMaster.keyPressed("Q");
        } else if (wKey.equals(view)) {
            gameMaster.keyPressed("W");
        } else if (eKey.equals(view)) {
            gameMaster.keyPressed("E");
        } else if (rKey.equals(view)) {
            gameMaster.keyPressed("R");
        } else if (tKey.equals(view)) {
            gameMaster.keyPressed("T");
        } else if (yKey.equals(view)) {
            gameMaster.keyPressed("Y");
        } else if (uKey.equals(view)) {
            gameMaster.keyPressed("U");
        } else if (iKey.equals(view)){
            gameMaster.keyPressed("I");
        } else if (oKey.equals(view)){
            gameMaster.keyPressed("O");
        } else if (pKey.equals(view)){
            gameMaster.keyPressed("P");
        }
        else {
            throw new IllegalStateException("Unexpected value: " + view);
        }
    }
}
