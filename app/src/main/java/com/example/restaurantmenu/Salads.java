package com.example.restaurantmenu;

import androidx.annotation.NonNull;

public class Salads {

    private String name;
    private String description;
    private int imageRecurseId;

    public static final Salads[] salads = {new Salads("Греческий", "Салат из помидоров, сладкого перца, огурцов, феты, шалота и маслин," +
            " заправленный оливковым маслом с солью, чёрным перцем, душицей.", R.drawable.greek),
            new Salads("Капрезе", "Считается одним из главных символов Италии, так как три цвета" +
                    " его основных ингредиентов — базилика, моцареллы и помидоров — цвета национального флага: зеленый, белый и красный.", R.drawable.caprese),
            new Salads("Салат с тунцом", "Простой и вкусный салат с тунцом, яйцом и огурчиком. Минимум ингредиентов, а результат всегда потрясающий.", R.drawable.tuna)};

    public Salads(String name, String description, int imageRecurseId) {
        this.name = name;
        this.description = description;
        this.imageRecurseId = imageRecurseId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageRecurseId() {
        return imageRecurseId;
    }

    @NonNull
    @Override
    public String toString() {
        return getName();
    }
}
