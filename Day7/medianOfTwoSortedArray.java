import java.util.*;
class medianOfTwoSortedArray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int a[] = new int[n];
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
        int c[] = new int[n+m];
        while(i>=0 && j>=0){
            if(a[i] > b[j]){
                c[k--] = a[i--];
            }
            else{
                c[k--] = b[j--];
            }
        }

        while (i >= 0) {
            c[k--] = a[i--];
        }

        while(j>=0){
            c[k--] = b[j--];
        }

        // for (int x = 0; x < n+m; x++) {
        //     System.out.print(a[x] + " ");
        // }
        
        // // int total = k;
        // if (k % 2 == 0) {
        //     return (c[k / 2 - 1] + c[k / 2]) / 2.0;
        // } else {
        //     return c[k / 2];
        // }

        int len = n + m;
        double median;
        if (len % 2 == 0) {
            median = (c[len / 2 - 1] + c[len / 2]) / 2.0;
        } else {
            median = c[len / 2];
        }

        System.out.println("Merged Array: " + Arrays.toString(c));
        System.out.println("Median: " + median);

    }
}