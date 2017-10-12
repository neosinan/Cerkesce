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
    private int mDefaultImage;

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

    //image ID getter
    public int getmDefaultImage() {return mDefaultImage; }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getCerkezceTranslation() { return mCerkezceTranslation;}


}
