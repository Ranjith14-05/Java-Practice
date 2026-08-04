package PracticeOuestions;
import java.util.Scanner;

public class Strongnum {
    public static void main(String[] args) {
        int n,n1,rem,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The Number :");
        n = scan.nextInt();
        n1=n;
       while(n>0){
        rem=n%10;
        int fact=1;
        for(int i =1;i<=rem;i++){

            fact*=i;
        }
        sum+=fact;
        n=n/10;
       }
       if(sum==n1)
        System.out.println(n1 + " Is A Strong Number");
    else
        System.out.println(n1+" Is Not A Strong Number");
        
    }
}
