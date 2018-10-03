package edu.temple.paletteactivity;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import static android.graphics.Color.parseColor;

public class CustomAdapter extends BaseAdapter {

    Context context; // which means the listview, spinner view which we are working and adapting on. so the custom adapter knows what we are working on
    int count;
    String[] Colorstrings = {"red", "blue", "magenta", "green", "yellow"};

    //create constructor;


    public CustomAdapter(Context context, int count) {
        this.context = context;
        this.count = Colorstrings.length;
    }

    public CustomAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return Colorstrings.length;
    }

    @Override
    public Object getItem(int i) {
        return Colorstrings[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        TextView textColor = new TextView(context);

        textColor.setText(Colorstrings[i]);

        textColor.setBackgroundColor(Color.parseColor(Colorstrings[i]));



        return textColor;
    }
}
