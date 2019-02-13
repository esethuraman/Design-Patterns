package com.designpatterns.iteratorpattern.restaurant_merge.simple_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;
import com.designpatterns.iteratorpattern.restaurant_merge.iterators.DinnerCafeIterator;

import java.util.Iterator;
import java.util.List;

public class AgkDinnerCafe implements Restaurant {

    private List<MenuItem> items;

    public void setItem(List<MenuItem> items) {
        this.items = items;
    }

    public List<MenuItem> getItems() {
        return items;
    }


    public Iterator getIteraror() {
        return new DinnerCafeIterator(this);
    }
}
