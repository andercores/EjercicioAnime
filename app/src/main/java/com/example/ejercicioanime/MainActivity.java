package com.example.ejercicioanime;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    private ArrayList<Animes> animes = new ArrayList<>();
    private ListView listaAnimes;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rellenarAnimes();

        AnimesAdapter adapter = new AnimesAdapter(this, animes);
        listaAnimes = findViewById(R.id.lvAnimes);
        listaAnimes.setAdapter(adapter);

    }

    private void rellenarAnimes()
    {
        animes.add(new Animes("Death Note", R.drawable.logo1));
        animes.add(new Animes("Harry Potter", R.drawable.logo2));
        animes.add(new Animes("Peter Pan", R.drawable.logo3));
        animes.add(new Animes("Camela", R.drawable.logo4));



    }
}