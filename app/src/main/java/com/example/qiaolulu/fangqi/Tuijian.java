package com.example.qiaolulu.fangqi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static android.support.v7.widget.StaggeredGridLayoutManager.VERTICAL;

public class Tuijian extends Fragment implements View.OnClickListener {
    private LinearLayout marketLinear;
    Intent intent;
    private Work[] works = {new Work("zhao",R.drawable.first),new Work("减肥",R.drawable.second)};
    private List<Work> workList = new ArrayList<>();
    private WorkAdapter adapter;
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.tuijian,null);
        initWorks();

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        //StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager,VERTICAL);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,  StaggeredGridLayoutManager.VERTICAL));
        adapter = new WorkAdapter(workList);
        recyclerView.setAdapter(adapter);
        marketLinear = view.findViewById(R.id.market);
        marketLinear.setOnClickListener(this);
        return view;
    }



    private void initWorks() {
        workList.clear();
        for(int i=0;i<50;i++){
            Random random = new Random();
            int index = random.nextInt(works.length);
            workList.add(works[index]);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.market:
              intent = new Intent(getActivity(),Market.class);
              startActivity(intent);
        }
    }
}




