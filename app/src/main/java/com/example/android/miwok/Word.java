package com.example.android.miwok;

public class Word {
    private String mDefault_translation ;
    private String mMiwok_translation ;
    private int mImageResourceId ;
    private boolean Has_Image = false;

    public Word( String default_translation , String miwok_translation){
        this.mDefault_translation = default_translation;
        this.mMiwok_translation = miwok_translation;

    }

    public Word( String default_translation , String miwok_translation , int image_id){
        this.mDefault_translation = default_translation;
        this.mMiwok_translation = miwok_translation;
        this.mImageResourceId = image_id;
        Has_Image = true;

    }

    public String getDefault_translation() {
        return mDefault_translation;
    }

    public String getmiwok_translation() {
        return mMiwok_translation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public boolean isHas_Image(){
        return Has_Image;
    }
}
