import java.util.*;
class maxi_mini_container{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        
        }
        Arrays.sort(a);
        int s = 0;
        int e = n-1;
        while(s<e){
            System.out.println(a[e]+" "+a[s]);
            s++;
            e--;
        }
        
        if(n%2 != 0){
            System.out.println(a[e]+" "+"0");
        }
        
    }
}