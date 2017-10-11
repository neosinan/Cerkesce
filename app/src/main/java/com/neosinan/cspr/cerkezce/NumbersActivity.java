package com.neosinan.cspr.cerkezce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.sayılar);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        numberArrayList.add(new Word("Bir","Tzı"));
        numberArrayList.add(new Word("İki","T’qu"));
        numberArrayList.add(new Word("Üç","Şı"));
        numberArrayList.add(new Word("Dört","P’lı"));
        numberArrayList.add(new Word("Beş","Tfı"));
        numberArrayList.add(new Word("Altı","hı"));
        numberArrayList.add(new Word("Yedi","Blı"));
        numberArrayList.add(new Word("Sekiz","Yı"));
        numberArrayList.add(new Word("Dokuz","Bğu"));
        numberArrayList.add(new Word("On","P'cı"));


       WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        ListView listView = (ListView) findViewById(R.id.rootView);

       listView.setAdapter(itemsAdapter);

    }
}
