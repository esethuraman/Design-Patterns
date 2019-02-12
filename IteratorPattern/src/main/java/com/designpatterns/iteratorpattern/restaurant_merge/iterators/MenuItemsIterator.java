package com.designpatterns.iteratorpattern.restaurant_merge.iterators;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

public interface MenuItemsIterator {

    boolean hasNext();

    MenuItem next();

    int getSize();
}
