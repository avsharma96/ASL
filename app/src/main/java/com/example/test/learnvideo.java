package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class learnvideo extends AppCompatActivity {

    VideoView vid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String path = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnvideo);

        vid = findViewById(R.id.videoView);
        MediaController m = new MediaController(this);
        Bundle b = getIntent().getExtras();
        String value = null; // or other values
        if(b != null)
            value = b.getString("key");
        if(value.equals("Gift")) {
            path = "android.resource://com.example.test/" + R.raw.gift;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.start();
        }
    }
    public void openCamera(View view) {
        Intent intent = new Intent(learnvideo.this, cameraRecord.class);
        startActivity(intent);
    }
}