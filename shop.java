import java.util.Scanner;
public class shop{
    externalVariables ev = new externalVariables();
    Scanner sc = new Scanner(System.in);
    public void playerShop(){
        while(true){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("Shop Keeper: Hello, If you looking for goods to be a great Marine....or Pirate then you have come to the right place.\nHere is my Current Stock");
            System.out.println("\n\n----{Shop Stock}----\n\n1.Sword [Out of Stock]\n2.Flintlock [Out of Stock]\n3.Mysterious Fruit [1,200]");
            System.out.println("\nWhat Would you like to buy? :");
        }
    }
}