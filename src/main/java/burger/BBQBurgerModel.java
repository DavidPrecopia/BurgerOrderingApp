package burger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BBQBurgerModel implements Burger {

    private final String name;
    private final double basePrice;
    private final List<Toppings> defaultToppings;
    private final List<Toppings> addedToppings;

    public BBQBurgerModel(){
        this.name = "BBQ";
        this.basePrice = 6.45;
        this.defaultToppings = new ArrayList<>(Arrays.asList(Toppings.CHEESE, Toppings.ONION, Toppings.TOMATOES, Toppings.PICKLES ));
        this.addedToppings =  new ArrayList<>();
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.basePrice;
    }

    @Override
    public List<Toppings> getDefaultToppings() {
        return this.defaultToppings;
    }

    @Override
    public void addToToppings(Toppings toppingName) {
        this.addedToppings.add(toppingName);
    }

    @Override
    public List<Toppings> getAddedToppings() {
        return this.addedToppings;
    }
}