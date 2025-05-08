import java.util.*;
class Adam_number{

    static int reverse(int num){
        int reverse =0;
        int digit;
        while(num!=0){
            digit = num%10;
            reverse = reverse * 10 + digit;
            num/=10;
        }
        return reverse;
    } 

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqr = n*n;
        int rev = reverse(n);
        int square = rev * rev;
        int sqr_reverse = reverse(square);
        if(sqr == sqr_reverse){
            System.out.println("Adam number");
        }
        else{
            System.out.println("Not Adam number");
        }
    }   
}