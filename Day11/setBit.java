import java.util.*;
class setBit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j=0;
        boolean result = true;
        while(n!=0 && j<=i){
            int digit = n%10;
            if(j==i && digit == 1){
                result = true;
            }
            else{
                result = false;
            }
            j++;
            n/=10;
        }
        if(result==true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}