package com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

public class DeviLunchPoint {

    private MenuItem[] items;
    private int itemSize;

    public DeviLunchPoint(int itemSize) {
        items = new MenuItem[itemSize];
    }

    public MenuItem[] getItems() {
        return items;
    }

    public void setItems(MenuItem[] items) {
        this.items = items;
    }

}
