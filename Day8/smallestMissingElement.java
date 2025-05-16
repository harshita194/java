import java.util.*;
class smallestMissingElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = 1;
        for(int i=0; i<n; i++){
            if(a[i] <= 0) continue;
            if(a[i] == ans){
                ans++;
            }
            else if(a[i] >= ans){
                break;
            }
        }
        System.out.println("Missing No. : "+ans);
    }
}