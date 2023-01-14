package common;

import saved_burger_model.BurgerOuter;
import saved_burger_model.IBurgerModelContract.IBurgerOuterContract;
import saved_burger_model.IBurgerModelContract.ISavedBurgerModelContract;
import saved_burger_model.SavedBurgerModel;
import welcome.WelcomeLogic;
import welcome.WelcomeView;
import welcome.WelcomeViewModel;

//injecting all dependencies the class needs
public class DependenciesInjection {

    private ISavedBurgerModelContract iSavedBurgerModelContract;
    private IBurgerOuterContract iBurgerOuterContract;

    public DependenciesInjection() {

    }

    public void welcomeView() {
        new WelcomeView(getWelcomeLogic());
    }

    private WelcomeLogic getWelcomeLogic() {
        return new WelcomeLogic(getWelcomeViewModel(), getISavedBurgerModelContract(), getIBurgerOuterContract());
    }

    private WelcomeViewModel getWelcomeViewModel() {
        return new WelcomeViewModel();
    }


    // model class fulfills the contract (encapsulation reasons)
    // creates singleton (returns exact same version of Burger throughout the whole app)
    private ISavedBurgerModelContract getISavedBurgerModelContract() {
        if (iSavedBurgerModelContract == null) {
            this.iSavedBurgerModelContract = new SavedBurgerModel();
        }
        return this.iSavedBurgerModelContract;
    }
    
    private IBurgerOuterContract getIBurgerOuterContract(){
        if(iBurgerOuterContract == null){
            this.iBurgerOuterContract = new BurgerOuter();
        }
        return this.iBurgerOuterContract;
    }

}