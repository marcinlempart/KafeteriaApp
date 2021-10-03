package com.example.kafeteriacoffeina;

public class Drink {

    private String name;
    private String description;


    public static final Drink[] drinks = {
            new Drink("Late", "Czarne espresso z gorącym mlekiem i mleczną pianką."),
            new Drink("Cappucino", "Czarne espresso z dużą ilością spienionego mleka"),
            new Drink("Espresso", "Czarna kawa ze świeżo mielonych ziaren najwyższej jakości"),
    };

    public Drink(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
