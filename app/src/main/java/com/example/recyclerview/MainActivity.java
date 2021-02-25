package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView programminglist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        programminglist=findViewById(R.id.programminglist);
        programminglist.setLayoutManager(new LinearLayoutManager(this));
        String []languages={"JAVA","PHP","PYTHON","FLUTTER","JAVASCRIPT","JAVA","PHP","PYTHON","FLUTTER","JAVASCRIPT","JAVA","PHP","PYTHON","FLUTTER","JAVASCRIPT"};
        int[] pics={R.drawable.ad,R.drawable.ae,R.drawable.ad,R.drawable.ae,R.drawable.ad,R.drawable.ae,R.drawable.ad,R.drawable.ae,R.drawable.ad,R.drawable.ae,R.drawable.ad,R.drawable.ae,R.drawable.ad,R.drawable.ae,R.drawable.ad,};
        programminglist.setAdapter(new programmingAdapter(languages,pics));

    }
}