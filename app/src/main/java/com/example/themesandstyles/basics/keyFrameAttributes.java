package com.example.themesandstyles.basics;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.themesandstyles.R;
import com.example.themesandstyles.advanced.MainActivity2;


public class keyFrameAttributes extends AppCompatActivity {
    private Button btnShift;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_key_frame_attributes);


        btnShift=findViewById(R.id.buttonAdvanced);
        btnShift.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(keyFrameAttributes.this, MainActivity2.class));
            }
        });
    }


}