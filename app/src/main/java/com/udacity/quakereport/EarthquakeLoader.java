package com.udacity.quakereport;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.content.AsyncTaskLoader;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<EarthQuake>> {

    /** Tag para mensagens de log */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** URL da busca */
    private String mUrl;

    /**
     * Constrói um novo {@link EarthquakeLoader}.
     *
     * @param context O contexto da activity
     * @param url A URL de onde carregaremos dados
     */
    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    public void onStartLoading() {
        forceLoad();
    }


/**
 * Está e uma thread de background.
 */    @Override
    public List<EarthQuake> loadInBackground() {
        if(mUrl == null) {
             return null;
        }
        // Realiza requisição de rede, decodifica a resposta,
        // e extrai uma lista de earthquakes.
        //List<EarthQuake> earthQuakes =


    return null;

    }
}
