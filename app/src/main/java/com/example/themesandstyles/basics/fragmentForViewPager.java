package com.example.themesandstyles.basics;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.themesandstyles.R;


public class fragmentForViewPager extends Fragment {
    private int Number;
    private TextView tv;
    public fragmentForViewPager(int number) {
        this.Number = number;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        tv = getView().findViewById(R.id.text_view_for_numbers);
        tv.setText(String.valueOf(Number));
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_for_view_pager, container, false);
    }
}