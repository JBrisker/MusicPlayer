package com.example.brandon.musicplayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.widget.ListView;

import java.util.ArrayList;


public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.song_item );


        // Create a list of artists, songs, and albums

        ArrayList<MusicInfo> songs = new ArrayList<MusicInfo>();
        songs.add( new MusicInfo( "Jealous", "Labrinth") );
        songs.add( new MusicInfo( "Elastic Heart", "Sia") );
        songs.add( new MusicInfo( "It Sucks", "Avonlea") );
        songs.add( new MusicInfo( "Genesis", "Daniela Andrade") );
        songs.add( new MusicInfo( "Flavor", "Waxtheproducer") );
        songs.add( new MusicInfo( "With Teeth", "Nine Inch Nails") );
        songs.add( new MusicInfo( "Tear You Apart", "She Wants Revenge") );
        songs.add( new MusicInfo( "Radio Lust", "The Blancos") );
        songs.add( new MusicInfo( "I Like That", "Janelle Monae") );
        songs.add( new MusicInfo( "Boomerang", "Jidenna") );

        // Link to the adapter, the adapter will create list item for each item in the list.
        SongAdapter adapter = new SongAdapter( this, songs );
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // MusicInfo_list.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link MusicInfoAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link com.example.brandon.musicplayer.MusicInfo} in the list.
        listView.setAdapter(adapter);

        // Find the View that shows the numbers category
        //TextView go_play = (TextView) findViewById(R.id.now_playing);

        //Set a click listener on that View
      /*  go_play.setOnClickListener(new View.OnClickListener() {
            // This method will be executed for CurrentPlay.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(SongActivity.this,CurrentPlay.class);
                startActivity(nowPlayingIntent);
            }
        });*/
    }
}

