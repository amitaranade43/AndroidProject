package com.example.root.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity
{

    ViewFlipper viewFlipper;
    Button next;
    Button prev;
    private ImageView imageView;
    private RelativeLayout mylay;
    private RadioGroup radioGroup;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup) ;
        radioGroup.clearCheck();
        mylay=(RelativeLayout)findViewById(R.id.myLayout);
        imageView=(ImageView)findViewById(R.id.imageView);
        Timer timer=new Timer();
        MyTimer myTimer=new MyTimer();
        timer.schedule(myTimer,100,100);
        Button login=(Button)findViewById(R.id.login);
        Button register=(Button)findViewById(R.id.register);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed()
    {
        AlertDialog diaBox=AskOption();
        diaBox.show();
    }
    private AlertDialog AskOption()
    {
        AlertDialog myQuittingDialogBox=new AlertDialog.Builder(this).setTitle("Exit").setMessage("Are you sure you want to Exit?").setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int whichButton) {
                finishAffinity();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int whichButton) {
        dialog.dismiss();
            }
        }).create();
        return myQuittingDialogBox;
    }

    class MyTimer extends TimerTask
    {
        public void run()
        {
            runOnUiThread(new Runnable()
            {
                Random random=new Random();
                @Override
                public void run()
                {
                    radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
                    {
                        public void onCheckedChanged(RadioGroup group, int checkedId)
                        {
                            RadioButton rb = (RadioButton) group.findViewById(checkedId);
                            if (null != rb && checkedId > -1)
                            {
                                int images[] = {R.drawable.dress1, R.drawable.dell2, R.drawable.novel};
                                imageView.setBackgroundResource(images[getRandomNumber()]);
                            }
                        }
                    });
                }
                private int getRandomNumber()
                {

                    return new Random().nextInt(3);
                }
            });}}}