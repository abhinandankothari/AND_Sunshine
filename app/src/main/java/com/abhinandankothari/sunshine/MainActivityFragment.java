package com.abhinandankothari.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {
    private ArrayAdapter<String> arrayAdapter;
    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> weather = new ArrayList<String>();
        weather.add("Today - Sunny - 88/63");
        weather.add("Tomorrow - Sunny - 88/63");
        weather.add("Wed - Sunny - 88/63");
        weather.add("Thurs - Sunny - 88/63");
        weather.add("Friday - Sunny - 88/63");
        weather.add("Sat - Sunny - 88/63");
        weather.add("Sunday - Sunny - 88/63");

         arrayAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview, weather);

        ListView listView = (ListView)  rootView.findViewById(R.id.listView_forecast);
        listView.setAdapter(arrayAdapter);

        return rootView;
    }
}
