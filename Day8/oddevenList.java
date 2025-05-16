import java.util.*;
class oddevenList{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        // Approach-1 
        // for(int i=0; i<n; i++){
        //     if(a[i]%2==0){
        //         System.out.print(a[i] + " ");
        //     }
        // }
        // for(int i=0; i<n; i++){
        //     if(a[i]%2==1){
        //         System.out.print(a[i] + " ");
        //     }
        // }
        int i = 0;
        int j = n-1;
        // Approach-2
        // while(i<j){
        //     while(i < j && a[i] % 2 == 0) i++;
            
        //     while(i < j && a[j] % 2 != 0) j--;

        //     if(i<j){
        //         int temp = a[i];
        //         a[i] = a[j];
        //         a[j] = temp;
        //     }
        // }
        
        // Approach-3
        while(i<j){
            if(a[i]%2 != 0 && a[j]%2 == 0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            else if(a[i]%2 == 0){
                i++;
            }
            else if(a[i]%2 != 0){
                j--;
            }
        }
        
        for(int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }

    }
}