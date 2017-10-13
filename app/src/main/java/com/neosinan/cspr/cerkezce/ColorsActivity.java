package com.neosinan.cspr.cerkezce;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        setTitle(R.string.renkler);
        ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        numberArrayList.add(new Word("Siyah", "Ş’utz’e",R.drawable.color_black));
        numberArrayList.add(new Word("Beyaz", "Fıjı ",R.drawable.color_white));
        numberArrayList.add(new Word("Kırmızı", "Ptlıj",R.drawable.color_red));
        numberArrayList.add(new Word("Kahverengi", "Haptlı",R.drawable.color_brown));
        numberArrayList.add(new Word("Yeşil", "Vıtzışo",R.drawable.color_green));
        numberArrayList.add(new Word("Mavi", "Şxuant",R.drawable.color_dusty_yellow));//ToDo(1) Düzgün Mavi renk eklenecek ve id si burada düzeltilecek.
        numberArrayList.add(new Word("Sarı", "ğojı",R.drawable.color_mustard_yellow));//ToDo(2) Düzgün Sarı renk eklenecek ve id si burada düzeltilecek.
        numberArrayList.add(new Word("Pembe", "Şptlı",R.drawable.color_red));//ToDo(3) Düzgün Pembe renk eklenecek ve id si burada düzeltilecek.

        WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        final ListView listView = (ListView) findViewById(R.id.colors);

        listView.setAdapter(itemsAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//here we create OnClickListener for every item in list
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //MediaPlayer mediaPlayer = MediaPlayer.create(ColorsActivity.this,R.raw.bir); //Here we create a mediaplayer object listen to word
                //mediaPlayer.start();
            }
        });

    }
}
