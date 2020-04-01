package com.example.showhide;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button hide;
    Button show;

    public void show(View view) {
        txt = findViewById(R.id.textView);
        txt.setVisibility(View.VISIBLE);

    }

    public void hide(View view) {
        txt = findViewById(R.id.textView);
        txt.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
