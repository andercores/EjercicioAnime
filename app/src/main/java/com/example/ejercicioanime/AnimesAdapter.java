package com.example.ejercicioanime;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class AnimesAdapter extends BaseAdapter
{

    private Context contexto = null;
    private ArrayList<Animes> animes = new ArrayList<Animes>();
    private int pos = 0;


    public AnimesAdapter(Context contexto, ArrayList<Animes> animes)
    {
        this.contexto = contexto;
        this.animes = animes;
    }



    @Override
    public int getCount()
    {
        return animes.size();
    }

    @Override
    public Object getItem(int i)
    {
        return animes.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup)
    {
        LayoutInflater inflater = ((Activity) contexto).getLayoutInflater();

        if (pos ==0){
            View fila = inflater.inflate(R.layout.anime_list_cabecera, null);

        }
            View fila = inflater.inflate(R.layout.anime_list, null);

            Animes anime = animes.get(i);

            ImageView ivAnime = fila.findViewById(R.id.ivAnime);
            ivAnime.setImageResource(anime.getLogo());

            TextView tvAnime = fila.findViewById(R.id.tvAnime);
            tvAnime.setText(anime.getNombre());





        return fila;
    }
}
