package PracticeOuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = scan.nextInt();
        int f=1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
        System.out.println("The Factorial of " + n + " is " + f);
        scan.close();
    }
}
