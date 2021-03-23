package com.example.languageapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class WordsAdapter extends ArrayAdapter<Words> {
    private int mColorResourceId;

    public WordsAdapter(Activity context, ArrayList<Words> Words,int colorResourceId){

        super(context,0, Words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        //Get the data item associated with the specified position in the data set.
        Words my_word= (Words) getItem(position);

        // finding miwok_text_View using FindViewByID and setting specified  values using my_word instance
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(my_word.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(my_word.getDefaultTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);

        if(my_word.hasImage()){
            imageView.setImageResource(my_word.getImageResourceId());
            //make imageView Visible
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            //make the image invisible
            imageView.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}

