package saved_burger_model;
import java.util.List;
import burger.Burger;

public interface IBurgerModelContract {
    // contract between front and back end
    interface ISavedBurgerModelContract {

        void saveBurger(Burger burger);

        Burger getSaveBurger();

    }

    interface IBurgerOuterContract{
        List<Burger> getBurgers();
    }
}