package com.designpatterns.iteratorpattern.restaurant_merge;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AgkDinnerCafe agkDinnerCafe = new AgkDinnerCafe();
        agkDinnerCafe.setItem(getDinnerItems());

        DeviLunchPoint deviLunchPoint = new DeviLunchPoint(5);
        deviLunchPoint.setItems(getLunchItems(5));

        NoIteratorHybridRestaurant hybridRestaurant = new NoIteratorHybridRestaurant();
        hybridRestaurant.printItems(agkDinnerCafe, deviLunchPoint);
    }

    private static List<MenuItem> getDinnerItems() {
        List<MenuItem> dinnerItems = new ArrayList<MenuItem>();

        dinnerItems.add(new MenuItem("Dosa", true, 35));
        dinnerItems.add(new MenuItem("Idly", true, 25));
        dinnerItems.add(new MenuItem("Chappathi", true, 35));
        dinnerItems.add(new MenuItem("Parotta", true, 30));
        dinnerItems.add(new MenuItem("Egg Parotta", false, 50));
        dinnerItems.add(new MenuItem("Chicken curry", false, 75));

        return dinnerItems;
    }

    private static MenuItem[] getLunchItems(int maxItems) {
        MenuItem[] lunchItems = new MenuItem[maxItems];

        lunchItems[0] = new MenuItem("Chiken Biryani", false, 120);
        lunchItems[1] = new MenuItem("Fish rice", false, 140);
        lunchItems[2] = new MenuItem("Sambar rice", true, 60);
        lunchItems[3] = new MenuItem("Curd rice", true, 40);
        lunchItems[4] = new MenuItem("Egg masala", false, 30);

        return lunchItems;
    }
}
