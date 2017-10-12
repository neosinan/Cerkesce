package com.neosinan.cspr.cerkezce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.aile);
        setContentView(R.layout.activity_family);
        ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        numberArrayList.add(new Word("Anne", "nan, nane, sinane ",R.drawable.family_mother));
        numberArrayList.add(new Word("Baba", "tı, siyate ",R.drawable.family_father));
        numberArrayList.add(new Word("Eş (Bayan)", "şuzı ",R.drawable.family_mother));
        numberArrayList.add(new Word("Eş (Bay)", "l'ı",R.drawable.family_mother));
        numberArrayList.add(new Word("kızkardeş", "şiph'u nahıç, sişuph'u nahıç ",R.drawable.family_younger_sister));
        numberArrayList.add(new Word("erkek kardeş", "şınahıç, sişnahıç ",R.drawable.family_younger_brother));
        numberArrayList.add(new Word("kız çocuğu", "pşaşe,pşaşejiy",R.drawable.family_daughter));
        numberArrayList.add(new Word("erkek evlat", "ko, şavo, siko, sişavo",R.drawable.family_son));
        numberArrayList.add(new Word("akraba", "ahıl,vunekoş,sivnekoş ",R.drawable.family_father));//ToDo(4) Aile resmi eklenecek ve id si burada düzeltilecek.
        numberArrayList.add(new Word("Amca", "tım yiş,siyateş ",R.drawable.family_father));
        numberArrayList.add(new Word("hala", "yate şıphu, siyateşiphu ",R.drawable.family_mother));
        numberArrayList.add(new Word("halakızı", "yateşiphum yiphu, siyateşiphum yiphu ",R.drawable.family_older_sister));
        numberArrayList.add(new Word("halaoğlu", "yateşiphum yiko, siyateşiphum yiko ",R.drawable.family_older_brother));
        numberArrayList.add(new Word("bebek", "sabiy ",R.drawable.family_younger_sister));//ToDo(5) bebek resmi ve id si burada düzeltilecek.
        numberArrayList.add(new Word("Çocuk", "çale, siçale",R.drawable.family_daughter));

        WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        ListView listView = (ListView) findViewById(R.id.family);

        listView.setAdapter(itemsAdapter);
    }
}
