package PracticeOuestions;
import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Table :");
        int t = scan.nextInt();
        System.out.println("Enter The Limit :");
        int n = scan.nextInt();

        for(int i =1 ;i<=n;i++){
            System.out.println(i+" x "+t+" = "+(t*i));
        }
        
    }
    
}
