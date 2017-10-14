package com.neosinan.cspr.cerkezce;

import android.content.Context;
import android.media.AudioManager;
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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static android.media.AudioManager.AUDIOFOCUS_GAIN;
import static android.media.AudioManager.AUDIOFOCUS_LOSS;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT;
import static android.media.AudioManager.AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK;

public class NumbersActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    int pausedTime;
    int position=0;
    AudioManager mAudioManager;

    //Burada
    AudioManager.OnAudioFocusChangeListener mListener = new AudioManager.OnAudioFocusChangeListener(){
        @Override
        public void onAudioFocusChange(int focusChange) {
            if (focusChange == AUDIOFOCUS_LOSS_TRANSIENT || focusChange == AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK ){
                mediaOnPause();
            }else if (focusChange == AUDIOFOCUS_GAIN){
                mediaOnStart();
            }else if (focusChange == AUDIOFOCUS_LOSS){
                releaseMediaplayer();
            }
        }
    };
    //Creating One OnComplationListiner stop us creating unncessary number of instances of this object We use this every time to release mediaplayer
    private MediaPlayer.OnCompletionListener onCompletionListener =new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer!=null){
                try {
                   releaseMediaplayer();
                }catch (Exception e){}
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.sayılar);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Word> numberArrayList = new ArrayList<Word>();

        //Here We add new Word to our Word Array
        //ToDo(7) Bütün Sayı Resimleri bulunacak, eklenecek ve id leri burada düzeltilecek.
        numberArrayList.add(new Word("Bir","Zı",R.drawable.number_one, R.raw.bir,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("İki","T’qu",R.drawable.number_two,R.raw.iki,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Üç","Şı",R.drawable.number_three,R.raw.uc,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Dört","P’lı",R.drawable.number_four,R.raw.dort,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Beş","Tfı",R.drawable.number_five,R.raw.bes,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Altı","hı",R.drawable.number_six,R.raw.alti,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Yedi","Blı",R.drawable.number_seven,R.raw.yedi,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Sekiz","Yı",R.drawable.number_eight,R.raw.sekiz,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Dokuz","Bğu",R.drawable.number_nine,R.raw.dokuz,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("On","P'cı",R.drawable.number_ten,R.raw.on,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Onbir" ,"pşıkuz ",R.drawable.number_eleven,R.raw.onbir,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Onİki","pşıkut ",R.drawable.number_twelve,R.raw.oniki,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnÜç","pşıkuş ",R.drawable.number_thirteen,R.raw.onuc,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnDört","pşıkupl ",R.drawable.number_fourteen,R.raw.ondort,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnBeş","pşıkutf ",R.drawable.number_fifteen,R.raw.onbes,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnAltı","pşıkuhı ",R.drawable.number_sixteen,R.raw.onalti,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnYedi","pşıkubl",R.drawable.number_seventeen,R.raw.onyedi,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnSekiz","pşıkuyi",R.drawable.number_eighteen,R.raw.onsekiz,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("OnDokuz","pşıkubğu",R.drawable.number_nineteen,R.raw.ondokuz,R.drawable.ic_play_arrow_black_24dp));
        numberArrayList.add(new Word("Yirmi","toçı ",R.drawable.number_twenty,R.raw.yirmi,R.drawable.ic_play_arrow_black_24dp));

       WordAdaptor itemsAdapter = new WordAdaptor(this, numberArrayList);
       final ListView listView = (ListView) findViewById(R.id.rootView);
       listView.setAdapter(itemsAdapter);

        //Create and setup audiomanager to request AudioFocus
        mAudioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);//

       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {//here we create OnClickListener for every item in list
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word words = numberArrayList.get(i);//This is how find position of listview item
                if (mediaPlayer!=null){
                    try {
                        releaseMediaplayer();
                    }catch (Exception e){}
                }

               // Request audio focus for playback
               int result = mAudioManager.requestAudioFocus(mListener,
                       // Use the music stream.
                       AudioManager.STREAM_MUSIC,
                       // Request permanent focus.
                       AudioManager.AUDIOFOCUS_GAIN_TRANSIENT);

               if (result == AudioManager.AUDIOFOCUS_REQUEST_GRANTED) {
                   // Start playback with aud
                   mediaPlayer = MediaPlayer.create(NumbersActivity.this,words.getmCerkezPronounciation()); //Here we create a mediaplayer object listen to word
                   mediaPlayer.start();
                   setVolumeControlStream(AudioManager.STREAM_MUSIC);
                   mediaPlayer.setOnCompletionListener(onCompletionListener);
                   position=words.getmCerkezPronounciation();
               }else {
                   Toast.makeText(NumbersActivity.this ,"Audio Focus failed Please End your Other Audio Activity then Try again",Toast.LENGTH_LONG).show();
               }


            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        mediaOnPause();
    }

    protected void mediaOnPause(){
        pausedTime=mediaPlayer.getCurrentPosition();
        mediaPlayer.pause();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mediaOnStart();
    }
    protected void mediaOnStart(){
        if (!(pausedTime==0)){
            try {
                mediaPlayer = MediaPlayer.create(NumbersActivity.this,position); //Here we create a mediaplayer object listen to word
                mediaPlayer.seekTo(pausedTime);
                mediaPlayer.start();
                setVolumeControlStream(AudioManager.STREAM_MUSIC);
            }catch (Exception e){}
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaplayer();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        releaseMediaplayer();
    }
    public void releaseMediaplayer(){
        if (mediaPlayer!=null){
            try {
                mediaPlayer.release();
                mediaPlayer=null;
                mAudioManager.abandonAudioFocus(mListener);
            }catch (Exception e){}
        }

    }

}
