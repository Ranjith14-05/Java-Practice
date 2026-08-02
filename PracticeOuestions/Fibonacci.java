package PracticeOuestions;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = -1,b=1,c;
        System.out.println("Enter Limit :");
        int n = scan.nextInt();
        for(int i = 1;i<=n;i++){
            c =  a+b ;
            System.out.println(c);
            a = b;
            b=c;
        }
        scan.close();
    }
}
