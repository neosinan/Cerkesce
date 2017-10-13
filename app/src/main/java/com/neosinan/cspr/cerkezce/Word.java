package com.neosinan.cspr.cerkezce;

import android.graphics.Bitmap;

/**
 * Created by cspr on 11.10.2017.
 */


public class Word {
    //Cerkezce çevirilecek kelime
    private String mCerkezceTranslation;
    //Default Dildeki kelime
    private String mDefaultTranslation;
    //Kelimlerin Resim karşığı
    private int mDefaultImage=HAS_NO_IMAGE;

    private final static int HAS_NO_IMAGE=-1;

    private  int mCerkezPronounciation;

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
}
