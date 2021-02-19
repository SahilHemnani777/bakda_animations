package com.example.themesandstyles.advanced;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.themesandstyles.R;
import com.example.themesandstyles.SplashScreen;

public class MainActivity2 extends AppCompatActivity {

    private  Button btn1;
    private Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn1= findViewById(R.id.crdntLyt);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, CordinateLayout.class));
            }
        });

        btn2=findViewById(R.id.splshScrnAnim);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, SplashScreen.class));
            }
        });
    }
}