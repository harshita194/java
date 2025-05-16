import java.util.*;
class countBuses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int capacity = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int count =0;
        for(int i=0; i<n; i++){
            if(a[i] < capacity){
                count++;
            }
            else if(a[i] < capacity && a[i] + a[i+1]<= capacity){
                count++;
            }
        }
        System.out.println("No. of Buses = "+count);
    }
}