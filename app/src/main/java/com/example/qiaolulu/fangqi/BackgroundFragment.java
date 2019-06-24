package com.example.qiaolulu.fangqi;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class BackgroundFragment extends Fragment{
    private MarketAdapter adapter;
    private Sucai[] sucais = {new Sucai(R.drawable.background1),new Sucai(R.drawable.background2),new Sucai(R.drawable.background3)};
    private ArrayList<Sucai> arrayList = new ArrayList<>(Arrays.asList(sucais));
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.background_fragment,null);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),1);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new MarketAdapter(arrayList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}

