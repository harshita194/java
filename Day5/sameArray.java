import java.util.*;
class sameArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum1 =0;
        int sum2 =0;
        int n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0; i<n;i++){
            arr1[i] = sc.nextInt();
            sum1 += arr1[i];
        }
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0; i<m;i++){
            arr2[i] = sc.nextInt();
            sum2 += arr2[i];
        }
        if(n == m && sum1 == sum2){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
   }
}