package com.rdev.spello;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PopUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button exitButton;


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
    }


    @Override
    public void onClick(View view) {
        startActivity(new Intent(PopUpActivity.this, MainActivity.class));
    }
}
