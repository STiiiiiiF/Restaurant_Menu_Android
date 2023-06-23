package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantmenu.R;

public class DrinkActivity extends AppCompatActivity {

    public static final String EXTRA_DRINK_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        int drinkId = (Integer) getIntent().getExtras().get(EXTRA_DRINK_ID);

        Drink drink = Drink.drinks[drinkId];

        TextView textView = findViewById(R.id.name);
        textView.setText(drink.getName());

        TextView texDescription = findViewById(R.id.description);
        texDescription.setText(drink.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(drink.getImageRecurseId());
        photo.setContentDescription(drink.getName());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}