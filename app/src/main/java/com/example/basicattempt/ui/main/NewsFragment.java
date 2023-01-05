package com.example.basicattempt.ui.main;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.basicattempt.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NewsFragment} factory method to
 * create an instance of this fragment.
 */
public class NewsFragment extends Fragment {



    public NewsFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news, container, false);
    }
}