package com.dpridoy.cardswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Intent intent =getIntent();
        String categoryName = intent.getStringExtra("CATEGORY_NAME");
        Log.e("Category",categoryName);
    }
}
