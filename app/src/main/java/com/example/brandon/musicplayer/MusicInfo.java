package com.example.brandon.musicplayer;

import java.util.ArrayList;

public class MusicInfo {

    private final String mSongTitle;

    private final String mArtistName;

    private final String mAlbumName;

    public MusicInfo(String song, String artist, String album){
        this.mSongTitle=song;
        this.mArtistName=artist;
       this. mAlbumName=album;
    }

   // public MusicInfo(SongActivity songActivity, ArrayList<MusicInfo> songs) {

   // }

    public String getSongTitle(){

        return mSongTitle;
    }

    public String getArtistName(){

        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

}
