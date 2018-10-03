package edu.temple.paletteactivity;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Canvas2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas2);

        String color = getIntent().getStringExtra("colors");

        View ll = findViewById(R.id.layout);

        ll.setBackgroundColor(Color.parseColor(color));
    }
}
