package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> words , int ColorResourceId) {
        super(context, 0, words);
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        mColorResourceId = ColorResourceId;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word wordTranslation = getItem(position);

        //sets background color
        View list = listItemView.findViewById(R.id.List_view);
        int color = ContextCompat.getColor(getContext() , mColorResourceId);
        list.setBackgroundColor(color);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.Miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        defaultTextView.setText(wordTranslation.getmiwok_translation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.Default_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        miwokTextView.setText(wordTranslation.getDefault_translation());

        ImageView iconView = ( ImageView) listItemView.findViewById(R.id.imageView);

        if (wordTranslation.isHas_Image())
            iconView.setImageResource(wordTranslation.getmImageResourceId());
        else
            iconView.setVisibility(View.GONE);

        //for audio file
//        ConstraintLayout list_item = (ConstraintLayout) listItemView.findViewById(R.id.List_view);
//        final MediaPlayer mediaPlayer = MediaPlayer.create( getContext() ,wordTranslation.getmAudioResourceId());
//        list_item.setOnClickListener( new View.OnClickListener(){
//
//            @Override
//            public void onClick(View view) {
//
//                mediaPlayer.start();
//            }
//        });
        // Return the whole list ilayoutem t (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
