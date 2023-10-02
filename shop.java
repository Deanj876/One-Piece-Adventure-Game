import java.util.Scanner;

public class shop extends Main{
    externalVariables ev = new externalVariables();
    int devilFruitCounter = 0;
    public class externalVariables {
        int belli;
        int bounty;
        int wantedLevel;
        int attack;
        int defense;
        int devilFruit;

        public externalVariables() {
            // Initialize variables here
            belli = 0;
            bounty = 0;
            wantedLevel = 0;
            attack = 0;
            defense = 0;
            devilFruit = 0;
        }
    }
    Main m = new Main();
    public void playerShop(){
        while(true){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("Shop Keeper: Hello, If you looking for goods to be a great Marine....or Pirate then you have come to the right place.\nHere is my Current Stock");
            System.out.println("\n\n----{Shop Stock}----\n\n1.Sword [Out of Stock]\n2.Flintlock [Out of Stock]\n3.Mysterious Fruit [1,200]");
            System.out.println("\nWhat Would you like to buy? (1 / 2 / 3) or Do you want to leave (4) :");
            Scanner sc = new Scanner(System.in);
            String itemChoice = sc.nextLine();
            if(itemChoice.equals("1") || itemChoice.equals("2")){
                System.out.println("\nShop Keeper: Sorry we don't currently have that in stock with all these mountain bandits around.");
            }
            else if(itemChoice.equals("3")){
                System.out.println("\nShop Keeper: So your looking for a fruit ay...Let's so how much you got.");
                m.timeDelay();
                if(ev.belli == 1200){
                    System.out.println("\nShop Keeper: Looks like you got enough here is your fruit kid but don't tell nobody you got if from here especially a marine.");
                    devilFruitCounter += 1;
                }
                else{
                    System.out.println("\nShop Keeper: Looks like you don't got enough kid, better lukc next time.\nAnything else you might want.");
                }
            }
            else if(itemChoice.equals("4")){
                System.out.println("\nShop Keeper: Well see you anound kid, come back when you have some more money or a high enough bounty.");
                break;
            }
            else{
                System.out.println("\nShop Keeper: Sorry what was that?");
            }
            m.timeDelay();
        }
    }
}

// class shop {
//     private PlayerStats playerStats;

//     public shop(PlayerStats playerStats) {
//         this.playerStats = playerStats;
//     }

//     public void buyItem() {
//         // Shop logic
//         playerStats.setAttack(playerStats.getAttack() + 5);
//     }
// }