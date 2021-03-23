package com.example.languageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;


public class NumbersActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Words> word = new ArrayList<Words>();
        word.add(new Words("one", "lutti",R.drawable.number_one));
        word.add(new Words("two", "otiiko",R.drawable.number_two));
        word.add(new Words("three", "tolookosu",R.drawable.number_three));
        word.add(new Words("four", "oyyisa",R.drawable.number_four));
        word.add(new Words("five", "massokka",R.drawable.number_five));
        word.add(new Words("six", "temmokka",R.drawable.number_six));
        word.add(new Words("seven", "kenekaku",R.drawable.number_seven));
        word.add(new Words("eight", "kawinta",R.drawable.number_eight));
        word.add(new Words("nine", "wo’e",R.drawable.number_nine));
        word.add(new Words("ten", "na’aacha",R.drawable.number_ten));

        // Create an {@link ArrayAdapter}, whose data source is a list of Strings. The
        // adapter knows how to create layouts for each item in the list, using the
        // simple_list_item_1.xml layout resource defined in the Android framework.
        // This list item layout contains a single {@link TextView}, which the adapter will set to
        // display a single word.
        WordsAdapter adapter = new WordsAdapter(this,word,R.color.category_numbers);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}