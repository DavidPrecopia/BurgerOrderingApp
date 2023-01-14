package welcome;

import burger.Burger;

import java.util.List;
import java.util.Scanner;

// keep as dumb as possible, all logic should be done by WelcomeLogic(controller) class
public class WelcomeView implements IWelcomeViewContract.View {

      private final IWelcomeViewContract.logic welcomeLogic;

      public WelcomeView(IWelcomeViewContract.logic welcomeLogic) {
            this.welcomeLogic = welcomeLogic;
            welcomeLogic.onEvent(new WelcomeViewEvents(WelcomeViewEvents.Event.INIT, this)); //calls this class
      }

      private void startView(List<Burger> burgers) {
            System.out.println("Welcome to Burger App");
            printAvailableBurgers(burgers);
            this.scanForInput();
      }

      private void scanForInput() {
            //TODO Close Scanner ".close()"
            String input = new Scanner(System.in).next();
            welcomeLogic.onEvent(new WelcomeViewEvents(WelcomeViewEvents.Event.BURGER_SELECTED, input));
      }

      public void printAvailableBurgers(List<Burger> burgers) {
            int index = 1;

            for (Burger burger : burgers) {
                  System.out.println("[" + index + "] " + burger.getName() + " - $" + burger.getPrice());
                  index++;
            }
      }

      @Override
      public void onLogicEvent(WelcomeLogicEvents event) {
            switch (event.getEvent()) {

                  case START_VIEW:
                        startView((List<Burger>) event.getData());
                        break;
                  case DISPLAY_INVALID_INPUT:
                        this.displayInvalidInput();
                        break;
            }
      }

      private void displayInvalidInput() {
            System.out.println("ERROR");
      }
}