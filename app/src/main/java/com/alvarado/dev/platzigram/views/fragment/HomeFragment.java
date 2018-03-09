package com.alvarado.dev.platzigram.views.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alvarado.dev.platzigram.R;
import com.alvarado.dev.platzigram.adapter.PictureAdapterRecyclerView;
import com.alvarado.dev.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        //Muestra el titulo en el ToolBar
        mostrarToolbar("Inicio", false, view);

        //Declaración del Recycler View
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.imagenRecycler);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(), R.layout.card_view_picture, getActivity());
        picturesRecycler.setAdapter(pictureAdapterRecyclerView);
        return view;
    }

    public ArrayList<Picture> buildPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("https://i2.wp.com/pendulo.com/images/big/New_york_city_Black_&_white__90669.jpg", "Pedro Picapiedra", "4 días", "4"));
        pictures.add(new Picture("https://cdn.shopify.com/s/files/1/0182/8937/products/Paisley_Black_and_Blue_Fabric_Bow_Tie_X717_large.jpg?v=1442372686", "Homero Simpsom", "1 días", "10"));
        pictures.add(new Picture("https://cdn.shopify.com/s/files/1/0153/0623/products/Amorina_Teal_Leaf_Wallpaper_from_the_Scandinavian_Designers_II_Collection_by_Brewster_4c737082-496d-4a6a-ab55-e99c08d508b9_large.jpg?v=1514576929", "Bart Simpsom", "6 días", "7"));
        return pictures;
    }

    public void mostrarToolbar(String titulo, boolean botonAtras, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(titulo);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(botonAtras);
    }

}
