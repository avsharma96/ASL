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
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String path = null;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnvideo);

        vid = findViewById(R.id.videoView);
        //MediaController m = new MediaController(this);
        mediaC = new MediaController(this);
        Bundle b = getIntent().getExtras();
        String value = null; // or other values
        if(b != null)
            value = b.getString("key");
        if(value.equals("Gift")) {
            path = "android.resource://com.example.test/" + R.raw.gift;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Car")) {
            path = "android.resource://com.example.test/" + R.raw.car;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Pay")) {
            path = "android.resource://com.example.test/" + R.raw.pay;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Pet")) {
            path = "android.resource://com.example.test/" + R.raw.pet;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Sell")) {
            path = "android.resource://com.example.test/" + R.raw.sell;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Explain")) {
            path = "android.resource://com.example.test/" + R.raw.explain;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("That")) {
            path = "android.resource://com.example.test/" + R.raw.that;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Book")) {
            path = "android.resource://com.example.test/" + R.raw.book;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Now")) {
            path = "android.resource://com.example.test/" + R.raw.now;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Work")) {
            path = "android.resource://com.example.test/" + R.raw.work;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Total")) {
            path = "android.resource://com.example.test/" + R.raw.total;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Trip")) {
            path = "android.resource://com.example.test/" + R.raw.trip;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Future")) {
            path = "android.resource://com.example.test/" + R.raw.future;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Good")) {
            path = "android.resource://com.example.test/" + R.raw.good;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Thank you")) {
            path = "android.resource://com.example.test/" + R.raw.thankyou;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Learn")) {
            path = "android.resource://com.example.test/" + R.raw.learn;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Agent")) {
            path = "android.resource://com.example.test/" + R.raw.agent;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Should")) {
            path = "android.resource://com.example.test/" + R.raw.should;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Like")) {
            path = "android.resource://com.example.test/" + R.raw.like;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
        else if(value.equals("Movie")) {
            path = "android.resource://com.example.test/" + R.raw.movie;
            Uri u = Uri.parse(path);
            vid.setVideoURI(u);
            vid.setMediaController(mediaC);
            mediaC.setAnchorView(findViewById(R.id.videoView));
            vid.start();
        }
    }
    public void openCamera(View view) {
        Intent intent = new Intent(learnvideo.this, cameraRecord.class);
        startActivity(intent);
    }
}