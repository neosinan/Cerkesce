package com.neosinan.cspr.cerkezce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        setTitle(R.string.sayılar);
        ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        numberArrayList.add(new Word("Siyah", "Ş’utz’e"));
        numberArrayList.add(new Word("Beyaz", "Fıjı "));
        numberArrayList.add(new Word("Kırmızı", "Ptlıj"));
        numberArrayList.add(new Word("Kahverengi", "Haptlı"));
        numberArrayList.add(new Word("Yeşil", "Vıtzışo"));
        numberArrayList.add(new Word("Mavi", "Şxuant"));
        numberArrayList.add(new Word("Sarı", "ğojı"));
        numberArrayList.add(new Word("Pembe", "Şptlı"));

        WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        ListView listView = (ListView) findViewById(R.id.colors);

        listView.setAdapter(itemsAdapter);

    }
}
