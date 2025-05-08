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
            if(sum >9 && n==0){
                n= sum;
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}