package com.example.block;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class block4 extends AppCompatActivity {
    MediaPlayer song;
    Button play, pause,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.block4);
        play = findViewById(R.id.play);
        pause = findViewById(R.id.pause);
        song = MediaPlayer.create(block4.this, R.raw.senorita);
//        song.start();
        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(block4.this,block5.class);
                startActivity(intent);
            }
        });
//       Uri myUri = Uri.parse("https://www.learningcontainer.com/wp-content/uploads/2020/02/Kalimba.mp3");
//        MediaPlayer mediaPlayer = new MediaPlayer();
//        mediaPlayer.setAudioAttributes(
//                new AudioAttributes.Builder()
//                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
//                        .setUsage(AudioAttributes.USAGE_MEDIA)
//                        .build()
//        );
//        try {
//            mediaPlayer.setDataSource(getApplicationContext(), myUri);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            mediaPlayer.prepare();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        mediaPlayer.start();
//    }


}

    public void pauseMusic(View view) {
        if(song.isPlaying())
            song.pause();

    }

    public void playMusic(View view) {
        song.start();
    }
}

