package com.example.pr98.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.pr98.R;

import java.util.ArrayList;

public class UnitsFragment extends Fragment {
    private ListView listViewUnit;


    public UnitsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_units, container, false);
        listViewUnit = view.findViewById(R.id.list_view_unit);
        return view;
    }

    private ArrayList<Unit> createUnits() {
        ArrayList<Unit> arrayListUnits=new ArrayList<>();
        String[] name = {"logo", "asd", "JOJO02", "JOJO3", "JOJO04", "JOJO05"};
        int[] age = {20, 25, 30, 35, 40, 45};
        int[] image = {R.drawable.asd, R.drawable.asd, R.drawable.asd, R.drawable.asd, R.drawable.asd, R.drawable.asd};
        for (int i = 0; i < name.length; i++) {
            Unit unit=new Unit(name[i],age[i],image[i]);
            arrayListUnits.add(unit);
        }
        return arrayListUnits;
    }
}