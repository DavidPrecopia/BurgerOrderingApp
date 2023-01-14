package common;

public class Utils {

      public static boolean evalInput(String input) {
            //TODO Expand options
            return (notANumber(input) && isRightLength(input));
      }

      private static boolean isRightLength(String input) {
            return input.length() == 1;
      }

      private static boolean notANumber(String input) {
            return !input.matches("[0-9]+");
      }
}