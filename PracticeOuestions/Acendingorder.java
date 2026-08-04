package PracticeOuestions;
import java.util.Arrays;
public class Acendingorder {
    //Program To Rearrange the array to ascending order 
    public static void main(String[] args) {
        int temp;
        int a[]= {12,45,2,3,46,24,67,98};
        System.out.println("Befor Sort : "+ Arrays.toString(a));
        for(int i  =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Ater Sort : "+ Arrays.toString(a));
    }
    
}
