package com.example.languageapp;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> word = new ArrayList<Words>();
        word.add(new Words("Where are you going?", "minto wuksus"));
        word.add(new Words("What is your name?", "tinnә oyaase'nә"));
        word.add(new Words("My name is...", "oyaaset..."));
        word.add(new Words("How are you feeling?", "michәksәs?"));
        word.add(new Words("I’m feeling good.", "kuchi achit"));
        word.add(new Words("Are you coming?", "әәnәs'aa?"));
        word.add(new Words("Yes, I’m coming.", "hәә’ әәnәm"));
        word.add(new Words("I’m coming.", "әәnәm"));
        word.add(new Words("Let’s go.", "yoowutis"));
        word.add(new Words("Come here.", "әnni'nem"));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordsAdapter adapter = new WordsAdapter(this,word,R.color.category_phrases);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
