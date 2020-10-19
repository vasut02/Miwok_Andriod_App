package com.example.android.miwok;

public class Word {
    private String mDefault_translation ;
    private String mMiwok_translation ;
    private int mImageResourceId ;
    private boolean Has_Image = false;
    private int mAudioResourceId;

    public Word( String default_translation , String miwok_translation , int audio_file){
        this.mDefault_translation = default_translation;
        this.mMiwok_translation = miwok_translation;
        this.mAudioResourceId = audio_file;

    }

    public Word( String default_translation , String miwok_translation , int image_id , int audio_file){
        this.mDefault_translation = default_translation;
        this.mMiwok_translation = miwok_translation;
        this.mImageResourceId = image_id;
        Has_Image = true;
        this.mAudioResourceId = audio_file;

    }

    public String getDefault_translation() {
        return mDefault_translation;
    }

    public String getmiwok_translation() {
        return mMiwok_translation;
    }

    public int getmImageResourceId() { return mImageResourceId; }

    public int getmAudioResourceId() { return mAudioResourceId; }

    public boolean isHas_Image(){
        return Has_Image;
    }
}
