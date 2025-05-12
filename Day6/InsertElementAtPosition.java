import java.util.*;
class InsertElementAtPosition{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int pos = sc.nextInt(); 
        int element = sc.nextInt();
        int[] temp = new int[a.length + 1];
        for(int i=0,j=0; i<a.length; i++){
            if(i == pos-1){
                // a[i] = element;
                System.out.print(element+" ");
            }
            // else{
            //     temp[i] = a[j];
            //     j++;
            // }
            System.out.print(a[i]+" ");
        }
        // for(int i=0; i<temp.length; i++){
        //     System.out.print(temp[i]+" ");
        // }
   }
}