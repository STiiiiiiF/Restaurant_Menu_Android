package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SaladsActivity extends AppCompatActivity {

    TextView textView, descriptions;
    ImageView imageView;

    public static final String EXTRA_SALADS_ID = "saladsId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);

        int saladsId = (Integer) getIntent().getExtras().get(EXTRA_SALADS_ID);

        Salads salads = Salads.salads[saladsId];
        textView = findViewById(R.id.name);
        textView.setText(salads.getName());
        descriptions = findViewById(R.id.description);
        descriptions.setText(salads.getDescription());
        imageView = findViewById(R.id.photo);
        imageView.setImageResource(salads.getImageRecurseId());
        imageView.setContentDescription(salads.getName());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}