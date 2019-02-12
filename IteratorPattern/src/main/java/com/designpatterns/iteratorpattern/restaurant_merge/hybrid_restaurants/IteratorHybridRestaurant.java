package com.designpatterns.iteratorpattern.restaurant_merge.hybrid_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;
import com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants.AgkDinnerCafe;
import com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants.DeviLunchPoint;
import com.designpatterns.iteratorpattern.restaurant_merge.iterators.DinnerCafeIterator;
import com.designpatterns.iteratorpattern.restaurant_merge.iterators.LunchPointIterator;
import com.designpatterns.iteratorpattern.restaurant_merge.iterators.MenuItemsIterator;

public class IteratorHybridRestaurant {

    public void printItems(DeviLunchPoint lunchPoint, AgkDinnerCafe dinnerCafe) {

        /*
        Instead of using the concrete classes, this now uses iterators
         */
        MenuItemsIterator lunchPointIterator = new LunchPointIterator(lunchPoint);
        MenuItemsIterator dinnerCafeIterator = new DinnerCafeIterator(dinnerCafe);

        System.out.println("------------- LUNCH MENU ----------");
        printItemsHelper(lunchPointIterator);
        System.out.println("------------- DINNER MENU ----------");
        printItemsHelper(dinnerCafeIterator);
    }

    /*
    With Iterator pattern implemented, this hybrid restaurant does not have to worry about the
    acquired restaurants' concrete types. It seamlessly acts upon the iterators and hence this common
    method can be used for all.
     */
    private void printItemsHelper(MenuItemsIterator menuItemsIterator) {
        while(menuItemsIterator.hasNext()) {
            MenuItem item = menuItemsIterator.next();
            System.out.println(item.getName() + " " + isVeg(item) + " ------ RS: " +  item.getPrice());
        }
    }

    private String isVeg(MenuItem item) {
        return item.isVeg() ? "(Veg)" : "(Non-Veg)";
    }
}
