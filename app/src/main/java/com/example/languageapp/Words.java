package com.example.languageapp;

public class Words {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    private static final int hasImageRecorder = -1;
    private int  mgetImageResourceId = hasImageRecorder;

    public Words(String DefaultTranslation,String miwokTranslation){

        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Words(String DefaultTranslation,String miwokTranslation,int getImageResourceId){

        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mgetImageResourceId = getImageResourceId;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
    public int getImageResourceId(){
        return mgetImageResourceId;
    }
    public boolean hasImage(){
        return mgetImageResourceId != hasImageRecorder;
    }
}

