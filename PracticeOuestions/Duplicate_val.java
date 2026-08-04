package PracticeOuestions;

public class Duplicate_val {
    //This Program to find the duploicate values in the array
    public static void main(String[] args) {
        int a[]={1,2,2,3,4,5,5,3};

        for(int i  =0;i<a.length;i++){
            for(int j =i+1;j<a.length;j++){
                if(a[i]==a[j] && i!=j){
                    System.out.println("Duplicate Element : " + a[i]);
                }
            }
        }
    }
}
