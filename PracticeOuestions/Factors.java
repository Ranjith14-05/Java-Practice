package PracticeOuestions;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = scan.nextInt();
        System.out.print("The Facors of "+n+" is ");
        for (int i= 1;i<=n;i++){
            if (n%i==0)
                System.out.print(i+",");
        }
        System.out.println(); // For the line after output
    }    
}
