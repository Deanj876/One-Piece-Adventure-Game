import java.util.Scanner;

public class mapAndCombat{
    Scanner sc = new Scanner(System.in);
    public void map(){
        while(true){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.println("----Your current log post is pointing to a small island known as \"Bandit Island\".----");
        }
    }
    public void Combat(){
    }
}