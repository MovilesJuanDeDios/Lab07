package com.example.casca.appcompat.Activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.casca.appcompat.R;

public class Video extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        String video =  getIntent().getExtras().getString("video");

        videoView = (VideoView) findViewById(R.id.videoView);

        Uri uri= Uri.parse("android.resource://" + getPackageName() + "/" + video);

        MediaController mc = new MediaController(this);
        videoView.setMediaController(mc);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();


    }

}
