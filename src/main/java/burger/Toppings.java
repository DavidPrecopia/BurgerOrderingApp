package burger;

public enum Toppings {
    CHEESE("Cheese", 1.0),
    TOMATOES("Tomatoes", 0.50),
    ONION("Onion", 0.40),
    PICKLES("Pickles", 0.65);

    private final String name;
    private final double price;

    Toppings(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}