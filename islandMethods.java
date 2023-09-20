import java.util.Scanner;
import java.lang.Math;

public class islandMethods{
  //int randomNum = (int) (Math.random() * (10 + 1));
  Scanner sc = new Scanner(System.in);
  Main m = new Main();
  externalVariables ev = new externalVariables();
  mapAndCombat mac = new mapAndCombat();
  String enemyEncounter = " ";
  //Beginner / first combat island
  public void banditIsland(){
    while(true){
      System.out.print("\033[H\033[2J");  
      System.out.flush();
      System.out.println(ev.playerName + ": So this is the bandit island, Let's see what these guys are made of!");
      m.timeDelay();
      //Bandit Combat
      if(enemyEncounter.equals("Boss")){
        //Combat
      }
      else if(enemyEncounter.equals("Minion")){
        //Combat
      }
      else{
        System.out.println("\n----You encountered no enemies thus far.----");
      }
    m.timeDelay();
    }
  }
  void encounterRandomizer(){
    int randomEncounter = (int)(Math.random() * 5) + 1;
    if(randomEncounter % 2 == 0){
      enemyEncounter = "Boss";
    }
    else{
      enemyEncounter = "Minion";
    }
  }
}