import java.util.*;
class maxheightweight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n*2];
        for(int i=0; i<n*2; i++){
            a[i] = sc.nextInt();
        }
        int maxi_H = Integer.MIN_VALUE ;
        int maxi_W = Integer.MIN_VALUE ;
        for(int i=0; i<n*2; i=i+2){
            int height = a[i];
            int weight = a[i+1];
            maxi_H = Math.max(maxi_H, height);
            maxi_W = Math.max(maxi_W, weight);
        }
        System.out.println("Maximum height = "+maxi_H);
        System.out.println("Maximum weight = "+maxi_W);
    }
}