package com.example.brandon.musicplayer;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;



public class CurrentPlay extends AppCompatActivity {
    Button playB;

    SeekBar post_B;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nowplaying);

        playB = (Button) findViewById(R.id.play_btn);

        post_B = (SeekBar) findViewById(R.id.position);
        player.seekTo(0);
    }

    // play button image toggle
    public void playMusic(View view){
       if(!player.isPlaying()){
           playB.setBackgroundResource(R.drawable.nav_pause);
       }
    else{
           player.pause();
           playB.setBackgroundResource(R.drawable.nav_play);

       }
}
}