package com.bw.com.keji.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bw.com.keji.MainActivity;
import com.bw.com.keji.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Zhu_che extends AppCompatActivity {

    @BindView(R.id.zc)
    Button zc;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhu_che);
        ButterKnife.bind(this);
         zc.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent intent = new Intent(Zhu_che.this, MainActivity.class);
                 startActivity(intent);
             }
         });

    }
}