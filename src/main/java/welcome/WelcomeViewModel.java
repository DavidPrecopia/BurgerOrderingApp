package welcome;

import burger.Burger;

import java.util.ArrayList;
import java.util.List;

//holding data
public class WelcomeViewModel {
    final String welcomeText = "Welcome to Burger App";
    private final List<Burger> burgerList;
    public WelcomeViewModel(){
        this.burgerList = new ArrayList<>();
    }

    public List<Burger> getBurgerList() {
        return burgerList;
    }

    public void setBurgerList(List<Burger> burgerList){
        this.burgerList.clear();
        this.burgerList.addAll(burgerList);
    }
}