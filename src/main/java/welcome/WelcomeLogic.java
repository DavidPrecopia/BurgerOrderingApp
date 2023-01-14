package welcome;

import common.Utils;
import saved_burger_model.IBurgerModelContract;
import saved_burger_model.IBurgerModelContract.IBurgerOuterContract;
import saved_burger_model.IBurgerModelContract.ISavedBurgerModelContract;
import welcome.WelcomeLogicEvents.Event;

// backend logic, communicates with model and view
public class WelcomeLogic implements IWelcomeViewContract.logic {

      private IWelcomeViewContract.View welcomeView;
      private final WelcomeViewModel welcomeViewModel;
      private final ISavedBurgerModelContract savedBurgerModelContract;
      private final IBurgerOuterContract burgerOuter;

      public WelcomeLogic(
              WelcomeViewModel welcomeViewModel,
              ISavedBurgerModelContract savedBurgerModelContract,
              IBurgerOuterContract burgerOuter) {
            this.welcomeViewModel = welcomeViewModel;
            this.savedBurgerModelContract = savedBurgerModelContract;
            this.burgerOuter = burgerOuter;
      }


      private void init(IWelcomeViewContract.View view) {
            this.welcomeView = view;
            welcomeViewModel.setBurgerList(burgerOuter.getBurgers());
            welcomeView.onLogicEvent(new WelcomeLogicEvents(Event.START_VIEW, welcomeViewModel.getBurgerList()));
      }

      @Override
      public void onEvent(WelcomeViewEvents event) {
            switch (event.getEvent()) {

                  case INIT:
                        init((IWelcomeViewContract.View) event.getData());
                        break;
                  case BURGER_SELECTED:
                        //TODO Check if fails
                        this.burgerSelected(event.getData().toString());
                        break;
                  case DONE_CLICKED:
                        break;
            }
      }

      private void burgerSelected(String input) {
            if (Utils.evalInput(input)) {
                  welcomeView.onLogicEvent(new WelcomeLogicEvents(Event.DISPLAY_INVALID_INPUT, null));
                  welcomeView.onLogicEvent(new WelcomeLogicEvents(Event.START_VIEW, welcomeViewModel.getBurgerList()));
            }
      }
}