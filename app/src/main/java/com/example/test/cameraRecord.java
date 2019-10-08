package com.example.test;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.widget.AbsSeekBar;
import android.widget.Button;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class cameraRecord extends AppCompatActivity {
    //Button clk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_record);
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.CAMERA},
                    0);
        }


        Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 5);
        startActivity(intent);

//        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
//        StrictMode.setVmPolicy(builder.build());
//
////        Intent imageIntent = new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
////        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
////
//////folder stuff
////        File imagesFolder = new File(Environment.getExternalStorageDirectory(), "MyImages");
////        imagesFolder.mkdirs();
////
////        File image = new File(imagesFolder, "ABC");
////        Uri uriSavedImage = Uri.fromFile(image);
////
////        imageIntent.putExtra(MediaStore.EXTRA_OUTPUT, uriSavedImage);
////        imageIntent.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 5);
////        startActivity(imageIntent);
//        //startActivityForResult(imageIntent, 1);
//
//        Intent i = new Intent(android.provider.MediaStore.ACTION_VIDEO_CAPTURE);
//        File out =new File( Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM),"fileupload");
//
//        File x = new File(out.getPath()+"/file.mp4");
//
//       // File out2 = new File(out+"/ABC.mp4");
//
//        //Uri uri = Uri.fromFile(out);
//
////        String stringUri;
////        stringUri = uri.toString();
////        System.out.println(stringUri);
//
//        i.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(x));
//        i.putExtra(MediaStore.EXTRA_DURATION_LIMIT, 5);
//        startActivity(i);

    }




}
