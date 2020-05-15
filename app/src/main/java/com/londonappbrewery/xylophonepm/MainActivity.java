package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SoundPool mSoundPool;
    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
   Button c,d,e,f,g,a,b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(Button)findViewById(R.id.c_key);
        d=(Button)findViewById(R.id.d_key);
        e=(Button)findViewById(R.id.e_key);
        f=(Button)findViewById(R.id.f_key);
        g=(Button)findViewById(R.id.g_key);
        a=(Button)findViewById(R.id.a_key);
        b=(Button)findViewById(R.id.b_key);



        // TODO: Create a new SoundPool
       mSoundPool=new SoundPool(7,AudioManager.STREAM_MUSIC,0);
       mCSoundId=mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
       mDSoundId=mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
       mESoundId=mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
       mFSoundId=mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
       mGSoundId=mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
       mASoundId=mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
       mBSoundId=mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               mSoundPool.play(mCSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mDSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mESoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mFSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mGSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mASoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSoundPool.play(mBSoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
            }
        });

        // TODO: Load and get the IDs to identify the sounds


    }

    // TODO: Add the play methods triggered by the buttons



}
