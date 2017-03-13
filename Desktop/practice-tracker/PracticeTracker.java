import java.io.Console;

public class PracticeTracker {
  public static void main(String[] args) {
    Integer totalTime = 0;
    totalTime += askHowMuchTime("yesterday");
    totalTime += askHowMuchTime("two days ago");
    totalTime += askHowMuchTime("so far today");
    String stringTotalTime = Integer.toString(totalTime);
    if (totalTime >= 12) {
      System.out.println("Great job, Nathaniel! You practiced for a total of " + stringTotalTime + " hours.");
    } else {
      System.out.println("Too bad, Liam! You only practiced for " + stringTotalTime + " hours. Are you serious about learning to code?");
    }
  }

  public static Integer askHowMuchTime(String day) {
    Console myConsole = System.console();
    System.out.println("How much time did you code for " + day + "?");
    String stringYourTime = myConsole.readLine();
    Integer yourTime = Integer.parseInt(stringYourTime);
    System.out.println("You coded for " + stringYourTime + " hours " + day + ".");
    return yourTime;
  }
}
