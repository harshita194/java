import java.util.*;
class sum_till_single_digit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        int sum =0;
        while(n!=0){
            digit = n%10;
            n/=10;
            sum += digit;
        }
        if(sum<=9){
            System.out.println(sum);
        }
        else{
            int ans = 0;
            while(sum !=0){
                int s_digit = sum%10;
                sum/=10;
                ans += s_digit;
            }
            System.out.println(ans);
        }
    }
}