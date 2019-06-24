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

public class PaperFragment extends Fragment{
    private MarketAdapter adapter;
    private Sucai[] sucais = {new Sucai(R.drawable.paper11),new Sucai(R.drawable.paper2),new Sucai(R.drawable.paper3),
            new Sucai(R.drawable.paper4),new Sucai(R.drawable.paper5),new Sucai(R.drawable.paper6),
            new Sucai(R.drawable.paper10),new Sucai(R.drawable.paper11),new Sucai(R.drawable.paper12),
            new Sucai(R.drawable.paper7),new Sucai(R.drawable.paper8),new Sucai(R.drawable.paper9)};
    private ArrayList<Sucai> arrayList = new ArrayList<>(Arrays.asList(sucais));
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.paper_fragment,null);
        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(),3);
        recyclerView.setLayoutManager(gridLayoutManager);
        adapter = new MarketAdapter(arrayList);
        recyclerView.setAdapter(adapter);
        return view;
    }
}
