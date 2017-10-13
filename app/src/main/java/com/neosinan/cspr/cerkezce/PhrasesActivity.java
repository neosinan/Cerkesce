package com.neosinan.cspr.cerkezce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.kalıplar);
        setContentView(R.layout.activity_phrases);
        ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        numberArrayList.add(new Word("Günaydın", "Sveta "));
        numberArrayList.add(new Word("Nasılsın iyimisin", "Sıdev vuşıta?"));
        numberArrayList.add(new Word("İdare eder,olur.", "Vyezeğışt, huşt."));
        numberArrayList.add(new Word("Ben çerkesce öğreniyorum.", "Se adığabze zeseğaş."));
        numberArrayList.add(new Word("Adın ne?","Sıda vo pt'ser."));
        numberArrayList.add(new Word("Benim adım Ali.","Se t'ser Ali."));
        numberArrayList.add(new Word("iyi günler. ","vuimafe şu."));
        numberArrayList.add(new Word("Teşekkür ederim.","Vopsev"));
        numberArrayList.add(new Word("Tamam.","Değu."));
        numberArrayList.add(new Word("Kaç yaşındasın?", "Yiles thapşa vo vunıbjır?"));
        numberArrayList.add(new Word("Onsekiz yaşındayım.", "Se yiles pşıkuy sınıbj. ?"));
        numberArrayList.add(new Word("Bugün hava nasıl?","Nepe vor sıd feda?"));
        numberArrayList.add(new Word("Bugün hava iyi.","Nepe vor değu."));
        numberArrayList.add(new Word("Bugün hava kötü","Nepe vor deyi."));
        numberArrayList.add(new Word("Ben Bursada yaşıyorum","Se Bursa sışepsevu."));
        numberArrayList.add(new Word("Annenin adı ne?","Sıd vyane yt'ser?"));
        numberArrayList.add(new Word("Annemin adı Ayşe.","Syane yıt'ser Ayşe."));
        numberArrayList.add(new Word("Babanın adı ne?","Sıd vyate yıt'ser"));
        numberArrayList.add(new Word("Babamın adı Selahattin.","Syate yt'ser Selahattin"));


        WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);

        ListView listView = (ListView) findViewById(R.id.phrases);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//here we create OnClickListener for every item in list
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //MediaPlayer mediaPlayer = MediaPlayer.create(PhrasesActivity.this,R.raw.bir); //Here we create a mediaplayer object listen to word
                //mediaPlayer.start();
            }
        });

    }
}
