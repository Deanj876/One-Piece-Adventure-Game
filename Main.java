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
    shop s = new shop();
    String playerName = "\"...\"";

    //Player Info Gather
    System.out.println(playerName + ": Hello Grand Line!!!");
    //Intro ^^
    timeDelay();
    System.out.println("\nA Mysterious Voice is heard in a Small hut");
    //Player Name
    System.out.println("\n\nPlayer Name :");
    playerName = sc.nextLine();
    //Ship name
    System.out.println("\n\nShip Name :");
    String ShipName = sc.nextLine();
    //Deciding what perk / if you want a perk
    System.out.println("\n\nWhich perk would you like\n(A) \"D Clan\"\n(B) Celestial Dragon\n(C) None");
    String perkChoice = sc.nextLine();
    //Making D-Clan perk / stat changes
    if(perkChoice.equals("A")){
        ps.playerHealth += 20;
        ps.Attack += 10;
        ps.Defense += 15;
        ps.HM += 10;
    }
    //Making Celestial Dragon perk / stat changes
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
            //Player base stats
            System.out.println("\n----[" + playerName + " Stats]----");
            System.out.println("Health Points: " + ps.playerHealth);
            System.out.println("Attack Points: " + ps.Attack);
            System.out.println("Defense Points: " + ps.Defense);
            System.out.println("General Haki Mastery: " + ps.HM);
            System.out.println("Bounty: " + ps.Bounty);
            //D-Clan stat changes
            if(perkChoice.equals("A")){
              System.out.println("\n----[D-Clan Stat Perks]----");
              System.out.println("Health Points: +0.25% ( +20hp )");
              System.out.println("Attack Points: +10ap");
              System.out.println("Defense Points: +15dp");
              System.out.println("General Haki Mastery: +10hm ");
            }
            //Celestial dragon stat changes
            else if(perkChoice.equals("B")){
              System.out.println("\n----[Celestial Dragon Stat Perks]----");
              System.out.println("Health Points: -0.25% ( -20 )");
              System.out.println("Attack Points: -10ap");
              System.out.println("Defense Points: -20dp");
            }
            System.out.println("Go back to main area? (Y/N)");
            input = sc.nextLine();
            //Decided whether to go back to the main game selection
            if(input.equals("Y") || input.equals("y")){
              break;
            }
            else{
              
            }
          }
        }
        //Player sleeps
        else if(input.equals("3")){
          System.out.println("You go back to the" + ShipName + "'s Captains Cabin to sleep");
          //Progresses the day
          ev.dayCounter += 1;
          System.out.println("\nThe Day is: " + ev.dayCounter);

        }
        else if(input.equals("2")){
          System.out.println(playerName + " goes to the local shop on the island!");
          s.playerShop();

        }
      //Ends the game
      if (gameLoop != 0) {
        System.out.println("YOU DIED AT SEA");
        break;
      }
    }
  }
}