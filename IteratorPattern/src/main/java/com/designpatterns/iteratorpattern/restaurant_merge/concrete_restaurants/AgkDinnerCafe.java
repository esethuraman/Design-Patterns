package com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

import java.util.List;

public class AgkDinnerCafe {

    private List<MenuItem> items;

    public void setItem(List<MenuItem> items) {
        this.items = items;
    }

    public List<MenuItem> getItems() {
        return items;
    }


}
