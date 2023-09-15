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
    playerStats ps = new playerStats();
    externalVariables ev = new externalVariables();
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

    if(perkChoice.equals("A")){
        ps.playerHealth += 20;
        ps.Attack += 10;
        ps.Defense += 15;
        ps.HM += 10;
    }
    else if(perkChoice.equals("B")){
        ps.playerHealth -= 20;
        ps.Attack -= 10;
        ps.Defense -= 15;
    }

    //Start to the game
    System.out.println("\n"+ playerName + ": Time to start my adventure to become a great pirate!");
    int gameLoop = 0;
    while (true) {
        timeDelay();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        //Game Loop Start
        System.out.println("What would you Like to do?\n\n1.Look at a Log Post for Directions (1)\n2.Go to a shop(2)\n3.Rest(3)\n4.Look at your stats?(4)");
        String input = sc.nextLine();
        if(input.equals("4")){
          while (true) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("\n----[" + playerName + " Stats]----");
            System.out.println("Health Points: " + ps.playerHealth);
            System.out.println("Attack Points: " + ps.Attack);
            System.out.println("Defense Points: " + ps.Defense);
            System.out.println("Devil Fruit Mastery Points: " + ps.DFM);
            System.out.println("General Haki Mastery: " + ps.HM);
            System.out.println("Bounty: " + ps.Bounty);
            System.out.println("Go back to main area? (Y/N)");
            input = sc.nextLine();
            if(input.equals("Y") || input.equals("y")){
              break;
            }
            else{
              
            }
          }
        }

        gameLoop += 1;
      if (gameLoop != 0) {
        System.out.println("YOU DIED AT SEA");
        break;
      }
    }
  }
}