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
        //ToDo(7) Bütün Sayı Resimleri bulunacak, eklenecek ve id leri burada düzeltilecek.
        numberArrayList.add(new Word("Bir","Tzı",R.drawable.number_one));
        numberArrayList.add(new Word("İki","T’qu",R.drawable.number_two));
        numberArrayList.add(new Word("Üç","Şı",R.drawable.number_three));
        numberArrayList.add(new Word("Dört","P’lı",R.drawable.number_four));
        numberArrayList.add(new Word("Beş","Tfı",R.drawable.number_five));
        numberArrayList.add(new Word("Altı","hı",R.drawable.number_six));
        numberArrayList.add(new Word("Yedi","Blı",R.drawable.number_seven));
        numberArrayList.add(new Word("Sekiz","Yı",R.drawable.number_eight));
        numberArrayList.add(new Word("Dokuz","Bğu",R.drawable.number_nine));
        numberArrayList.add(new Word("On","P'cı",R.drawable.number_ten));


       WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        ListView listView = (ListView) findViewById(R.id.rootView);

       listView.setAdapter(itemsAdapter);

    }
}
