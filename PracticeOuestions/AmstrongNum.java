package PracticeOuestions;

import java.util.Scanner;

public class AmstrongNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = scan.nextInt();
        int n1 = n;
        int d1,d2,d3,n2=0;
        d1 = n%10;
        n = n/10;
        d2 = n%10;
        n=n/10;
        d3=n%10;
        n2 = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
        if(n1==n2)
            System.out.println("This is An Amstrong Number ");
        else 
            System.out.println("This Is Not An Amstrong  Number");
    }
}
