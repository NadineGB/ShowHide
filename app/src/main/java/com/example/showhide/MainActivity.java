package com.example.showhide;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    SeekBar mySeekBar;

    public void show(View view) {

        txt.setVisibility(View.VISIBLE);
        mySeekBar.setVisibility(View.VISIBLE);

    }

    public void hide(View view) {

        txt.setVisibility(View.INVISIBLE);
        mySeekBar.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        mySeekBar = findViewById(R.id.mySeekbar);
    }
}
