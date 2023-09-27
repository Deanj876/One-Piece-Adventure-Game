import java.util.Scanner;
import java.lang.Math;

public class islandMethods{
  //int randomNum = (int) (Math.random() * (10 + 1));
  Scanner sc = new Scanner(System.in);
  Main m = new Main();
  externalVariables ev = new externalVariables();
  mapAndCombat mac = new mapAndCombat();
  String enemyEncounter = " ";
  //Random Encounter Generator
  void encounterRandomizer(){
    int randomEncounter = (int)(Math.random() * 3) + 1;
    if(randomEncounter == 1){
      enemyEncounter = "Boss";
    }
    else{
      enemyEncounter = "Minion";
    }
  }
  //Beginner / first combat island
  public void banditIsland(){
    while(true){
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println("----You have arrived at Bandit Island----");

      m.timeDelay();
      encounterRandomizer();
      //Bandit Combat
      if(enemyEncounter.equals("Boss")){
        //BOSS
      }
      else if(enemyEncounter.equals("Minion")){
        mac.banditMinion();
        System.out.println("Do you wish to continue exploring the island? (Y/N):");
        String contineChoice = sc.nextLine();
        if(contineChoice.equals("y") || contineChoice.equals("Y")){
          System.out.println("\n----You continue to explore the island.----");
        }
        else{
          System.out.println("\n----You leave the island.----");
          break;
        }
      }
      else{
        System.out.println("\n----You encountered no enemies thus far.----");
      }
    m.timeDelay();
    }
  }
}