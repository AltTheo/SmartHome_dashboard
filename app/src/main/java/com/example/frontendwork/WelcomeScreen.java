package com.example.frontendwork;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        setTitle("Home");
    }

    @SuppressLint("SetTextI18n")
    public void HomePage(View v) {
        Intent i = new Intent(this, MainActivity.class);
        EditText tv = findViewById(R.id.nameText);
        String name = tv.getText().toString();
        if (tv.getText().toString().equals("")) {
            tv.setError("Please enter your name");
        } else {
            Toast.makeText(this, "Thank You "+name, Toast.LENGTH_SHORT).show();
            startActivity(i);
        }
        ///***THIS BIT WAS FOR THE IMPLEMENTATION OF MUSIC***///
        ///***THIS WOULD BE LEFT OUT OF THIS PROJECT FOR NOW***//
        ///***NOTE IT FULLY WORKS**///

//        Button b = findViewById(R.id.nextPage);
//        MediaPlayer media = MediaPlayer.create(this, R.raw.sound);
//        media.start();  //This starts the music on default on launch
    }

//    public void soundClick(View v) {
//        MediaPlayer media = MediaPlayer.create(this, R.raw.sound);
//        media.start(); //This button starts the music playing
//    }
//
//    public void soundOff(View v) {
//        MediaPlayer media = MediaPlayer.create(this, R.raw.sound);
//        media.end();  //This button stops or mutes the song
//    }

}