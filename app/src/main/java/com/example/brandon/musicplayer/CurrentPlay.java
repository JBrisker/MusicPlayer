package com.example.brandon.musicplayer;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class CurrentPlay extends AppCompatActivity {
  Button playB;

   SeekBar post_B;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);
        String currentSong;
        String currentArtist;
       // MediaPlayer player;


      //  playB = (Button) findViewById(R.id.play_btn);

       // post_B = (SeekBar) findViewById(R.id.position);


        Intent getSongInfo = getIntent();
        currentSong = getSongInfo.getStringExtra("SongName");
        currentArtist = getSongInfo.getStringExtra("ArtistName");

        TextView songName = findViewById(R.id.track);
        TextView artistName = findViewById(R.id.artist);
        songName.setText(currentSong);
        artistName.setText(currentArtist);


       /* TextView textView = findViewById(R.id.track);
            textView.setText(nowPlayingSong.getSongTitle());


            textView = findViewById(R.id.artist);
            textView.setText(nowPlayingSong.getArtistName());*/


    }

        /* play button image toggle
  public void playMusic(View view) {
      if (!player.isPlaying()) {
          playB.setBackgroundResource( R.drawable.nav_pause );
      } else {
          player.pause();
          playB.setBackgroundResource( R.drawable.nav_play );

      }*/

  }
