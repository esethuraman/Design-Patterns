package com.designpatterns.iteratorpattern.restaurant_merge.simple_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

import java.util.Iterator;

public interface Restaurant {

    Iterator<MenuItem> getIteraror();
}
