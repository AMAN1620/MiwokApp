package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> word = new ArrayList<Words>();
        word.add(new Words("red", "weṭeṭṭi",R.drawable.color_red));
        word.add(new Words("green", "chokokki",R.drawable.color_green));
        word.add(new Words("brown", "ṭakaakki",R.drawable.color_brown));
        word.add(new Words("gray", "ṭopoppi",R.drawable.color_gray));
        word.add(new Words("black", "kululli",R.drawable.color_black));
        word.add(new Words("white", "kelelli",R.drawable.color_white));
        word.add(new Words("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        word.add(new Words("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));


        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordsAdapter adapter = new WordsAdapter(this,word,R.color.category_colors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
