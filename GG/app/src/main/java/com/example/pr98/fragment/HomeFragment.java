package com.example.pr98.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pr98.FileProc;
import com.example.pr98.R;

import java.io.File;

public class HomeFragment extends Fragment {
    private int count;
    private TextView textViewCount;
    private ImageView imageViewLVL;
    private Button buttonClick;
    private static final String ARG_COUNT="COUNT";
    private String mParam2;
    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String count) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_COUNT, count);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           count=getArguments().getInt(ARG_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        textViewCount = view.findViewById(R.id.text_view_count);
        imageViewLVL = view.findViewById(R.id.image_view_lvl);
        buttonClick = view.findViewById(R.id.button_click);
        count = 0;
        buttonClick.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               count++;
               textViewCount.setText(count + "");
           }
        });
        return view;
        }
        @Override
    public void onPause(){
        super.onPause();
        FileProc fileProc=new FileProc();
        fileProc.writeFile(count,getContext());
        }
        @Override
    public void onResume() {
            super.onResume();
        }
    }
