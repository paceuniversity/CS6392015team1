package com.example.javafix.javafix;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class JavaCupActivityFragment extends Fragment {

    public JavaCupActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /**
         * TODO: Add button links for Log Cup and Cancel
         */


        return inflater.inflate(R.layout.fragment_java_cup, container, false);

    }


}
