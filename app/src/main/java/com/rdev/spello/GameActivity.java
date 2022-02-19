package com.rdev.spello;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GameActivity extends AppCompatActivity implements View.OnClickListener {

    private GameMaster gameMaster;


    private Button qKey = (Button) findViewById(R.id.qKey);
    Button wKey = (Button) findViewById(R.id.wKey);
    Button eKey = (Button) findViewById(R.id.eKey);
    Button rKey = (Button) findViewById(R.id.rKey);
    Button tKey = (Button) findViewById(R.id.tKey);
    Button yKey = (Button) findViewById(R.id.yKey);
    Button uKey = (Button) findViewById(R.id.uKey);
    Button iKey = (Button) findViewById(R.id.iKey);
    Button oKey = (Button) findViewById(R.id.oKey);
    Button pKey = (Button) findViewById(R.id.pKey);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);

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
        switch (view){
            case qKey:
                gameMaster.keyPressed("Q");
                break;
            case wKey:
                gameMaster.keyPressed("W");
                break;
            case eKey:
                gameMaster.keyPressed("E");
                break;
            case rKey:
                gameMaster.keyPressed("R");
                break;
            case tKey:
                gameMaster.keyPressed("T");
                break;
            case yKey:
                gameMaster.keyPressed("Y");
                break;
            case uKey:
                gameMaster.keyPressed("U");
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + view);
        }
    }
}
