package com.dpridoy.cardswipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<CategoryModel> models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        models=new ArrayList<>();
        models=Utils.getCategory();

        adapter=new Adapter(models,this);
        viewPager=findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(0,0,0,0);
        adapter.notifyDataSetChanged();

        adapter.setOnItemClickListener(new Adapter.ClickListener() {
            @Override
            public void onClick(View v, int position) {
                TextView categoryName=v.findViewById(R.id.category);
                Intent intent=new Intent(MainActivity.this,CategoryActivity.class);
                intent.putExtra("CATEGORY_NAME",categoryName.getText().toString());
                startActivity(intent);
            }
        });
    }
}
