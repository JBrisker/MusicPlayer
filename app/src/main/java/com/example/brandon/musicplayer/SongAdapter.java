package com.example.brandon.musicplayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;



public class SongAdapter extends ArrayAdapter<MusicInfo> {

    public SongAdapter(Context context, ArrayList<MusicInfo> songs){
        /*initialize the ArrayAdapters internal storage for the context and the list
        the second argument is used when the ArrayAdapter is populating a single TextView.
        Because this is a customer adapter for two textViews, the Adapter is not going to
        use this second argument so it can be any value. Here, 0 was used.
         */
        super(context, 0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        MusicInfo currentSong = getItem(position);

        // Pull in information from song_item that matches the ID
        TextView artistTextView = listItemView.findViewById(R.id.artist_name);
              artistTextView.setText(currentSong.getArtistName());

        TextView songTextView =listItemView.findViewById(R.id.song_title);
            songTextView.setText(currentSong.getSongTitle());

        //Find the TextView in the list_item.xml layout with the ID version_number
        TextView albumTextView =  listItemView.findViewById(R.id.album_name);
            albumTextView.setText(currentSong.getAlbumName());
        return listItemView;
    }


}

