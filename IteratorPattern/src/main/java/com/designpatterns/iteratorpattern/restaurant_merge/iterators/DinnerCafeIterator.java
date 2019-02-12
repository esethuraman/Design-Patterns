package com.designpatterns.iteratorpattern.restaurant_merge.iterators;

import com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants.AgkDinnerCafe;
import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

import java.util.List;

public class DinnerCafeIterator implements MenuItemsIterator {

    private List<MenuItem> items;
    private int size;
    private int current;

    public DinnerCafeIterator(AgkDinnerCafe dinnerCafe) {
        this.items = dinnerCafe.getItems();
        this.size = items.size();
        this.current = 0;
    }

    public boolean hasNext() {
        return current < getSize();
    }

    public MenuItem next() {
        return items.get(current++);
    }

    public int getSize() {
        return size;
    }
}
