package com.example.brandon.musicplayer;




public class MusicInfo {

    private final String mSongTitle;

    private final String mArtistName;


    public MusicInfo(String song, String artist){
        mSongTitle=song;
        mArtistName=artist;

    }

    public String getSongTitle(){

        return mSongTitle;
    }

    public String getArtistName(){

        return mArtistName;
    }

}
