package com.example.qiaolulu.fangqi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Finger extends AppCompatActivity implements View.OnClickListener {
    private ImageView person;
    private ImageView picture;
    private ImageView talk;
    private ImageView pen;
    private ImageView paper;
    private CardView ll_bottom;
    private Sucai[] persons = {new Sucai(R.drawable.fingerone),new Sucai(R.drawable.fingertwo)};
    private Sucai[] pictures = {new Sucai(R.drawable.first),new Sucai(R.drawable.second)};
    private Sucai[] talks = {new Sucai(R.drawable.first),new Sucai(R.drawable.second)};
    private Sucai[] pens = {new Sucai(R.drawable.first),new Sucai(R.drawable.second)};
    private Sucai[] papers = {new Sucai(R.drawable.first),new Sucai(R.drawable.second)};
    private int[] per = {R.drawable.fingerone,R.drawable.fingertwo,
            R.drawable.fingerthree,R.drawable.fingerfour,R.drawable.fingerfive,R.drawable.fingersix,
            R.drawable.fingerseven,R.drawable.fingereight,R.drawable.fingernine};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finger);
        initView();
    }

    private void initView() {
        person = findViewById(R.id.person);
        picture = findViewById(R.id.picture);
        talk = findViewById(R.id.talk);
        pen = findViewById(R.id.pen);
        paper = findViewById(R.id.paper);
        ll_bottom = findViewById(R.id.ll_bottom);
        person.setOnClickListener(this);
        picture.setOnClickListener(this);
        talk.setOnClickListener(this);
        pen.setOnClickListener(this);
        paper.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Person bottomSheetFragment;
        switch (v.getId()){
            case R.id.person:
                /*Person person = new Person();
                Bundle bundle = new Bundle();
                bundle.putIntArray("person",per);
                person.setArguments(bundle);
                person.show(getSupportFragmentManager(),"dialog");*/
               // new Person().show(getSupportFragmentManager(),"dialog");
                bottomSheetFragment = Person.getInstance(Finger.this,persons);
                bottomSheetFragment.show(getSupportFragmentManager(), Person.class.getSimpleName());
                break;
            case  R.id.picture:
                /*bottomSheetFragment = Person.getInstance(Finger.this,ll_bottom,pictures);
                bottomSheetFragment.show(getSupportFragmentManager(), Person.class.getSimpleName());*/
                break;
            case R.id.talk:
                 /*bottomSheetFragment = Person.getInstance(Finger.this,ll_bottom,talks);
                bottomSheetFragment.show(getSupportFragmentManager(), Person.class.getSimpleName());*/
                break;
            case R.id.pen:
                 /*bottomSheetFragment = Person.getInstance(Finger.this,ll_bottom,pens);
                bottomSheetFragment.show(getSupportFragmentManager(), Person.class.getSimpleName());*/
                break;
            case R.id.paper:
                 /*bottomSheetFragment = Person.getInstance(Finger.this,ll_bottom,papers);
                bottomSheetFragment.show(getSupportFragmentManager(), Person.class.getSimpleName());*/
                break;
        }


    }
}
