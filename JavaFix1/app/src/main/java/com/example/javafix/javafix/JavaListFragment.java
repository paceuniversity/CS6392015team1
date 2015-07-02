package com.example.javafix.javafix;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


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
        View rootView = inflater.inflate(R.layout.fragment_java_list, container, false);

        // Create Array
        String[] javaCups = {
                "Starbucks Coffee Tall",
                "Starbucks Coffee Grande",
                "Starbucks Coffee Vente",
                "Dunkin Dounuts Small",
                "Dunkin Dounuts Medium",
                "Dunkin Dounuts Large",
        };


        ArrayAdapter<String> javaAdapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1,
                javaCups);

        // Set the View
        ListView listview = (ListView) rootView.findViewById(R.id.listview1);

        // Set the adaptor
        listview.setAdapter(javaAdapter);

        listview.setOnItemClickListener(onItemClickListener);


          return rootView;

    }

    public AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {

        @Override
        public void onItemClick(AdapterView<?> arg0, View arg1, int position,
                                long arg3) {
            // TODO Auto-generated method stub
            //do your job here, position is the item position in ListView
            Intent intent = new Intent(getActivity(),JavaCupActivity.class);
            startActivity(intent);
        }
    };

}
