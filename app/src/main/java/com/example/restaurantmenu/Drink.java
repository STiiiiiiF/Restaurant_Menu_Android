package com.example.restaurantmenu;

public class Drink {

    private String name;
    private String description;
    private int imageRecurseId;

    private static final String LatteDesc = "Кофейный напиток, на основе молока, " +
            "представляющий собой трёхслойную смесь из пены, молока и кофе эспрессо";

    private static final String CapDesc = "Кофейный напиток итальянской кухни на основе эспрессо с добавлением в него подогретого вспененного молока";

    private static final String juiceAppleDesc = "Безалкогольный напиток из спелых плодов яблони, самый популярный сок в России";



    public static Drink[] drinks = {new Drink("Латте", LatteDesc, R.drawable.latte),
            new Drink("Капучино", CapDesc, R.drawable.cappuccino),
            new Drink("Яблочный сок", juiceAppleDesc, R.drawable.apple_juice)};

    public Drink(String name, String description, int imageRecurseId) {
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

    @Override
    public String toString() {
        return getName();
    }
}
