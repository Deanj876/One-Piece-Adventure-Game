import java.util.Scanner;
import java.util.concurrent.TimeUnit;



class Main {
    //Message Time Delay
    public static void timeDelay() {
        try {
            TimeUnit.SECONDS.sleep(2);
          }
        catch (InterruptedException ie) {
        Thread.currentThread().interrupt();
        }  
    }




    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Player Stat Variables\\
    int playerHealth = 100;
    int Attack = 20;
    int Defense = 20;
    int DFM = 0;
    int HM = 0;
    int Bounty = 150;
    String playerName = "\"...\"";

    //Player Info Gather
    System.out.println(playerName + ": Hello Grand Line!!!");
    //Intro ^^
    timeDelay();
    System.out.println("\nA Mysterious Voice is heard in a Small hut");
    System.out.println("\n\nPlayer Name :");
    playerName = sc.nextLine();
    System.out.println("\n\nShip Name :");
    String ShipName = sc.nextLine();
    System.out.println("\n\nWhich perk would you like\n(A) \"D Clan\"\n(B) Celestial Dragon\n(C) None");
    String perkChoice = sc.nextLine();
    if(perkChoice.equals("D Clan")){
        playerHealth += 20;
        Attack += 10;
        Defense += 15;
        HM += 10;
    }

    //Start to the game
    System.out.println(playerName + ": Time to start my adventure to become a great pirate!");
    int gameLoop = 0;
    while (true) {
        timeDelay();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println(playerHealth);
        //Game Loop Start

        System.out.println("[exit message]");
        gameLoop += 1;
      if (gameLoop != 0) {
        System.out.println("YOU DIED AT SEA");
        break;
      }
    }
  }
}