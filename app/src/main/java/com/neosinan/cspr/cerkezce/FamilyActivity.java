package com.neosinan.cspr.cerkezce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        numberArrayList.add(new Word("Anne", "nan, nane, sinane "));
        numberArrayList.add(new Word("Baba", "tı, siyate "));
        numberArrayList.add(new Word("Eş (Bayan)", "şuzı "));
        numberArrayList.add(new Word("Eş (Bay)", "l'ı"));
        numberArrayList.add(new Word("kızkardeş", "şiph'u nahıç, sişuph'u nahıç "));
        numberArrayList.add(new Word("erkek kardeş", "şınahıç, sişnahıç "));
        numberArrayList.add(new Word("kız çocuğu", "pşaşe,pşaşejiy"));
        numberArrayList.add(new Word("erkek evlat", "ko, şavo, siko, sişavo"));
        numberArrayList.add(new Word("akraba", "ahıl,vunekoş,sivnekoş "));
        numberArrayList.add(new Word("Amca", "tım yiş,siyateş "));
        numberArrayList.add(new Word("hala", "yate şıphu, siyateşiphu "));
        numberArrayList.add(new Word("halakızı", "yateşiphum yiphu, siyateşiphum yiphu "));
        numberArrayList.add(new Word("halaoğlu", "yateşiphum yiko, siyateşiphum yiko "));
        numberArrayList.add(new Word("bebek", "sabiy "));
        numberArrayList.add(new Word("Çocuk", "çale, siçale"));

        WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        ListView listView = (ListView) findViewById(R.id.family);

        listView.setAdapter(itemsAdapter);
    }
}
