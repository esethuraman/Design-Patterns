package com.designpatterns.iteratorpattern.restaurant_merge;


import java.util.List;

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
     */
    public void printItems(AgkDinnerCafe dinnerCafe, DeviLunchPoint lunchPoint) {
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
