package com.example.recyclerviewsample_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import java.util.ArrayList;

import adapters.SampleAdapter;
import classes.ArtistProfileActivity;
import classes.SampleItem;
import classes.SettingsActivity;

public class MainActivity extends AppCompatActivity {
    //create the variables for the 3 parts required for a recyclerView to work
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create a new arraylist for the sample items
        ArrayList<SampleItem> sampleList = new ArrayList<>();
        //add some items
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 3","Line 4"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 5","Line 6"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 7","Line 8"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 9","Line 10"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 11","Line 12"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 13","Line 14"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 15","Line 16"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 17","Line 18"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 19","Line 20"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 21","Line 22"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 23","Line 24"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 25","Line 26"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 27","Line 28"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 29","Line 30"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 31","Line 32"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 33","Line 34"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 35","Line 36"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 37","Line 38"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 39","Line 40"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 41","Line 42"));
        sampleList.add(new SampleItem(R.drawable.ic_android,"Line 43","Line 44"));
        sampleList.add(new SampleItem(R.drawable.ic_audio,"Line 45","Line 46"));
        sampleList.add(new SampleItem(R.drawable.ic_sun,"Line 47","Line 48"));








        //initialize the RecyclerView
        mRecyclerView = findViewById(R.id.recyclerView);
        //for the recyclerView not to change sze no matter how many items are in the recyclerView
        mRecyclerView.setHasFixedSize(true);
        //assign the LayoutManager
        mLayoutManager = new LinearLayoutManager(this);
        //assign the adapter
        mAdapter = new SampleAdapter(sampleList);

        //pass the LayoutManager into the recyclerView
        mRecyclerView.setLayoutManager(mLayoutManager);
        //pass the adapter into the recyclerView
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.music_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.artist:
                Intent intent = new Intent(MainActivity.this, ArtistProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.settings:
               Intent set = new Intent(MainActivity.this, SettingsActivity.class);
               startActivity(set);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}
