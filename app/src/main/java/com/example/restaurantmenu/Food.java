package com.example.restaurantmenu;

public class Food {

    private String name;
    private String description;
    private int imageRecurseId;

    public static final Food[] food = {new Food("Бифштекс ",
            "Блюдо из жареной говядины. Как следует уже из самого из названия, традиционно приготовление бифштекса происходит из говядины",
            R.drawable.beef), new Food("Шашлык", "Изначально блюдо стран Западной и Центральной Азии, " +
            "а также Восточной Европы, из баранины мелкой нарезки, нанизанное на шампур и запечённое на древесном угле в " +
            "мангале.", R.drawable.shashlik), new Food("Рыба в маринаде", "Типичная рыбная закуска советской кухни, " +
            "по своей популярности соперничавшая с сельдью под шубой.", R.drawable.fish)};

    public Food(String name, String description, int imageRecurseId) {
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
