package com.designpatterns.iteratorpattern.restaurant_merge;

public class DeviLunchPoint {

    private MenuItem[] items;
    private int itemSize;

    DeviLunchPoint(int itemSize) {
        items = new MenuItem[itemSize];
    }

    public MenuItem[] getItems() {
        return items;
    }

    public void setItems(MenuItem[] items) {
        this.items = items;
    }

}
