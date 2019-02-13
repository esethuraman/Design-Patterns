package com.designpatterns.iteratorpattern.restaurant_merge.hybrid_restaurants;

import com.designpatterns.iteratorpattern.restaurant_merge.simple_restaurants.Restaurant;
import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorHybridRestaurant {

    public void printItems(Restaurant lunchPoint, Restaurant dinnerCafe) {

        /*
        Beautifully generalized by subclassing restaurants under the interface Restaurant
         */
        List<Restaurant> restaurants = new ArrayList<Restaurant>(Arrays.asList(lunchPoint, dinnerCafe));
        for(Restaurant restaurant : restaurants) {
            System.out.println("------ " + restaurant.getClass().getSimpleName() + " MENU -------");
            printItemsHelper(restaurant.getIteraror());
        }


        /*
        Instead of using the concrete classes, this now uses iterators
         */
/*        Iterator<MenuItem> lunchPointIterator = new LunchPointIterator(lunchPoint);
        Iterator<MenuItem> dinnerCafeIterator = new DinnerCafeIterator(dinnerCafe);

        System.out.println("------------- LUNCH MENU ----------");
        printItemsHelper(lunchPointIterator);
        System.out.println("------------- DINNER MENU ----------");
        printItemsHelper(dinnerCafeIterator);*/
    }

    /*
    With Iterator pattern implemented, this hybrid restaurant does not have to worry about the
    acquired restaurants' concrete types. It seamlessly acts upon the iterators and hence this common
    method can be used for all.
     */
    private void printItemsHelper(Iterator<MenuItem> menuItemsIterator) {
        while(menuItemsIterator.hasNext()) {
            MenuItem item = menuItemsIterator.next();
            System.out.println(item.getName() + " " + isVeg(item) + " ------ RS: " +  item.getPrice());
        }
    }

    private String isVeg(MenuItem item) {
        return item.isVeg() ? "(Veg)" : "(Non-Veg)";
    }
}
