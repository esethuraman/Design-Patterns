package com.designpatterns.iteratorpattern.restaurant_merge.simple_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;
import com.designpatterns.iteratorpattern.restaurant_merge.iterators.LunchPointIterator;

import java.util.Iterator;

public class DeviLunchPoint implements Restaurant {

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

    public Iterator getIteraror() {
        return new LunchPointIterator(this);
    }
}
