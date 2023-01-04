package com.example.basicattempt.ui.main;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.os.UserHandle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.basicattempt.AcademicCalendar;
import com.example.basicattempt.R;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment  {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    String[] ss = new String[]{ "Güz Yarıyıl"};
    String[] ss2 = new String[]{ "Bahar Yarıyıl"};
    String[] ss3 = new String[]{ "Yandal/ Çift Anadal"};
    String[] ss4 = new String[]{ "Yaz Okulu"};
    String[] ss5 = new String[]{ "Resmi Günler"};

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Spinner spinner = view.findViewById(R.id.spinner);
        Spinner spinner2 = view.findViewById(R.id.spinner2);
        Spinner spinner3 = view.findViewById(R.id.spinner3);
        Spinner spinner4 = view.findViewById(R.id.spinner4);
        Spinner spinner5 = view.findViewById(R.id.spinner5);

        ArrayAdapter aa = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, ss);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter aa2 = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, ss2);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter aa3 = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, ss3);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter aa4 = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, ss4);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter aa5 = new ArrayAdapter(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, ss5);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        spinner.setAdapter(aa);
        spinner.setSelection(0,true);
        spinner2.setAdapter(aa2);
        spinner.setSelection(0,true);
        spinner3.setAdapter(aa3);
        spinner.setSelection(0,true);
        spinner4.setAdapter(aa4);
        spinner.setSelection(0,true);
        spinner5.setAdapter(aa5);
        spinner.setSelection(0,true);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (!adapterView.getItemAtPosition(position).equals("Güz Yarıyıl")) {
                    Toast.makeText(adapterView.getContext(), "Selected " + ss[position],Toast.LENGTH_LONG).show();
                }
                // get spinner value


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (!adapterView.getItemAtPosition(position).equals("Bahar Yarıyıl")) {
                    Toast.makeText(adapterView.getContext(), "Selected " + ss2[position],Toast.LENGTH_LONG).show();
                }
                // get spinner value


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (!adapterView.getItemAtPosition(position).equals("Yandal/ Çift Anadal")) {
                    Toast.makeText(adapterView.getContext(), "Selected " + ss3[position],Toast.LENGTH_LONG).show();
                }
                // get spinner value


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (!adapterView.getItemAtPosition(position).equals("Yaz OKulu")) {
                    Toast.makeText(adapterView.getContext(), "Selected " + ss4[position],Toast.LENGTH_LONG).show();
                }
                // get spinner value


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                if (!adapterView.getItemAtPosition(position).equals("Resmi Günler")) {
                    Toast.makeText(adapterView.getContext(), "Selected " + ss5[position],Toast.LENGTH_LONG).show();
                }
                // get spinner value


            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        return view;
    }


}