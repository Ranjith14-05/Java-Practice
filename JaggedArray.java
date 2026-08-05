public class JaggedArray {
    public static void main(String[] args) {
        //A Jagged Array is an array of arrays where each row can have a different number of columns.

        int a[][]={
            {10,20,30,40},
            {50,60,70},
            {80,90,100,110}
        };

        //Accesing With For Loop
        for(int i  =0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }

            // Accessing using Enhanced for loop 
            for(int[] i:a){
                for(int val:i){
                    System.out.print(val+" ");
                }
                System.out.println("");
            }

    }
}
