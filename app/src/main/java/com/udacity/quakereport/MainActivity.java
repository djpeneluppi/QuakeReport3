package com.udacity.quakereport;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<EarthQuake> {
    private static final String TAG = MainActivity.class.getName();

    private static final String USGS_REQUEST_URL = "https://earthquake.usgs.gov/fdsnws/event/1/query";

    /**
     * Adapter for the list of earthquakes
     */
    private EarthQuakeAdapter mAdapter;

    /**
     * Constant value for the earthquake loader ID. We can choose any integer.
     * This really only comes into play if you're using multiple loaders.
     */
    private static final int EARTHQUAKE_LOADER_ID = 1;

    /**
     * TextView that is displayed when the list is empty
     */
    private TextView mEmptyStateTextView;

    private View loadingIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

//        // Find a reference to the {@link ListView} in the layout
//        ListView earthquakeListView = findViewById(R.id.list);



//        final ArrayList<EarthQuake> earthquakes = QueryUtils.extractEarthquakes();
//
//        // Find a reference to the {@link ListView} in the layout
//        ListView earthquakeListView = findViewById(R.id.list);
//
//        // Create a new adapter that takes the list of earthquakes as input
//        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this, earthquakes);
//
//        // Set the adapter on the {@link ListView}
//        // so the list can be populated in the user interface
//        earthquakeListView.setAdapter(adapter);
//
//        //New
//        earthquakeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//            EarthQuake quakeItem = earthquakes.get(position);
//            Log.v(TAG, "item position: " + position);
//            Uri uri = Uri.parse(quakeItem.getmUrl());
//            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//            startActivity(intent);
//            }
//        });
    }

    @NonNull
    @Override
    public Loader<EarthQuake> onCreateLoader(int id, @Nullable Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(@NonNull Loader<EarthQuake> loader, EarthQuake data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<EarthQuake> loader) {

    }
}