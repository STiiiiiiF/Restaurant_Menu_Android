package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SaladsCategoryActivity extends AppCompatActivity {

    ListView listSalads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads_category);

        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Salads.salads);

        listSalads = findViewById(R.id.list_salads);
        listSalads.setAdapter(adapter);

        AdapterView.OnItemClickListener clickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(SaladsCategoryActivity.this, SaladsActivity.class);
                intent.putExtra(SaladsActivity.EXTRA_SALADS_ID, (int) id);
                startActivity(intent);
            }
        };

        listSalads.setOnItemClickListener(clickListener);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}