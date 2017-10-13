package com.neosinan.cspr.cerkezce;

import android.media.MediaPlayer;
import android.provider.UserDictionary;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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
        final ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        //ToDo(7) Bütün Sayı Resimleri bulunacak, eklenecek ve id leri burada düzeltilecek.
        numberArrayList.add(new Word("Bir","Zı",R.drawable.number_one, R.raw.bir));
        numberArrayList.add(new Word("İki","T’qu",R.drawable.number_two,R.raw.iki));
        numberArrayList.add(new Word("Üç","Şı",R.drawable.number_three,R.raw.uc));
        numberArrayList.add(new Word("Dört","P’lı",R.drawable.number_four,R.raw.dort));
        numberArrayList.add(new Word("Beş","Tfı",R.drawable.number_five,R.raw.bes));
        numberArrayList.add(new Word("Altı","hı",R.drawable.number_six,R.raw.alti));
        numberArrayList.add(new Word("Yedi","Blı",R.drawable.number_seven,R.raw.yedi));
        numberArrayList.add(new Word("Sekiz","Yı",R.drawable.number_eight,R.raw.sekiz));
        numberArrayList.add(new Word("Dokuz","Bğu",R.drawable.number_nine,R.raw.dokuz));
        numberArrayList.add(new Word("On","P'cı",R.drawable.number_ten,R.raw.on));
        numberArrayList.add(new Word("Onbir" ,"pşıkuz ",R.drawable.number_one,R.raw.onbir));
        numberArrayList.add(new Word("Onİki","pşıkut ",R.drawable.number_two,R.raw.oniki));
        numberArrayList.add(new Word("OnÜç","pşıkuş ",R.drawable.number_three,R.raw.onuc));
        numberArrayList.add(new Word("OnDört","pşıkupl ",R.drawable.number_four,R.raw.ondort));
        numberArrayList.add(new Word("OnBeş","pşıkutf ",R.drawable.number_five,R.raw.onbes));
        numberArrayList.add(new Word("OnAltı","pşıkuhı ",R.drawable.number_six,R.raw.onalti));
        numberArrayList.add(new Word("OnYedi","pşıkubl",R.drawable.number_seven,R.raw.onyedi));
        numberArrayList.add(new Word("OnSekiz","pşıkuyi",R.drawable.number_eight,R.raw.onsekiz));
        numberArrayList.add(new Word("OnDokuz","pşıkubğu",R.drawable.number_nine,R.raw.ondokuz));
        numberArrayList.add(new Word("Yirdmi","toçı ",R.drawable.number_ten,R.raw.yirmi));

       WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        final ListView listView = (ListView) findViewById(R.id.rootView);

       listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//here we create OnClickListener for every item in list
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word words = numberArrayList.get(i);//This is how find position of listview item
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity.this,words.getmCerkezPronounciation()); //Here we create a mediaplayer object listen to word
                mediaPlayer.start();
            }
        });

    }
}
