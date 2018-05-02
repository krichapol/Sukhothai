package com.cs58.sci.sukhothai;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    //Explicit
    TextView titleTextView, detailTextView;
    ImageView sukoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Initial View
        titleTextView = findViewById(R.id.txvTitle);
        detailTextView = findViewById(R.id.txvDetail);
        sukoImageView = findViewById(R.id.imvSuko);

        //รับข้อมูลจากการ Intent ไปแสดงบนหน้า XML
        titleTextView.setText(getIntent().getStringExtra("Title"));
        detailTextView.setText(getIntent().getStringExtra("Detail"));
        sukoImageView.setImageResource(getIntent().getIntExtra("Image",R.mipmap.ic_launcher));

    }// end onCreate Method


    public void clickBack(View view) { finish(); }

}//end Class
