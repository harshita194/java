import java.util.*;
class checkCompatibleOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        int b[] = new int[n];
        for(int i=0; i<n;i++){
            b[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){
            if(a[i] < b[i]){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Compatible");
        }
        else{
            System.out.println("Not Compatible");
        }
   }
}