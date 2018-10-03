package edu.temple.paletteactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        final Spinner customspinner = findViewById(R.id.spinner);

       // final ListView customlistview = findViewById(R.id.listView);
        //final String[] Colorstrings = {"RED", "BLUE", "MAGENTA", "ORANGE", "GREEN", "YELLOW"};


        customspinner.setAdapter(new CustomAdapter(this));
        //customlistview.setAdapter(new CustomAdapter(this));


        customspinner.setSelection(0,false);


        customspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(PaletteActivity.this, Canvas2Activity.class);
                intent.putExtra("colors", adapterView.getItemAtPosition(i).toString());
                startActivity(intent);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
