package com.designpatterns.iteratorpattern.restaurant_merge.hybrid_restaurants;


import com.designpatterns.iteratorpattern.restaurant_merge.simple_restaurants.Restaurant;
import com.designpatterns.iteratorpattern.restaurant_merge.domain.MenuItem;

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
    public void printItems(Restaurant lunchPoint, Restaurant dinnerCafe) {
        System.out.println("------------- LUNCH MENU ----------");
//       Now that a common Restaurant interface is created for LunchPoint and DinnerCafe, commenting
//       these as getItems() is no more discoverable by JVM due to Dynamic Binding issue.

//        for(MenuItem item : lunchPoint.getItems()) {
//            System.out.println(item.getName() + " " + isVeg(item) + " ------ RS: " +  item.getPrice());
//        }

        System.out.println("------------- DINNER MENU ----------");
//        for(MenuItem item : dinnerCafe.getItems()) {
//            System.out.println(item.getName() + " " + isVeg(item) + " ------ RS: " +  item.getPrice());
//        }
    }

    private String isVeg(MenuItem item) {
        return item.isVeg() ? "(Veg)" : "(Non-Veg)";
    }
}
