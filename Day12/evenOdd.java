import java.util.*;
class evenOdd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n&1;
        if(ans == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}