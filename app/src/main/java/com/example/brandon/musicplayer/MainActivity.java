package com.example.brandon.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView now_playing = (TextView) findViewById(R.id.now_playing);

        // Set a click listener on that View
        now_playing.setOnClickListener(new View.OnClickListener() {
            // This method will be executed for CurrentPlay.
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this,CurrentPlay.class);
                startActivity(nowPlayingIntent);
            }
        });

        // Find the View that shows the family category
        TextView song_list = (TextView) findViewById(R.id.song_list);

        // Set a click listener on that View
        song_list.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link com.example.brandon.musicplayer.SongActivity}
                Intent SongActivityIntent = new Intent(MainActivity.this, SongActivity.class);

                // Start the new activity
                startActivity(SongActivityIntent);
            }
        });
    }
}