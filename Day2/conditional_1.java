import java.util.*;
public class conditional_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n >=10 && n <=99 ){
            if(n<=20){
                if(n%2==0){
                    System.out.println("Even");
                }
                else{
                    System.out.println("Odd");
                }
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}