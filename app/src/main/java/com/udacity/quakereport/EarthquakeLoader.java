package com.udacity.quakereport;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<EarthQuake>> {
    public EarthquakeLoader(@NonNull Context context) {
        super(context);
    }

    @Nullable
    @Override
    public List<EarthQuake> loadInBackground() {
        return null;
    }
}
