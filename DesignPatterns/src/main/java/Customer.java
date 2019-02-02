import Creator.PizzaFactory;
import Creator.PizzaStore;

public class Customer {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        pizzaStore.orderPizza("cheese");
    }
}
