package com.udacity.quakereport;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.util.List;

public class EarthQuakeAdapter extends ArrayAdapter {

    public EarthQuakeAdapter(Context context, List<EarthQuake> earthQuakes) {
        super(context, 0, earthQuakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Checa se existe um list item View existente (chamado ConvertView) que possamos reutilizar
        //caso contrário, se convertView é nulo então inflar um novo list item layout.
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.earthquake_list_item, parent, false);
        }
        //find the earthquake at the given position in the list of earthquakes
        EarthQuake currentEarthQuake = (EarthQuake) getItem(position);

        //find the TextView with View ID magnitude
        TextView magnitudeView = listItemView.findViewById(R.id.magnitude);

        // Configure a cor de fundo apropriada no círculo de magnitude.
        // Busque o fundo do TextView, que é um GradientDrawable.
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeView.getBackground();

        // Formata a magnitude para mostrar uma casa decimal
        String formattedMagnitude = formatMagnitude(currentEarthQuake.getmMagnitude());

        // Obtenha a cor de fundo apropriada, baseada na magnitude do terremoto atual
        int magnitudeColor = getMagnitudeColor(currentEarthQuake.getmMagnitude());

        // Configure a cor no círculo de magnitude
        magnitudeCircle.setColor(magnitudeColor);

        //Display the magnitude of the current earthquake in that TestView
        magnitudeView.setText(formattedMagnitude);

        //find the TextView with View ID region
        TextView regionView = listItemView.findViewById(R.id.location_offset);
        //Display the magnitude of the current earthquake in that TestView
        regionView.setText(currentEarthQuake.getmRegion());

        //find the TextView with View ID location
        TextView locationView = listItemView.findViewById(R.id.location);
        //Display the magnitude of the current earthquake in that TestView
        locationView.setText(currentEarthQuake.getmLocation());

        //find the TextView with View ID date
        TextView dateView = listItemView.findViewById(R.id.date);
        //Display the magnitude of the current earthquake in that TestView
        dateView.setText(currentEarthQuake.getmDate());

        //find the TextView with View ID time
        TextView timeView = listItemView.findViewById(R.id.time);
        //Display the magnitude of the current earthquake in that TestView
        timeView.setText(currentEarthQuake.getmTime());

        //return the list item view that is now showing the appropriate data
        return listItemView;

    }

    /**
     * Retorna a string magnitude formatada mostrando 1 casa decimal (i.e. "3.2")
     * de um valor de magnitude decimal.
     */
    private String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }

    private int getMagnitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude0_2;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2_3;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3_4;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4_5;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5_6;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6_7;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7_8;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8_9;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9_10;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }
}
