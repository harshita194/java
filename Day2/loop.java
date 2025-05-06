import java.util.*;
class loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n!=1){
            if(n%2==0){
                n=n/2;
                System.out.println(n);
                count++;
            }
            else{
                n=(3*n)+1;
                System.out.println(n);
                count++;
            }
        }
        System.out.println("count: "+count);
    }
}