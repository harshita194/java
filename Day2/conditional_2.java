import java.util.*;
public class conditional_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int middle = ((n/10) % 10);
        if(n>99 && n<=999 && middle % 3 == 0){
            System.out.println("Trendy Number");
        }
        else{
            System.out.println("Not a Trendy Number");
        }
    }
}