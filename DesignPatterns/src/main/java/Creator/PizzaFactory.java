package Creator;

import Product.BuffaloChickenPizza;
import Product.CheesePizza;
import Product.VegPizza;
import Product.Pizza;

public class PizzaFactory {
    public Pizza createPizza(String type) {

        Pizza pizza;

        if(type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza();
        }
        else if(type.equalsIgnoreCase("veg")) {
            pizza = new VegPizza();
        }
        else if(type.equalsIgnoreCase("buffaloe")) {
            pizza = new BuffaloChickenPizza();
        }
        else {
            pizza = null;
        }

        return pizza;
    }

}
