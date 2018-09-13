package com.example.brandon.musicplayer;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter {
    private Context mContext;
    public SongAdapter(Context context, ArrayList<MusicInfo> songs) {
        super(context,0, songs);

        mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(mContext).inflate(
                    R.layout.song_list, parent, false);
        }
         MusicInfo currentSong= (MusicInfo) getItem(position);
        TextView songTextView = listItemView.findViewById(R.id.song_title);
        songTextView.setText(currentSong.getSongTitle());
        TextView artistTextView = listItemView.findViewById(R.id.artist_name);
        artistTextView.setText(currentSong.getArtistName());

        return listItemView;
    }
}