import java.util.*;
class majorityElement{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int candidate =0;
        int count = 0;
        for(int num : a){
            if(count == 0){
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        System.out.println(candidate);

    }
}