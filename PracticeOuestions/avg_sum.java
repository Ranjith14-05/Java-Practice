package PracticeOuestions;

import java.util.Scanner;

public class avg_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Limit :");
        int n = scan.nextInt();
        int sum = 0;
        int num;
        for(int i =1;i<=n;i++){
            System.out.println("Enter Number "+i+" :");
            num=scan.nextInt();
            sum +=num;
        }
        System.out.println("The Sum Of Given Number is :" + sum);
        System.out.println("The Average of Given Numbers is :"+sum/n);
        scan.close();
    }
}
