package com.neosinan.cspr.cerkezce;

import android.graphics.Bitmap;

/**
 * Created by cspr on 11.10.2017.
 */


public class Word {

    private  int mCerkezPronounciation;
    //Cerkezce çevirilecek kelime
    private String mCerkezceTranslation;
    //Default Dildeki kelime
    private String mDefaultTranslation;
    //Kelimlerin Resim karşığı
    private int mDefaultImage=HAS_NO_IMAGE;

    private final static int HAS_NO_IMAGE=-1;

    private int mPlayImage=HAS_NO_IMAGE_PLAY;//gerektiği yerdeki play image

    //Kelimlerin Resim karşığı

    private final static int HAS_NO_IMAGE_PLAY=-1;



    //Ses kullan klaslar için construtor
    public Word(String defaultTranslation, String cerkezceTranslation, int defaultImage, int cerkezPronounciation,int playImage){
        mDefaultTranslation=defaultTranslation;
        mCerkezceTranslation=cerkezceTranslation;
        mDefaultImage = defaultImage;
        mCerkezPronounciation= cerkezPronounciation;
        mPlayImage=playImage;
    }

    //Ses kullan klaslar için construtor
    public Word(String defaultTranslation, String cerkezceTranslation, int defaultImage, int cerkezPronounciation){
        mDefaultTranslation=defaultTranslation;
        mCerkezceTranslation=cerkezceTranslation;
        mDefaultImage = defaultImage;
        mCerkezPronounciation= cerkezPronounciation;
    }


    //Image  kullanan class instanceları için constractor.
    public Word(String defaultTranslation, String cerkezceTranslation, int defaultImage){
        mDefaultTranslation=defaultTranslation;
        mCerkezceTranslation=cerkezceTranslation;
        mDefaultImage = defaultImage;
    }

    //Phrases classı için constractor
    public Word(String defaultTranslation, String cerkezceTranslation){
        mDefaultTranslation=defaultTranslation;
        mCerkezceTranslation=cerkezceTranslation;
    }

    public int getmCerkezPronounciation() {return mCerkezPronounciation; }

    //image ID getter
    public int getmDefaultImage() {return mDefaultImage; }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getCerkezceTranslation() { return mCerkezceTranslation;}

    public boolean hasImage(){
       return mDefaultImage!=HAS_NO_IMAGE;
    }

    public int getmPlayImage(){return mPlayImage;}

    public boolean hasPlayImage(){return mPlayImage!=HAS_NO_IMAGE_PLAY;}
}
