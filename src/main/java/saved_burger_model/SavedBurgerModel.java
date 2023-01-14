package saved_burger_model;

import burger.Burger;

public class SavedBurgerModel implements IBurgerModelContract.ISavedBurgerModelContract {

    private Burger burger;


    public SavedBurgerModel() {
    }

    @Override
    public void saveBurger(Burger burger) {
        this.burger = burger;
    }

    @Override
    public Burger getSaveBurger() {
        return this.burger;
    }
}