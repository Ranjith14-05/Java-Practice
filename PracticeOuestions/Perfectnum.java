package PracticeOuestions;
import java.util.Scanner;

public class Perfectnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int n = scan.nextInt();
        int sum =0;
        for(int i =1 ;i<n;i++){
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
            System.out.println(n+" is A Perfect Number");
        else
            System.out.println(n+" is Not a Perfect Number");
    }
}
