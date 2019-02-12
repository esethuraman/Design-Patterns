package com.designpatterns.iteratorpattern.restaurant_merge.hybrid_restaurants;


import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;
import com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants.AgkDinnerCafe;
import com.designpatterns.iteratorpattern.restaurant_merge.concrete_restaurants.DeviLunchPoint;

/**
 * This restaurant acquires both AGK and Devi restaurants. Hence expected to incorporate all their
 * menu items here dynamically.
 */
public class NoIteratorHybridRestaurant {

    /*
    ISSUES WITHOUT ITERATOR PATTERN:
     (1) Two loops are needed since items are of different types ie. arrays & lists
     (2) Encapsulation is violated. Because this class has to be aware of the concrete types
     (3) Code Duplication: Loop is repeated for different classes
     (4) Instead of being concerned about printing the menu, this class has to worry about
     other stuffs. Hence, SRP is violated too.
     */
    public void printItems(DeviLunchPoint lunchPoint, AgkDinnerCafe dinnerCafe) {
        System.out.println("------------- LUNCH MENU ----------");
        for(MenuItem item : lunchPoint.getItems()) {
            System.out.println(item.getName() + " " + isVeg(item) + " ------ RS: " +  item.getPrice());
        }

        System.out.println("------------- DINNER MENU ----------");
        for(MenuItem item : dinnerCafe.getItems()) {
            System.out.println(item.getName() + " " + isVeg(item) + " ------ RS: " +  item.getPrice());
        }
    }

    private String isVeg(MenuItem item) {
        return item.isVeg() ? "(Veg)" : "(Non-Veg)";
    }
}
