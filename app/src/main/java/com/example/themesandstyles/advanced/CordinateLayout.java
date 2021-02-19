package com.example.themesandstyles.advanced;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.ScrollView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.themesandstyles.R;

public class CordinateLayout extends AppCompatActivity {

    private ProgressBar pgbar;
    private ScrollView scrollView;
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cordinate_layout);

        scrollView= findViewById(R.id.scrollView2);
        pgbar= findViewById(R.id.progressBar);

        scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public void onScrollChange(View view, int i, int i1, int i2, int i3) {

                //scroll x =i, scroll y = i1;
                int total = scrollView.getChildAt(0).getHeight() -scrollView.getHeight();

                pgbar.setMax(total);
                pgbar.setProgress(i1);
            }
        });
    }
    
}