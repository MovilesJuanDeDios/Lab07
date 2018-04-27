package com.example.casca.appcompat.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import com.example.casca.appcompat.Adapters.CancionAdapter;
import com.example.casca.appcompat.Model.Cancion;
import com.example.casca.appcompat.R;

import java.util.ArrayList;
import java.util.List;

public class Canciones extends AppCompatActivity {

    RecyclerView recyclerView;
    CancionAdapter adapter;
    List<Cancion> cancionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canciones);


        cancionList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewCanciones);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Twist and Shout",
                        "Please Please Me",
                        R.drawable.please,
                        R.raw.twist
                        ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "All my loving",
                        "With The Beatles",
                        R.drawable.with,
                        R.raw.all
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Can't Buy Me Love",
                        "A Hard Day´s Night ",
                        R.drawable.hard,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Eight Days a Week",
                        "Beatles for Sale",
                        R.drawable.sale,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Help!",
                        "Help!",
                        R.drawable.help,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "I,ve Just Seen a Face",
                        "Rubber Soul",
                        R.drawable.rubber,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Eleanor Rigby",
                        "Revolver",
                        R.drawable.revolver,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Sgt.Pepp. Lon. Hearts",
                        "Sgt. Pepp. Lon. Hearts Club Band",
                        R.drawable.sgt_pepper,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Penny Lane",
                        "Magical Mystery Tour",
                        R.drawable.magical,
                        0
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Blackbird",
                        "THE BEATLES",
                        R.drawable.white,
                        1
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Yellow Submarine",
                        "Yellow Submarine",
                        R.drawable.yellow,
                        R.raw.yellow
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Something",
                        "Abbey Road",
                        R.drawable.road,
                        2
                ));
        cancionList.add(
                new Cancion(
                        "The Beatles",
                        "Get Back",
                        "Let It Be",
                        R.drawable.let,
                        3
                ));


        adapter = new CancionAdapter(this, cancionList);
        recyclerView.setAdapter(adapter);
    }

}
