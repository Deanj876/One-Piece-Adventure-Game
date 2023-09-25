import java.util.Scanner;
public class mapAndCombat{
    Scanner sc = new Scanner(System.in);
    public void combat(){
      playerStats ps = new playerStats();
      Main m = new Main();
      islandMethods im = new islandMethods();
      im.banditIsland(m);
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
            if(islandChoice.equals("y")){
              System.out.println("\n----HEADING TO BANDIT ISLAND----");
              m.timeDelay();
              combat();
            }
        }
    }
    //Bandit Minion Combat Phase
    public void banditMinion(){
      playerStats ps = new playerStats();
      externalVariables ev = new externalVariables();
      shop s = new shop();
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println("----YOU ENCOUNTERED A BANDIT MINION----");
      while(true){
        System.out.println("Bandit Minion\nHealth: " + ps.banditHealth + "\nBounty: " + ps.banditBounty);
        System.out.println("\n" + ev.playerName + "\nHealth: " + ps.playerHealth + "\nBounty: " + ps.Bounty);
        if(s.devilFruitCounter == 0){
          System.out.println("\nWhat would you like to do?\n1.Attack (1)\n2.Defend (2)\n3.Run (3)");
        }
        else if(s.devilFruitCounter >= 1){
          System.out.println("\nWhat would you like to do?\n1.Attack (1)\n2.Defend (2)\n3.Run (3)\n4.Use Devil Fruit (4)");
        }
      }
    }
    //Bandit Boss Combat Phase
}
