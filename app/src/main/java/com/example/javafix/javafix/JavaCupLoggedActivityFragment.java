package com.example.javafix.javafix;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class JavaCupLoggedActivityFragment extends Fragment {

    public JavaCupLoggedActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        /**
         * TODO: Add Button to go back to home screen
         */
        return inflater.inflate(R.layout.fragment_java_cup_logged, container, false);
    }
}
