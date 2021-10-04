package com.example.kafeteriacoffeina;

public class Workout {
    private String name;
    private String descritpion;

    public static final Workout[] workouts = {
            new Workout("Rozciąganie kończyn", "5 pompek w staniu na rękack"),
            new Workout("Tylko dla mięczaków", "100 pompek")
    };

    public Workout(String name, String descritpion) {
        this.name = name;
        this.descritpion = descritpion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }
}
