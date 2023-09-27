import java.util.Scanner;
public class mapAndCombat{
    Scanner sc = new Scanner(System.in);
    public void combat(){
      playerStats ps = new playerStats();
      Main m = new Main();
      islandMethods im = new islandMethods();
      im.banditIsland();
    }
    public void map(){
      int logPostLevel = 0;
      Main m = new Main();
        while(true){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("----Your current log post is pointing to a small island known as \"Bandit Island\".----");
            System.out.println("\nDo you wish to go to the Bandit Island? (Y/N):");
            String islandChoice = sc.nextLine();
            if(islandChoice.equals("y") || islandChoice.equals("Y")){
              System.out.println("\n----HEADING TO BANDIT ISLAND----");
              m.timeDelay();
              combat();
            }
            else{
              System.out.println("\n----You decide to stay on the ship.----");
              break;
            }
        }
    }
    //Bandit Minion Combat Phase
    public void banditMinion(){
      playerStats ps = new playerStats();
      externalVariables ev = new externalVariables();
      shop s = new shop();
      Main m = new Main();
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println("----YOU ENCOUNTERED A BANDIT MINION----");
      while(true){
        m.timeDelay();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("Bandit Minion\nHealth: " + ps.banditHealth + "\nBounty: " + ps.banditBounty);
        System.out.println("\n" + ev.playerName + "\nHealth: " + ps.playerHealth + "\nBounty: " + ps.Bounty);
        if(s.devilFruitCounter == 0){
          System.out.println("\nWhat would you like to do?\n1.Attack (1)\n2.Defend (2)\n3.Run (3)");
          String combatChoice = sc.nextLine();
          //Run
          if(combatChoice.equals("3")){
            System.out.println("\nYou ran away from the Bandit Minion.");
            break;
          }
          //Attack
          else if(combatChoice.equals("1")){
            System.out.println("\nYou attacked the Bandit Minion.");
            ps.banditHealth -= ps.Attack;
            System.out.println("\nYou took " + ps.Attack + " from the Bandit Minion.");
            if(ps.banditHealth <= 0){
              System.out.println("\nYou defeated the Bandit Minion.");
              break;
            }
            else{
              System.out.println("\nThe Bandit Minion attacked you.");
              ps.playerHealth -= ps.banditAttack;
              System.out.println("\nThe Bandit Minion took " + ps.banditAttack + " from you.");
              if(ps.playerHealth <= 0){
                System.out.println("\nYou were defeated by the Bandit Minion.");
                System.out.println("Your bounty was raised by 100!");
                ps.Bounty += 100;
                break;
              }
            }
          }
          //Defend
          else if(combatChoice.equals("2")){
            System.out.println("\nYou defended against the Bandit Minion.");
            ps.playerHealth -= ps.banditAttack / 2;
            System.out.println("\nThe Bandit Minion only took " + ps.banditAttack / 2 + " from you.");
            if(ps.playerHealth <= 0){
              System.out.println("\nYou were defeated by the Bandit Minion.");
              break;
            }
          }
          else{
            System.out.println("\nSorry what was that?");
          }
        }
        else if(s.devilFruitCounter >= 1){
          System.out.println("\nWhat would you like to do?\n1.Attack (1)\n2.Defend (2)\n3.Run (3)\n4.Use Devil Fruit (4)");
          String combatChoice = sc.nextLine();
        }
      }
    }
    //Bandit Boss Combat Phase
}
