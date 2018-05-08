package com.bw.com.keji.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


import com.bw.com.keji.MainActivity;
import com.bw.com.keji.R;
public class deng_lu extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deng_lu);
        Button dl=findViewById(R.id.dl);
        dl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deng_lu.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }



    }





