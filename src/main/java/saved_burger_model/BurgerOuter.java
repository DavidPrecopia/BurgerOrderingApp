package saved_burger_model;

import burger.BBQBurgerModel;
import burger.Burger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BurgerOuter implements IBurgerModelContract.IBurgerOuterContract {
    @Override
    public List<Burger> getBurgers() {
        return new ArrayList<Burger>(Arrays.asList(new BBQBurgerModel()));
    }
}