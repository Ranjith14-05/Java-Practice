package PracticeOuestions;

public class Primenum2 {
    public static void main(String[] args) {
        //This Program is for Print Prime number form 1 to 999
        for(int i=1;i<=999;i++){
            int count=0;
            for (int j =1 ;j<=i;j++){
                if (i%j==0)
                    count++;
                
            }
            if(count==2)
                System.out.println(i + " is The Prime Number");
        
        }
    }
}
