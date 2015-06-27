package com.example.javafix.javafix;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class JavaListFragment extends Fragment {

    public JavaListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // For fragment
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Create Array
        String[] javaCups = {
                "Starbucks Coffee Tall",
                "Starbucks Coffee Grande",
                "Starbucks Coffee Vente",
                "Dunkin Dounuts Small",
                "Dunkin Dounuts Medium",
                "Dunkin Dounuts Large",
        };

        // Create new Array List using Array
        List<String> javaCupsList = new ArrayList<String>(Arrays.asList(javaCups));

        // Create the adapter (data source)
        ArrayAdapter<String> javaAdapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1,
                javaCups);

        // Set the View
        ListView lv = (ListView) rootView.findViewById(R.id.javalistView);

        // Set the adaptor
        lv.setAdapter(javaAdapter);

        /**
         * TODO: Add Button to Java Cup View
         */

        return rootView;
    }
}
