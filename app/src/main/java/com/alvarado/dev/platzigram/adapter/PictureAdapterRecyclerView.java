package com.alvarado.dev.platzigram.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.alvarado.dev.platzigram.R;
import com.alvarado.dev.platzigram.model.Picture;

import java.util.ArrayList;

/**
 * Created by dev on 9/03/18.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder>{
    private ArrayList<Picture> pictures; //Array de Imagenes
    private int resource; //Id del elemento de la interfaz
    private Activity activity; //Activity Java a Utilizar

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inicialización de los elementos de la CardView
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {
        //Recorrido del array imagen y asignacion al CardView
        Picture picture = pictures.get(position);
        holder.usuarioCardView.setText(picture.getUsuario());
        holder.tiempoCardView.setText(picture.getTiempo());
        holder.numLikeCardView.setText(picture.getNumLike());
    }

    @Override
    public int getItemCount() {
        //Tamaño del arreglo que se va a recorrer
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{
        //Declaración de los elementos de la tarjeta
        private ImageView imgCardView;
        private TextView usuarioCardView;
        private TextView tiempoCardView;
        private TextView numLikeCardView;

        public PictureViewHolder(View itemView) {
            super(itemView);

            //Asignacion de los elementos de la tarjeta
            imgCardView = (ImageView) itemView.findViewById(R.id.imgCardView);
            usuarioCardView = (TextView) itemView.findViewById(R.id.txtNombreCardView);
            tiempoCardView = (TextView) itemView.findViewById(R.id.txtTiempoCardView);
            numLikeCardView = (TextView) itemView.findViewById(R.id.txtCantidadLikeCardView);
        }
    }
}
