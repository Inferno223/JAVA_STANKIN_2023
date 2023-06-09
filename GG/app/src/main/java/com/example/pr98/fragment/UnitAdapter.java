package com.example.pr98.fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pr98.R;

import java.util.ArrayList;
import java.util.Vector;

public class UnitAdapter extends ArrayAdapter<Unit> {

    public UnitAdapter(Context context, Unit[] units) {
        super(context, R.layout.unit, units);
    }

    public  UnitAdapter(Context context, ArrayList<Unit> units){
        super(context, R.layout.unit, units);
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup){
        final Unit unit = getItem(position);
        if (view == null)
            view = LayoutInflater.from(getContext()).inflate(R.layout.unit, null);
        ((ImageView) view.findViewById(R.id.image_view_unit)).setImageResource(unit.getImage());
        ((TextView) view.findViewById(R.id.text_view_unit_name)).setText(unit.getName());
        ((TextView) view.findViewById(R.id.text_view_unit_age)).setText(unit.getAge() + "");
        return view;
    }
}
