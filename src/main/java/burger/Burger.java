package burger;

import java.util.List;

// holds the list of method's names (contract with any class that implements this interface to hold those methods)
public interface Burger {

    String getName();

    double getPrice();

    List<Toppings> getDefaultToppings();

    void addToToppings(Toppings toppingName);

    List<Toppings> getAddedToppings();


}