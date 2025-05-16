import java.util.*;
class mergeSortedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a[] = new int[n+100];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int m  = sc.nextInt();
        int b[] = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }
        int i = n-1;
        int j = m-1;
        int k = n+m-1;
        while(i>=0 && j>=0){
            if(a[i] > b[j]){
                a[k--] = a[i--];
            }
            else{
                a[k--] = b[j--];
            }
        }
        while(j>=0){
            a[k--] = b[j--];
        }

        for (int x = 0; x < n+m; x++) {
            System.out.print(a[x] + " ");
        }
    }
}