package com.neosinan.cspr.cerkezce;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by cspr on 11.10.2017.
 */

public class WordAdaptor extends ArrayAdapter<Word> {
    private static final String LOG_TAG = WordAdaptor.class.getSimpleName();//Hangi classın adaptörü olduğunu söylemeyi UNUTMA


        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
    public WordAdaptor(NumbersActivity numbersActivity, ArrayList<Word> numberArrayList) {
        super(numbersActivity,0,numberArrayList);
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        //Word currentAndroidFlavor = getItem(position);

        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.cerkez_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getCerkezceTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.language_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getDefaultTranslation());
        return listItemView;
    }
}
