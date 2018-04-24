package com.example.casca.appcompat.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.casca.appcompat.Adapters.DiscografiaAdapter;
import com.example.casca.appcompat.Model.Cancion;
import com.example.casca.appcompat.Model.Disco;
import com.example.casca.appcompat.R;

import java.util.ArrayList;
import java.util.List;

public class Discografia extends AppCompatActivity {

    RecyclerView recyclerView;
    DiscografiaAdapter adapter;
    List<Disco> discoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discografia);

        discoList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewDiscografia);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        discoList.add(
                new Disco(
                        "The Beatles",
                        "Please Please Me",
                        1963,
                        R.drawable.please
                ));

        discoList.add(
                new Disco(
                        "The Beatles",
                        "With The Beatles",
                        1963,
                        R.drawable.with
                ));

        discoList.add(
                new Disco(
                        "The Beatles",
                        "A Hard Day´s Night",
                        1964,
                        R.drawable.hard
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Beatles for Sale",
                        1964,
                        R.drawable.sale
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Help",
                        1965,
                        R.drawable.help
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Rubber Soul",
                        1965,
                        R.drawable.rubber
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Revolver",
                        1966,
                        R.drawable.revolver
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Sgt. Pepper's Lonely Hearts Club Band",
                        1967,
                        R.drawable.sgt_pepper
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Magical Mystery Tour",
                        1967,
                        R.drawable.magical
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "THE BEATLES",
                        1968,
                        R.drawable.white
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Yellow Submarine",
                        1969,
                        R.drawable.yellow
                ));
        discoList.add(
                new Disco(
                        "The Beatles",
                        "Abbey Road",
                        1969,
                        R.drawable.road
                ));

        discoList.add(
                new Disco(
                        "The Beatles",
                        "Let It Be",
                        1970,
                        R.drawable.let
                ));

        adapter = new DiscografiaAdapter(this, discoList);
        recyclerView.setAdapter(adapter);
    }
}
