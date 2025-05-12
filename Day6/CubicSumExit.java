import java.util.*;
class CubicSumExit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            int b = a[i];
            int x = 1;
            int y = (int)Math.cbrt(b);
            while(x<=y){
                int ans = (int)Math.pow(x,3) + (int)Math.pow(y,3);
                if(ans < b){
                    x++;
                }
                else if(ans == b){
                    System.out.println("Good Integer: "+ans);
                    count++;
                    break;
                }
                else if(ans > b){
                    break;
                }
            }
        }
        System.out.println("count "+count);
   }
}