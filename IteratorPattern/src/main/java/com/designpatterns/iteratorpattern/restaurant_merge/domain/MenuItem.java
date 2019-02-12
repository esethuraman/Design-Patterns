package com.designpatterns.iteratorpattern.restaurant_merge.domain;

public class MenuItem {

    private String name;
    private boolean isVeg;
    private float price;

    public MenuItem(String name, boolean isVeg, float price) {
        this.name = name;
        this.isVeg = isVeg;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean isVeg() {
        return isVeg;
    }

    public float getPrice() {
        return price;
    }
}
