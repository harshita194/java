import java.util.*;
public class sortArray{
    public static void main(String[] args){
        int arr[] = {1,4,2,6,3};
        int n = arr.length;
        for(int i =1; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  
                }
            }
        }
        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
   }
}