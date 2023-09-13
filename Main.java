import java.util.Scanner;
import java.util.concurrent.TimeUnit;

//Message Time Delay
public static void timeDelay(){
    try {
        TimeUnit.SECONDS.sleep(2);
      }
    catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
    }  
}



class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String playerName = "\"...\"";
    System.out.println(playerName + ":Hello Grand Line!!!");
    // int userInput = 0;
    // while (true) {
    //   // print context for current decision

    //   // print list of options for current decision
      
    //   // read user input
      
    //   // update decision state for next iteration

    //   if (userInput == 1) {
    //     System.out.println("[exit message]");
    //     break;
    //   }
    // }
  }
}