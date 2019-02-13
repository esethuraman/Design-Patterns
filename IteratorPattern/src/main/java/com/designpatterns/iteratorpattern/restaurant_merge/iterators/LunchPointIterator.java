package com.designpatterns.iteratorpattern.restaurant_merge.iterators;

import com.designpatterns.iteratorpattern.restaurant_merge.simple_restaurants.DeviLunchPoint;
import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

import java.util.Iterator;

public class LunchPointIterator implements Iterator {

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

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public int getSize() {
        return size;
    }
}
