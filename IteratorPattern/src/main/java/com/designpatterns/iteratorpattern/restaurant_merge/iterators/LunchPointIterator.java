package com.designpatterns.iteratorpattern.restaurant_merge.iterators;

import com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants.DeviLunchPoint;
import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

public class LunchPointIterator implements MenuItemsIterator {

    private MenuItem[] items;
    private int size;
    private int current;

    public LunchPointIterator(DeviLunchPoint lunchPoint) {
        this.items = lunchPoint.getItems();
        this.size = items.length;
        this.current = 0;
    }

    public boolean hasNext() {
        return current < getSize();
    }

    public MenuItem next() {
        return items[current++];
    }

    public int getSize() {
        return size;
    }
}
