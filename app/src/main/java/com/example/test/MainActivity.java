package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gesture_array, android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {



            public void onClick(View v) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onItemSelected(AdapterView<?> arg0, View view,
                                       int position, long row_id) {

                String selectedItem = arg0.getItemAtPosition(position).toString();
                System.out.println(selectedItem);
                if(!selectedItem.equals("Select an item")) {
                    Intent intent = new Intent(MainActivity.this, learnvideo.class);

                    Bundle b = new Bundle();
                    b.putString("key", selectedItem);
                    intent.putExtras(b); //Put your id to your next Intent
                    startActivity(intent);
                    finish();
                }
                /*if(selectedItem.equals("Gift"))

                {
                    Intent intent = new Intent(MainActivity.this, learnvideo.class);
                    Bundle b = new Bundle();
                    b.putString("key", "Gift");
                    intent.putExtras(b); //Put your id to your next Intent
                    startActivity(intent);
                    finish();
                }*/


            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }

        });
    }


}