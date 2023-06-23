package com.example.restaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {

    public static final String EXTRA_FOOD_ID = "foodId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        int foodId = (Integer) getIntent().getExtras().get(EXTRA_FOOD_ID);

        Food food = Food.food[foodId];

        TextView textView = findViewById(R.id.name);
        textView.setText(food.getName());

        TextView description = findViewById(R.id.description);
        description.setText(food.getDescription());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(food.getImageRecurseId());
        photo.setContentDescription(food.getName());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
}