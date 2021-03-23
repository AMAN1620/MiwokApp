package com.example.languageapp;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> word = new ArrayList<Words>();
        word.add(new Words("father", "әpә",R.drawable.family_father));
        word.add(new Words("mother", "әṭa",R.drawable.family_mother));
        word.add(new Words("son", "angsi",R.drawable.family_son));
        word.add(new Words("daughter", "tune",R.drawable.family_daughter));
        word.add(new Words("older brother", "taachi",R.drawable.family_older_brother));
        word.add(new Words("younger brother", "chalitti",R.drawable.family_younger_brother));
        word.add(new Words("older sister", "teṭe",R.drawable.family_older_sister));
        word.add(new Words("younger sister", "kolliti",R.drawable.family_younger_sister));
        word.add(new Words("grandmother", "ama",R.drawable.family_grandmother));
        word.add(new Words("grandfather", "paapa",R.drawable.family_grandfather));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordsAdapter adapter = new WordsAdapter(this,word,R.color.category_family);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
