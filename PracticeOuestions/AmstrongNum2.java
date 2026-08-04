package PracticeOuestions;

// This is To find the amstrong number from 100 to 999
public class AmstrongNum2 {
    public static void main(String[] args) {
        for(int n = 100 ; n<=999;n++){
            int n1=n;
            int d1,d2,d3,n2=0;
            d1 = n1%10;
            n1 = n1/10;
            d2 = n1%10;
            n1=n1/10;
            d3=n1%10;
            n2 = (d1*d1*d1)+(d2*d2*d2)+(d3*d3*d3);
            if(n==n2)
                System.out.println(n+" is An Amstrong Number ");
        }
    }
    
}
