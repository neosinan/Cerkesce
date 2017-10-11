package com.neosinan.cspr.cerkezce;

/**
 * Created by cspr on 11.10.2017.
 */

public class Word {
    //Cerkezce çevirilecek kelime
    private String mCerkezceTranslation;
    //Default Dildeki kelime
    private String mDefaultTranslation;

    public Word(String defaultTranslation, String cerkezceTranslation){
        mDefaultTranslation=defaultTranslation;
        mCerkezceTranslation=cerkezceTranslation;
    }


    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getCerkezceTranslation() {
        return mCerkezceTranslation;
    }


}
