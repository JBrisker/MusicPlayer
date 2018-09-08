package com.example.brandon.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.song_item );

        // Create a list of artists, songs, and albums

        ArrayList<MusicInfo> songs = new ArrayList<MusicInfo>();
        songs.add( new MusicInfo( "red", "weṭeṭṭi","Strange times") );
        songs.add( new MusicInfo( "mustard yellow", "chiwiiṭә" ,"Trolling the World") );
        songs.add( new MusicInfo( "green", "chokokki","Bitter Lessons") );
        songs.add( new MusicInfo( "gray", "ṭopoppi","Fallen ") );
        songs.add( new MusicInfo( "black", "kululli","Under these") );
        songs.add( new MusicInfo( "white", "kelelli","Littlest Lies") );

        // Link to the adapter, the adapter will create list item for each item in the list.
        SongAdapter adapter = new SongAdapter( this, songs );
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // MusicInfo_list.xml layout file.
        ListView listView =(ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link MusicInfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link com.example.brandon.musicplayer.MusicInfo} in the list.
        listView.setAdapter(adapter);

        // Find the View that shows the numbers category
        TextView go_play = (TextView) findViewById(R.id.now_playing);

        /* Set a click listener on that View
        go_play.setOnClickListener(new View.OnClickListener() {
            // This method will be executed for CurrentPlay.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SongActivity.this,CurrentPlay.class);
                startActivity(nowPlayingIntent);
            }
        });*/
    }
}

